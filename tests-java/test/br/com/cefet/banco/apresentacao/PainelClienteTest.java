package br.com.cefet.banco.apresentacao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.cefet.banco.negocio.Cliente;
import br.com.cefet.banco.persistencia.bd.ClienteDAO;

public class PainelClienteTest {


	ClienteDAO clienteDAO;
	
	@Before
	public void inicializaConta() {
		this.clienteDAO = new ClienteDAO();
	}
	
	// técnica de percorrer os caminhos básicos
	// TEM QUE TER UMA CONTA NO BANCO PARA ESSE CLIENTE 1 COM O NOME clienteTest
	@Test
	public void testaInicializacaoTelaCliente() {
		Cliente cliente = this.clienteDAO.getCliente(1);
		PainelCliente tela = new PainelCliente(cliente);
		assertEquals("clienteTest", tela.getClienteLogado().getNome());
	}
	
	
	// técnica de percorrer os caminhos básicos
	// TEM QUE TER UMA CONTA NO BANCO PARA ESSE CLIENTE COM VALOR 20
	@Test
	public void testaObtencaoContaCliente() {
		Cliente cliente = this.clienteDAO.getCliente(1);
		PainelCliente tela = new PainelCliente(cliente);
		assertEquals(20.0, tela.getConta().getSaldo(), 0.0001);
	}
	

}
