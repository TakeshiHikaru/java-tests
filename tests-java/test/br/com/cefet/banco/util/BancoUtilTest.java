package br.com.cefet.banco.util;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.cefet.banco.negocio.Autenticavel;
import br.com.cefet.banco.util.BancoUtil;

public class BancoUtilTest {

	@Test
	public void testAcessoIlegal() {
		Autenticavel a = BancoUtil.realizarLogin("", "");
		assertEquals(null,a);
	}
	
	@Test
	public void testUsuarioEhGerente() {
		Autenticavel a = BancoUtil.realizarLogin("gerente", "gerente");
		assertTrue(BancoUtil.usuarioEhGerente(a));
	}

}