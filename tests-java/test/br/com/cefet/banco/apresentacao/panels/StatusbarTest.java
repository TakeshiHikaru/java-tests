package br.com.cefet.banco.apresentacao.panels;

import static org.junit.Assert.*;

import org.junit.Test;

public class StatusbarTest {

	//t�cnica dos caminhos b�sicos
	@Test
	public void testCria��oEObtencaoNomeUsuarioStatusBar() {
		StatusBar statusBar = new StatusBar("teste");
		assertEquals("teste", statusBar.getNomeUsuario());
	}

}
