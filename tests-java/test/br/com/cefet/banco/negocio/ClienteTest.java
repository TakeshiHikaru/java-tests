package br.com.cefet.banco.negocio;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClienteTest {

	// teste utilizando t�cnica dos caminhos b�sicos
	@Test
	public void testaFuncionamentoMudarCpfObjetoCliente() {
		Cliente cliente = new Cliente("cliente", "", "", "", "");
		cliente.setCpf("111.111.111-11");
		assertEquals("111.111.111-11", cliente.getCpf());
	}
	
	// teste utilizando t�cnica dos caminhos b�sicos e decis�es
	@Test
	public void testaFuncionamentoMudarCpfInvalidoObjetoCliente() {
		Cliente cliente = new Cliente("cliente", "", "", "", "");
		cliente.setCpf("aksljdalskdj");
		assertEquals("Invalido", cliente.getCpf());
	}
	
	// teste utilizando t�cnica dos caminhos b�sicos
	@Test
	public void testaFuncionamentoMudarEnderecoObjetoCliente() {
		Cliente cliente = new Cliente("cliente", "", "", "", "");
		cliente.setEndereco("endere�o teste");
		assertEquals("endere�o teste", cliente.getEndereco());
	}
	
	// teste utilizando t�cnica dos caminhos b�sicos
	@Test
	public void testaFuncionamentoMudarUsuarioObjetoCliente() {
		Cliente cliente = new Cliente("cliente", "", "", "", "");
		cliente.setUsuario("usuarioteste");
		assertEquals("usuarioteste", cliente.getUsuario());
	}
	
	// teste utilizando t�cnica dos caminhos b�sicos e decis�es
	@Test
	public void testaFuncionamentoLoginSenhaValidaCliente() {
		Cliente cliente = new Cliente("cliente", "", "", "", "");
		cliente.setSenha("senhateste");
		assertEquals(true, cliente.autenticar("senhateste"));
	}
	
	// teste utilizando t�cnica dos caminhos b�sicos e decis�es
	@Test
	public void testaFuncionamentoLoginSenhaInvalidaCliente() {
		Cliente cliente = new Cliente("cliente", "", "", "", "");
		cliente.setSenha("senhateste");
		assertEquals(false, cliente.autenticar("senhaTeste"));
	}

}
