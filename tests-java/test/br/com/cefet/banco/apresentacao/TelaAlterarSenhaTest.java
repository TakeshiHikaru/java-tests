package br.com.cefet.banco.apresentacao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.cefet.banco.negocio.Caixa;

public class TelaAlterarSenhaTest {

	TelaAlterarSenha tela;

	// técnica de percorrer os caminhos básicos
	@Test
	public void testeInicializaTelaComUsuarioLogado() {
		Caixa caixa = new Caixa("nome", "endereço", "", "", "", "", 1500);
		this.tela = new TelaAlterarSenha(caixa);
		assertEquals(caixa, tela.getUsuarioLogado());
	}

}
