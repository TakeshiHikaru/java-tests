package br.com.cefet.banco.negocio;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClienteTest {

	// teste utilizando técnica dos caminhos básicos
	@Test
	public void testaFuncionamentoMudarCpfObjetoCliente() {
		Cliente cliente = new Cliente("cliente", "", "", "", "");
		cliente.setCpf("111.111.111-11");
		assertEquals("111.111.111-11", cliente.getCpf());
	}
	
	// teste utilizando técnica dos caminhos básicos e decisões
	@Test
	public void testaFuncionamentoMudarCpfInvalidoObjetoCliente() {
		Cliente cliente = new Cliente("cliente", "", "", "", "");
		cliente.setCpf("aksljdalskdj");
		assertEquals("Invalido", cliente.getCpf());
	}
	
	// teste utilizando técnica dos caminhos básicos
	@Test
	public void testaFuncionamentoMudarEnderecoObjetoCliente() {
		Cliente cliente = new Cliente("cliente", "", "", "", "");
		cliente.setEndereco("endereço teste");
		assertEquals("endereço teste", cliente.getEndereco());
	}
	
	// teste utilizando técnica dos caminhos básicos
	@Test
	public void testaFuncionamentoMudarUsuarioObjetoCliente() {
		Cliente cliente = new Cliente("cliente", "", "", "", "");
		cliente.setUsuario("usuarioteste");
		assertEquals("usuarioteste", cliente.getUsuario());
	}
	
	// teste utilizando técnica dos caminhos básicos e decisões
	@Test
	public void testaFuncionamentoLoginSenhaValidaCliente() {
		Cliente cliente = new Cliente("cliente", "", "", "", "");
		cliente.setSenha("senhateste");
		assertEquals(true, cliente.autenticar("senhateste"));
	}
	
	// teste utilizando técnica dos caminhos básicos e decisões
	@Test
	public void testaFuncionamentoLoginSenhaInvalidaCliente() {
		Cliente cliente = new Cliente("cliente", "", "", "", "");
		cliente.setSenha("senhateste");
		assertEquals(false, cliente.autenticar("senhaTeste"));
	}

}
