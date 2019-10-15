package br.com.cefet.banco.persistencia.bd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.cefet.banco.negocio.Cliente;

public class ClienteDAOTest {
	
	ClienteDAO clienteDAO;
	
	@Before
	public void inicializaConta() {
		this.clienteDAO = new ClienteDAO();
	}

	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testBuscaClientePeloId() {
		Cliente cliente = this.clienteDAO.getCliente(1);
		assertEquals("clienteTest", cliente.getNome());
	}
	
	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testBuscaClientePeloNome() {
		Cliente cliente = this.clienteDAO.getCliente("userTest");
		assertEquals("Nome", cliente.getNome());
	}
	
	// Utilizando a técnica dos caminhos básicos 
	@Test
	public void testExclusaoCliente() {
		Cliente clienteTest = new Cliente("cliente exclusao", "endereço", "111.111.111-11", "clienteexclusao", "clienteexclusao");
		this.clienteDAO.adicionaCliente(clienteTest);
		Cliente cliente = this.clienteDAO.getCliente("clienteexclusao");
		this.clienteDAO.remove(cliente);
		assertNull(this.clienteDAO.getCliente("clienteexclusao"));
	}
	
	// Utilizando a técnica dos caminhos básicos 
	// Lista não pode ser vazia por quê o banco já vai ter alguns dados de cliente
	@Test
	public void testObentacaoListaClientes() {
		ClienteDAO dao = new ClienteDAO();
		assertTrue(!dao.getListaClientes().isEmpty());
	}
	
	// Utilizando a técnica dos caminhos básicos 
	@Test
	public void testAlteracaoDeCliente() {
		Cliente cliente = this.clienteDAO.getCliente(2);
		cliente.setNome("teste alteração");
		this.clienteDAO.altera(cliente);
		Cliente clienteAlterado = this.clienteDAO.getCliente(2);
		assertEquals("teste alteração", clienteAlterado.getNome());
	}


}
