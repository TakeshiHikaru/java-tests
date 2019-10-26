package br.com.cefet.banco.negocio;

import static org.junit.Assert.*;

import org.junit.Test;

public class EfetuaSaqueTest {

	// teste utilizando técnica de percorrer todos os caminhos básicos e valores limite
	@Test
	public void testEfetuaSaqueValidoQualquerContaCorrente() {
		ContaCorrente conta = new ContaCorrente(1000);
		EfetuaSaque saque = new EfetuaSaque(conta, 200.00);
		saque.run();
		assertEquals(800.00, saque.getConta().getSaldo(), 0.0001);
	}
	
	// teste utilizando técnica de percorrer todos os caminhos básicos e valores limite
	@Test
	public void testEfetuaSaqueAlemLimiteQualquerContaCorrente() {
		ContaCorrente conta = new ContaCorrente(1000);
		EfetuaSaque saque = new EfetuaSaque(conta, 1200.00);
		saque.run();
		assertEquals(1000, saque.getConta().getSaldo(), 0.0001);
	}

}
