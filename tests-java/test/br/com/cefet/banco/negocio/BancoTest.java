package br.com.cefet.banco.negocio;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.cefet.banco.negocio.Cliente;
import br.com.cefet.banco.negocio.Conta;
import br.com.cefet.banco.negocio.ContaCorrente;
import br.com.cefet.banco.persistencia.bd.ClienteDAO;
import br.com.cefet.banco.persistencia.bd.ContaDAO;

public class BancoTest {
	Cliente titular;
	Conta conta;
	Funcionario funcionario;
	ClienteDAO daoCli = new ClienteDAO();
	ContaDAO daoCon = new ContaDAO();

	@Before
	public void inicializaConta() {
		this.titular = new Cliente("Nome","1234567890123","Endereco","userTestBanco","senhaTestBanco");
		
		this.conta = new ContaCorrente(-500);
		this.conta.setTitular(this.titular);
		
		this.funcionario = new Gerente("ger","ger","ger","ger","ger","ger",200000);
		
		if(this.daoCli.getCliente("userTestBanco")==null) {
			this.daoCli.adicionaCliente(this.titular);
		}
		this.daoCon.adicionaConta(this.conta);
	}
	
	//LG = limite máximo geral
	/* RT(receita total do banco), caso GPC(gasto por cliente) > RPF(receita por funcionario) e RT > GT(gasto total do banco)
	 * RT/TC(total de clientes), caso contrário
	 * */
	//LI = limite máximo individual
	/* LA(limite atual do cliente)*10, caso S(saldo atual)>SM(saldo médio)*10 e cliente possui conta corrente
	 * LA*5, caso S>SM*5 e cliente possui conta corrente
	 * LA*2, caso S>SM*2 e cliente possui conta poupanca ou S+LA>LA*2
	 * LA+S, caso contrário
	 * */
	//GPC = gasto por cliente
	/* GT(gasto total do banco)/TC(total de clientes no banco)
	 * */
	//RPF = receita por funcionario
	/* RT(receita total do banco)/TF(total de funcionarios no banco)
	 * */
	//SM = saldo médio
	/* RT(receita total do banco)/TC(total de clientes no banco)
	 * */
	
	//teste utilizando técnica de todas as decisões
	@Test
	public void limiteMaximoComSaldoMenorQueZeroDeveSerLimiteAtual() {
		this.conta.setLimite(200);
		double atual = this.conta.getLimite();
		Banco banco = new Banco();
		assertEquals(atual,banco.calcularLimiteMaximo(this.conta),0.1);
	}
	
	//teste utilizando técnica de todas as decisões
	//CASO DE TESTE 1: LG = RT/TC e LI = LA*2
	@Test
	public void limiteMaximoComSaldoMaiorQueZeroDeveSerOMaiorEntreLIeLGC1() {
		this.conta.setSaldo(500);
		this.conta.setLimite(100);
		Banco banco = new Banco();
		double RT = banco.calcularSaldoTotal();
		double GT = banco.calcularTotalDeGastos();
		int TC = banco.getClientes().size();
		double LA = this.conta.getLimite();
		double S = this.conta.getSaldo();
		int TF = banco.getFuncionarios().size();
		double GPC = GT/TC;
		double RPF = RT/TF;
		double SM = RT/TC;
		double LG = 0;
		double LI = 0;
		if(!(GPC>RPF && RT>GT)) {
			LG = RT/TC;
		}
		if((S>SM*2 && this.conta.getTipo()==1)||S+LA>LA*2) {//poupanca
			LI = LA*2;
		}
		assertEquals(Math.max(LI,LG),banco.calcularLimiteMaximo(this.conta),0.1);
	}
	
	//teste utilizando técnica de todas as decisões
	//CASO DE TESTE 2: LG = RT e LI = LA+S
	@Test
	public void limiteMaximoComSaldoMaiorQueZeroDeveSerOMaiorEntreLIeLGC2() {
		this.conta.setSaldo(500000);
		this.conta.setLimite(3000000);
		Banco banco = new Banco();
		banco.adicionarConta(this.conta);
		banco.contratarFuncionario(this.funcionario);
		banco.contratarFuncionario(this.funcionario);
		double RT = banco.calcularSaldoTotal();
		double GT = banco.calcularTotalDeGastos();		
		int TC = banco.getClientes().size();
		double LA = this.conta.getLimite();
		double S = this.conta.getSaldo();
		int TF = banco.getFuncionarios().size();
		double GPC = GT/TC;
		double RPF = RT/TF;
		double LG = 0;
		double LI = 0;
		if(GPC>RPF && RT>GT) {
			LG = RT;
		}
		LI = LA+S;
		assertEquals(Math.max(LI,LG),banco.calcularLimiteMaximo(this.conta),0.1);
	}
	
	//teste utilizando técnica de todas as decisões
	//CASO DE TESTE 3: LI = LA*10
	@Test
	public void limiteMaximoComSaldoMaiorQueZeroDeveSerOMaiorEntreLIeLGC3() {
		this.conta.setSaldo(100);
		Conta conta2 = new ContaCorrente(100);
		conta2.setTitular(this.titular);
		this.daoCon.adicionaConta(conta2);
		Banco banco = new Banco();
		banco.adicionarConta(conta2);
		banco.adicionarConta(this.conta);
		banco.contratarFuncionario(this.funcionario);
		banco.contratarFuncionario(this.funcionario);
		double RT = banco.calcularSaldoTotal();
		double GT = banco.calcularTotalDeGastos();		
		int TC = banco.getClientes().size();
		double LA = conta2.getLimite();
		double S = conta2.getSaldo();
		int TF = banco.getFuncionarios().size();
		double GPC = GT/TC;
		double RPF = RT/TF;
		double SM = RT/TC;
		double LG = 0;
		double LI = 0;
		if(GPC>RPF && RT>GT) {
			LG = RT;
		}else {
			LG = RT/TC;
		}
		if(S>SM*10 && this.conta.getTipo()==0) {//corrente
			LI = LA*10;
		}
		assertEquals(Math.max(LI,LG),banco.calcularLimiteMaximo(this.conta),0.1);
	}
	
	//teste utilizando técnica de todas as decisões
	//CASO DE TESTE 4: LI = LA*5
	@Test
	public void limiteMaximoComSaldoMaiorQueZeroDeveSerOMaiorEntreLIeLGC4() {
		this.conta.setSaldo(-350);
		Conta conta2 = new ContaCorrente(1000);
		conta2.setTitular(this.titular);
		conta2.setLimite(500);
		this.daoCon.adicionaConta(conta2);
		Banco banco = new Banco();
		banco.adicionarConta(conta2);
		banco.adicionarConta(this.conta);
		banco.contratarFuncionario(this.funcionario);
		banco.contratarFuncionario(this.funcionario);
		double RT = banco.calcularSaldoTotal();
		double GT = banco.calcularTotalDeGastos();		
		int TC = banco.getClientes().size();
		double LA = conta2.getLimite();
		double S = conta2.getSaldo();
		int TF = banco.getFuncionarios().size();
		double GPC = GT/TC;
		double RPF = RT/TF;
		double SM = RT/TC;
		double LG = 0;
		double LI = 0;
		if(GPC>RPF && RT>GT) {
			LG = RT;
		}else {
			LG = RT/TC;
		}
		if(S>SM*5 && this.conta.getTipo()==0) {//corrente
			LI = LA*5;
		}
		assertEquals(Math.max(LI,LG),banco.calcularLimiteMaximo(conta2),0.1);
	}

}
