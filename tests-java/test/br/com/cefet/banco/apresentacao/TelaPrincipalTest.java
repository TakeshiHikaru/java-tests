package br.com.cefet.banco.apresentacao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.cefet.banco.negocio.Caixa;
import br.com.cefet.banco.negocio.Cliente;
import br.com.cefet.banco.negocio.Conta;
import br.com.cefet.banco.negocio.ContaPoupanca;
import br.com.cefet.banco.negocio.Diretor;
import br.com.cefet.banco.negocio.Gerente;
import br.com.cefet.banco.persistencia.bd.ClienteDAO;
import br.com.cefet.banco.persistencia.bd.ContaDAO;

public class TelaPrincipalTest {

	
	// teste utilizando técnica de todas as decisões
	@Test
	public void testaCriacaoTelaPrincipalUsuarioCliente() {
		Cliente cliente = new Cliente("cliente", "", "", "", "");
		Conta conta = new ContaPoupanca(500);
		conta.setTitular(cliente);
		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.adicionaCliente(cliente);
		ContaDAO contaDAO = new ContaDAO();
		contaDAO.adicionaConta(conta);
		TelaPrincipal tela = new TelaPrincipal(cliente);
		assertEquals("cliente", tela.getNomeUsuario());
	}
	
	// teste utilizando técnica dos caminhos básicos e todas as decisões
	@Test
	public void testaCriacaoTelaPrincipalUsuarioCaixa() {
		Caixa caixa = new Caixa("caixa", "", "", "", "" , "caixa", 1500);
		TelaPrincipal tela = new TelaPrincipal(caixa);
		assertEquals("caixa", tela.getNomeUsuario());
	}
	
	// teste utilizando técnica dos caminhos básicos e todas as decisões
	@Test
	public void testaCriacaoTelaPrincipalUsuarioGerente() {
		Gerente gerente = new Gerente("gerente", "", "", "", "" , "gerente", 5000);
		TelaPrincipal tela = new TelaPrincipal(gerente);
		assertEquals("gerente", tela.getNomeUsuario());
	}
	
	// teste utilizando técnica dos caminhos básicos e todas as decisões
	@Test
	public void testaCriacaoTelaPrincipalUsuarioDiretor() {
		Diretor diretor = new Diretor("diretor", "", "", "", "" , "diretor", 10000);
		TelaPrincipal tela = new TelaPrincipal(diretor);
		assertEquals("diretor", tela.getNomeUsuario());
	}

}
