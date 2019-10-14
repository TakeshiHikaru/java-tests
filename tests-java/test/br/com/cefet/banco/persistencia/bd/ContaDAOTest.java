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
		this.titular = new Cliente("Nome","1234567890123","Endereco","user","senha");
		this.clienteDAO = new ClienteDAO();
		this.clienteDAO.adicionaCliente(this.titular);
		this.titular = this.clienteDAO.getCliente("user");
		
		this.contaCorrente = new ContaCorrente(123456);
		this.contaCorrente.setTitular(this.titular);
		
		this.contaPoupanca = new ContaPoupanca(1000);
		this.contaPoupanca.setTitular(this.titular);
		
		this.contaDAO = new ContaDAO();
	}
	
	//Teste com único caminho para insercao de conta
	@Test
	public void inserirContaCorrenteTest() {
		this.contaDAO.adicionaConta(this.contaCorrente);
		Conta contaTest = this.contaDAO.getContaDeCliente(this.titular);
		assertEquals(contaTest.getId(),1);
	}

}
