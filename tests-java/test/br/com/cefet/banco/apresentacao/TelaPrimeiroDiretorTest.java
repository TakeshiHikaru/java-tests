package br.com.cefet.banco.apresentacao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.cefet.banco.negocio.Caixa;

public class TelaPrimeiroDiretorTest {

	TelaPrimeiroDiretor tela;

	// técnica de percorrer os caminhos básicos
	@Test
	public void testeInicializaTelaPrimeiroDiretor() {
		this.tela = new TelaPrimeiroDiretor();
	}

}
