package br.com.cefet.banco.apresentacao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.cefet.banco.negocio.Caixa;

public class TelaAlterarSenhaTest {

	TelaAlterarSenha tela;

	// t�cnica de percorrer os caminhos b�sicos
	@Before
	public void inicializaTest() {
		Caixa caixa = new Caixa("nome", "endere�o", "", "", "", "", 1500);
		this.tela = new TelaAlterarSenha(caixa);
	}
	
	@Test
	public void testeQualquer() {
		
	}

}
