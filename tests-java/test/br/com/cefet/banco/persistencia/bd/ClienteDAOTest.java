package br.com.cefet.banco.persistencia.bd;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.cefet.banco.negocio.Caixa;
import br.com.cefet.banco.negocio.Cliente;

public class ClienteDAOTest {

	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testBuscaClientePeloId() {
		ClienteDAO dao = new ClienteDAO();
		Cliente cliente = dao.getCliente(1);
		assertEquals("Nome", cliente.getNome());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testBuscaClientePeloUsuario() {
		ClienteDAO dao = new ClienteDAO();
		Cliente cliente = dao.getCliente("userTest");
		assertEquals("Nome", cliente.getNome());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos 
	// N�O FUNCIONANDO
	@Test
	public void testExclusaoUsuario() {
		ClienteDAO dao = new ClienteDAO();
		Cliente clienteTest = new Cliente("cliente exclusao", "endere�o", "111.111.111-11", "clienteexclusao", "clienteexclusao");
		dao.adicionaCliente(clienteTest);
		Cliente cliente = dao.getCliente("clienteexclusao");
		dao.remove(cliente);
		assertNull(dao.getCliente("cliente exclus�o"));
	}


}
