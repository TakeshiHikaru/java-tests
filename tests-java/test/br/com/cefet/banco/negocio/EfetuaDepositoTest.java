package br.com.cefet.banco.negocio;

import static org.junit.Assert.*;

import org.junit.Test;

public class EfetuaDepositoTest {

	// teste utilizando técnica de percorrer todos os caminhos básicos e valores limite
	@Test
	public void testEfetuaDepositoValidoQualquerContaCorrente() {
		ContaCorrente conta = new ContaCorrente(1000);
		EfetuaDeposito deposito = new EfetuaDeposito(conta, 200.00);
		deposito.run();
		assertEquals(1200.00, deposito.getConta().getSaldo(), 0.0001);
	}
	
	// teste utilizando técnica de percorrer todos os caminhos básicos e valores limite
	@Test
	public void testEfetuaDepositoValorNegativoQualquerContaCorrente() {
		ContaCorrente conta = new ContaCorrente(1000);
		EfetuaDeposito deposito = new EfetuaDeposito(conta, -200.00);
		deposito.run();
		assertEquals(1000.00, deposito.getConta().getSaldo(), 0.0001);
	}

}
