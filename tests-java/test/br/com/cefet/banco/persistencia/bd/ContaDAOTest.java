package br.com.cefet.banco.persistencia.bd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.cefet.banco.negocio.Cliente;
import br.com.cefet.banco.negocio.Conta;
import br.com.cefet.banco.negocio.ContaCorrente;
import br.com.cefet.banco.negocio.ContaPoupanca;

public class ContaDAOTest {
	Conta contaCorrente;
	Conta contaPoupanca;
	ContaDAO contaDAO;
	Cliente titular;
	ClienteDAO clienteDAO;
	
	//A tabela de contas deve estar vazia
	@Before
	public void inicializaConta() {
		
		this.titular = new Cliente("Nome","1234567890123","Endereco","userTest","senhaTest");
		this.clienteDAO = new ClienteDAO();
		this.clienteDAO.adicionaCliente(this.titular);
		this.titular = this.clienteDAO.getCliente("userTest");
		
		this.contaCorrente = new ContaCorrente(123456);
		this.contaCorrente.setTitular(this.titular);
		
		this.contaPoupanca = new ContaPoupanca(1000);
		this.contaPoupanca.setTitular(this.titular);
		
		this.contaDAO = new ContaDAO();
	}
	
	//Teste com único caminho para insercao de conta corrente
	@Test
	public void inserirContaCorrenteTest() {
		this.contaDAO.adicionaConta(this.contaCorrente);
		Conta contaTest = this.contaDAO.getConta(1);
		assertEquals(0,contaTest.getTipo());
	}
	
	//Teste com único caminho para insercao de conta poupanca
	@Test
	public void inserirContaPoupancaTest() {
		this.contaDAO.adicionaConta(this.contaPoupanca);
		Conta contaTest = this.contaDAO.getConta(2);
		assertEquals(1,contaTest.getTipo());
	}
	
	//Teste com único caminho para alteracao de conta
	@Test
	public void alterarContaTest() {
		double saldoEsperado = this.contaCorrente.getSaldo()-1000;
		this.contaCorrente.setSaldo(saldoEsperado);
		this.contaDAO.altera(this.contaCorrente);
		assertEquals(saldoEsperado,contaCorrente.getSaldo(),0.1);
	}
	
	//Teste com único caminho para remocao de conta
	//Ocorre um erro por, na insercao, o objeto não ser atualizado com o id que foi inserido no bd
	@Test
	public void removerContaTest() {
		this.contaDAO.remove(this.contaCorrente);
		this.contaDAO.remove(this.contaPoupanca);
		assertNull(this.contaDAO.getContaDeCliente(this.titular));
	}

}
