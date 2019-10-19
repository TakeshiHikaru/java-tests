package br.com.cefet.banco.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.cefet.banco.negocio.Autenticavel;
import br.com.cefet.banco.negocio.Caixa;
import br.com.cefet.banco.negocio.Cliente;
import br.com.cefet.banco.negocio.Diretor;
import br.com.cefet.banco.negocio.Gerente;
import br.com.cefet.banco.util.BancoUtil;

public class BancoUtilTest {

	
	// utilizando técnica dos caminhos básicos
	@Test
	public void testAcessoIlegal() {
		Autenticavel a = BancoUtil.realizarLogin("", "");
		assertEquals(null, a);
	}
	
	// utilizando técnica dos caminhos básicos
	@Test
	public void testUsuarioEhGerente() {
		Autenticavel a = BancoUtil.realizarLogin("gerente", "gerente");
		assertTrue(BancoUtil.usuarioEhGerente(a));
	}
	
	// utilizando técnica dos critérios das decisões
	@Test
	public void testPegarNomeUsuarioCLiente() {
		Cliente cliente = new Cliente("nomecliente", "", "", "", "");
		assertEquals("nomecliente", BancoUtil.pegarNomeUsuario(cliente));
	}
	
	// utilizando técnica dos critérios das decisões
	@Test
	public void testaPegarNomeUsuarioFuncionario() {
		Caixa caixa= new Caixa("caixa", "", "", "", "", "", 1500);
		assertEquals("caixa", BancoUtil.pegarNomeUsuario(caixa));
	}
	
	// utilizando técnica dos critérios das decisões
	@Test
	public void testaTipoUsuarioECaixa() {
		Caixa caixa = new Caixa("caixa", "", "", "", "", "", 1500);
		assertTrue(BancoUtil.usuarioEhCaixa(caixa));
	}
	
	// utilizando técnica dos critérios das decisões
	@Test
	public void testaTipoUsuarioECaixaSendoGerente() {
		Gerente gerente = new Gerente("gerente", "", "", "", "", "", 7000);
		assertTrue(!BancoUtil.usuarioEhCaixa(gerente));
	}
	
	// utilizando técnica dos critérios das decisões
	@Test
	public void testaTipoUsuarioEGerente() {
		Gerente gerente = new Gerente("gerente", "", "", "", "", "", 7000);
		assertTrue(BancoUtil.usuarioEhGerente(gerente));
	}
	
	// utilizando técnica dos critérios das decisões
	@Test
	public void testaTipoUsuarioEGerenteSendoCaixa() {
		Caixa caixa = new Caixa("caixa", "", "", "", "", "", 1500);
		assertTrue(!BancoUtil.usuarioEhGerente(caixa));
	}
	
	// utilizando técnica dos critérios das decisões
	@Test
	public void testaTipoUsuarioEDiretor() {
		Diretor diretor = new Diretor("diretor", "", "", "", "", "", 5000);
		assertTrue(BancoUtil.usuarioEhDiretor(diretor));
	}
	
	// utilizando técnica dos critérios das decisões
	@Test
	public void testaTipoUsuarioEDiretorSendoGerente() {
		Gerente gerente = new Gerente("gerente", "", "", "", "", "", 7000);
		assertTrue(!BancoUtil.usuarioEhDiretor(gerente));
	}
	
	// utilizando técnica dos critérios das decisões
	@Test
	public void testaTipoUsuarioECliente() {
		Cliente cliente = new Cliente("nomecliente", "", "", "", "");
		assertTrue(BancoUtil.usuarioEhCliente(cliente));
	}
	
	// utilizando técnica dos critérios das decisões
	@Test
	public void testaTipoUsuarioEClienteSendoGerente() {
		Gerente gerente = new Gerente("gerente", "", "", "", "", "", 7000);
		assertTrue(!BancoUtil.usuarioEhCliente(gerente));
	}
	
	// utilizando técnica dos critérios das decisões
	@Test
	public void testaConversaoDeSenha() {
		char [] array = new char[5];
		array[0] = 's';
		array[1] = 'e';
		array[2] = 'n';
		array[3] = 'h';
		array[4] = 'a';
		assertEquals("senha", BancoUtil.converteSenha(array));
	}
	
	// utilizando técnica dos critérios das decisões
	@Test
	public void testUsuarioClientePossuiFuncionalidadeDiretor() {
		Cliente cliente = new Cliente("nomecliente", "", "", "", "");
		assertTrue(!BancoUtil.possuiFuncionalidadesDiretor(cliente));
	}
	
	// utilizando técnica dos critérios das decisões
	@Test
	public void testUsuarioDiretorPossuiFuncionalidadeDiretor() {
		Diretor diretor = new Diretor("diretor", "", "", "", "", "", 5000);
		assertTrue(BancoUtil.possuiFuncionalidadesDiretor(diretor));
	}
	
	// utilizando técnica dos critérios das condições
	@Test
	public void testUsuarioClientePossuiFuncionalidadeGerente() {
		Cliente cliente = new Cliente("nomecliente", "", "", "", "");
		assertTrue(!BancoUtil.possuiFuncionalidadesGerente(cliente));
	}
	
	// utilizando técnica dos critérios das condições
	@Test
	public void testUsuarioGerentePossuiFuncionalidadeGerente() {
		Gerente gerente = new Gerente("gerente", "", "", "", "", "", 7000);
		assertTrue(BancoUtil.possuiFuncionalidadesGerente(gerente));
	}
	// utilizando técnica dos critérios das condições
	@Test
	public void testUsuarioDiretorPossuiFuncionalidadeGerentes() {
		Diretor diretor = new Diretor("gerente", "", "", "", "", "", 7000);
		assertTrue(BancoUtil.possuiFuncionalidadesGerente(diretor));
	}
	
	// utilizando técnica dos critérios das condições
	@Test
	public void testUsuarioDiretorPossuiFuncionalidadeCaixa() {
		Diretor diretor = new Diretor("diretor", "", "", "", "", "", 12000);
		assertTrue(BancoUtil.possuiFuncionalidadesCaixa(diretor));
	}
	
	// utilizando técnica dos critérios das condições
	@Test
	public void testUsuarioClientePossuiFuncionalidadeCaixa() {
		Cliente cliente = new Cliente("nomecliente", "", "", "", "");
		assertTrue(!BancoUtil.possuiFuncionalidadesCaixa(cliente));
	}
	
	// utilizando técnica dos critérios das condições
	@Test
	public void testUsuarioGerentePossuiFuncionalidadeCaixa() {
		Gerente gerente = new Gerente("gerente", "", "", "", "", "", 7000);
		assertTrue(BancoUtil.possuiFuncionalidadesCaixa(gerente));
	}
	
	// utilizando técnica dos critérios das condições
	@Test
	public void testUsuarioCaixaPossuiFuncionalidadeCaixa() {
		Caixa caixa = new Caixa("caixa", "", "", "", "", "", 1500);
		assertTrue(BancoUtil.possuiFuncionalidadesCaixa(caixa));
	}
	
	// utilizando técnica dos critérios das condições
	@Test
	public void testUsuarioDiretorPossuiFuncionalidadeGerente() {
		Diretor diretor = new Diretor("diretor", "", "", "", "", "", 12000);
		assertTrue(BancoUtil.possuiFuncionalidadesCaixa(diretor));
	}
	
		

}