package br.com.cefet.banco.apresentacao.panels;

import static org.junit.Assert.*;

import org.junit.Test;

public class StatusbarTest {

	//técnica dos caminhos básicos
	@Test
	public void testCriaçãoEObtencaoNomeUsuarioStatusBar() {
		StatusBar statusBar = new StatusBar("teste");
		assertEquals("teste", statusBar.getNomeUsuario());
	}

}
