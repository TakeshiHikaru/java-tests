package br.com.cefet.banco.negocio;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.cefet.banco.negocio.Cliente;
import br.com.cefet.banco.negocio.Conta;
import br.com.cefet.banco.negocio.ContaCorrente;

public class BancoTest {
	Conta conta;

	@Before
	public void inicializaConta() {
		Cliente titular = new Cliente("Nome","1234567890123","Endereco","userTest","senhaTest");
		
		this.conta = new ContaCorrente(-500);
		this.conta.setTitular(titular);
	}
	
	@Test
	public void limiteMaximoComSaldoMenorQueZeroDeveSerLimiteAtual() {
		double atual = this.conta.getLimite();
		Banco banco = new Banco();
		assertEquals(atual,banco.calcularLimiteMaximo(this.conta),0.1);
	}
	
	@Test
	public void limiteMaximoComSaldoMaiorQueZeroDeveSerOMaiorEntreLIeLG() {
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
		double atual = this.conta.getLimite();
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
		if(GPC>RPF && RT>GT) {
			LG = RT;
		}else {
			LG = RT/TC;
			if(Double.isNaN(LG)) {
				LG = 0;
			}
		}
		if(S>SM*10 && this.conta.getTipo()==0) {
			LI = LA*10;
		}else if(S>SM*5 && this.conta.getTipo()==0) {
			LI = LA*5;
		}else if((S>SM*2 && this.conta.getTipo()==1)||S+LA>LA*2) {
			LI = LA*2;
		}else {
			LI = LA+S;
		}
		assertEquals(Math.max(LI,LG),banco.calcularLimiteMaximo(this.conta),0.1);
	}

}
