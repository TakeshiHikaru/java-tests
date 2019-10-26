package br.com.cefet.banco.negocio;

import static org.junit.Assert.*;

import org.junit.Test;

public class SistemaBancarioTest {

	// teste utilizando t�cnica dos caminhos b�sicos
	@Test
	public void testaLoginFuncionarioAutenticavelPeloSistemaBancario() {
		SistemaBancario sistema = new SistemaBancario();
		Caixa caixa = new Caixa("caixa", "endere�o", "", "", "senha", "caixa", 1500);
		sistema.login(caixa);
		assertEquals("caixa", caixa.getSenha());
	}

}
