package br.com.cefet.banco.apresentacao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.cefet.banco.negocio.Caixa;

public class TelaPrimeiroDiretorTest {

	TelaPrimeiroDiretor tela;

	// t�cnica de percorrer os caminhos b�sicos
	@Test
	public void testeInicializaTelaPrimeiroDiretor() {
		this.tela = new TelaPrimeiroDiretor();
	}

}
