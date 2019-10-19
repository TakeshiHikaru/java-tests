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

	
	// utilizando t�cnica dos caminhos b�sicos
	@Test
	public void testAcessoIlegal() {
		Autenticavel a = BancoUtil.realizarLogin("", "");
		assertEquals(null, a);
	}
	
	// utilizando t�cnica dos caminhos b�sicos
	@Test
	public void testUsuarioEhGerente() {
		Autenticavel a = BancoUtil.realizarLogin("gerente", "gerente");
		assertTrue(BancoUtil.usuarioEhGerente(a));
	}
	
	// utilizando t�cnica dos crit�rios das decis�es
	@Test
	public void testPegarNomeUsuarioCLiente() {
		Cliente cliente = new Cliente("nomecliente", "", "", "", "");
		assertEquals("nomecliente", BancoUtil.pegarNomeUsuario(cliente));
	}
	
	// utilizando t�cnica dos crit�rios das decis�es
	@Test
	public void testaPegarNomeUsuarioFuncionario() {
		Caixa caixa= new Caixa("caixa", "", "", "", "", "", 1500);
		assertEquals("caixa", BancoUtil.pegarNomeUsuario(caixa));
	}
	
	// utilizando t�cnica dos crit�rios das decis�es
	@Test
	public void testaTipoUsuarioECaixa() {
		Caixa caixa = new Caixa("caixa", "", "", "", "", "", 1500);
		assertTrue(BancoUtil.usuarioEhCaixa(caixa));
	}
	
	// utilizando t�cnica dos crit�rios das decis�es
	@Test
	public void testaTipoUsuarioECaixaSendoGerente() {
		Gerente gerente = new Gerente("gerente", "", "", "", "", "", 7000);
		assertTrue(!BancoUtil.usuarioEhCaixa(gerente));
	}
	
	// utilizando t�cnica dos crit�rios das decis�es
	@Test
	public void testaTipoUsuarioEGerente() {
		Gerente gerente = new Gerente("gerente", "", "", "", "", "", 7000);
		assertTrue(BancoUtil.usuarioEhGerente(gerente));
	}
	
	// utilizando t�cnica dos crit�rios das decis�es
	@Test
	public void testaTipoUsuarioEGerenteSendoCaixa() {
		Caixa caixa = new Caixa("caixa", "", "", "", "", "", 1500);
		assertTrue(!BancoUtil.usuarioEhGerente(caixa));
	}
	
	// utilizando t�cnica dos crit�rios das decis�es
	@Test
	public void testaTipoUsuarioEDiretor() {
		Diretor diretor = new Diretor("diretor", "", "", "", "", "", 5000);
		assertTrue(BancoUtil.usuarioEhDiretor(diretor));
	}
	
	// utilizando t�cnica dos crit�rios das decis�es
	@Test
	public void testaTipoUsuarioEDiretorSendoGerente() {
		Gerente gerente = new Gerente("gerente", "", "", "", "", "", 7000);
		assertTrue(!BancoUtil.usuarioEhDiretor(gerente));
	}
	
	// utilizando t�cnica dos crit�rios das decis�es
	@Test
	public void testaTipoUsuarioECliente() {
		Cliente cliente = new Cliente("nomecliente", "", "", "", "");
		assertTrue(BancoUtil.usuarioEhCliente(cliente));
	}
	
	// utilizando t�cnica dos crit�rios das decis�es
	@Test
	public void testaTipoUsuarioEClienteSendoGerente() {
		Gerente gerente = new Gerente("gerente", "", "", "", "", "", 7000);
		assertTrue(!BancoUtil.usuarioEhCliente(gerente));
	}
	
	// utilizando t�cnica dos crit�rios das decis�es
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
	
	// utilizando t�cnica dos crit�rios das decis�es
	@Test
	public void testUsuarioClientePossuiFuncionalidadeDiretor() {
		Cliente cliente = new Cliente("nomecliente", "", "", "", "");
		assertTrue(!BancoUtil.possuiFuncionalidadesDiretor(cliente));
	}
	
	// utilizando t�cnica dos crit�rios das decis�es
	@Test
	public void testUsuarioDiretorPossuiFuncionalidadeDiretor() {
		Diretor diretor = new Diretor("diretor", "", "", "", "", "", 5000);
		assertTrue(BancoUtil.possuiFuncionalidadesDiretor(diretor));
	}
	
	// utilizando t�cnica dos crit�rios das condi��es
	@Test
	public void testUsuarioClientePossuiFuncionalidadeGerente() {
		Cliente cliente = new Cliente("nomecliente", "", "", "", "");
		assertTrue(!BancoUtil.possuiFuncionalidadesGerente(cliente));
	}
	
	// utilizando t�cnica dos crit�rios das condi��es
	@Test
	public void testUsuarioGerentePossuiFuncionalidadeGerente() {
		Gerente gerente = new Gerente("gerente", "", "", "", "", "", 7000);
		assertTrue(BancoUtil.possuiFuncionalidadesGerente(gerente));
	}
	// utilizando t�cnica dos crit�rios das condi��es
	@Test
	public void testUsuarioDiretorPossuiFuncionalidadeGerentes() {
		Diretor diretor = new Diretor("gerente", "", "", "", "", "", 7000);
		assertTrue(BancoUtil.possuiFuncionalidadesGerente(diretor));
	}
	
	// utilizando t�cnica dos crit�rios das condi��es
	@Test
	public void testUsuarioDiretorPossuiFuncionalidadeCaixa() {
		Diretor diretor = new Diretor("diretor", "", "", "", "", "", 12000);
		assertTrue(BancoUtil.possuiFuncionalidadesCaixa(diretor));
	}
	
	// utilizando t�cnica dos crit�rios das condi��es
	@Test
	public void testUsuarioClientePossuiFuncionalidadeCaixa() {
		Cliente cliente = new Cliente("nomecliente", "", "", "", "");
		assertTrue(!BancoUtil.possuiFuncionalidadesCaixa(cliente));
	}
	
	// utilizando t�cnica dos crit�rios das condi��es
	@Test
	public void testUsuarioGerentePossuiFuncionalidadeCaixa() {
		Gerente gerente = new Gerente("gerente", "", "", "", "", "", 7000);
		assertTrue(BancoUtil.possuiFuncionalidadesCaixa(gerente));
	}
	
	// utilizando t�cnica dos crit�rios das condi��es
	@Test
	public void testUsuarioCaixaPossuiFuncionalidadeCaixa() {
		Caixa caixa = new Caixa("caixa", "", "", "", "", "", 1500);
		assertTrue(BancoUtil.possuiFuncionalidadesCaixa(caixa));
	}
	
	// utilizando t�cnica dos crit�rios das condi��es
	@Test
	public void testUsuarioDiretorPossuiFuncionalidadeGerente() {
		Diretor diretor = new Diretor("diretor", "", "", "", "", "", 12000);
		assertTrue(BancoUtil.possuiFuncionalidadesCaixa(diretor));
	}
	
		

}