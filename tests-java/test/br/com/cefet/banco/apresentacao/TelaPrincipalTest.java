package br.com.cefet.banco.apresentacao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.cefet.banco.negocio.Caixa;
import br.com.cefet.banco.negocio.Cliente;

public class TelaPrincipalTest {

	TelaPrincipal tela;

	// t�cnica de percorrer os caminhos b�sicos
	@Before
	public void inicializaTest() {
		Caixa caixa = new Caixa("caixa", "", "", "", "" , "", 1500);
		this.tela = new TelaPrincipal(caixa);
	}
	
	@Test
	public void testeQualquer() {
		
	}

}
