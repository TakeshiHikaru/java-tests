package br.com.cefet.banco.negocio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BancoTest {
	
	/**
	 * Verificar se realmente o esperado e 1500 reais nesse caso
	 */
	@Test
	public void testCalculoLimiteMaximoContaPoupancaComLimiteInicial() {
		Banco banco = new Banco();
		Conta conta = new ContaPoupanca(1500.00, 1000.00);
		assertEquals(1000.00, banco.calcularLimiteMaximo(conta), 0.1);
	}
	
	/**
	 * Verificar se realmente o esperado é 1000 reais nesse caso
	 */
	@Test
	public void testCalculoLimiteMaximoContaPoupanca() {
		Banco banco = new Banco();
		Conta conta = new ContaPoupanca(1500.00);
		assertEquals(1000.00, banco.calcularLimiteMaximo(conta), 0.1);
	}
	
	/**
	 * Verificar se realmente o esperado e 1500 reais nesse caso
	 */
	@Test
	public void testCalculoLimiteMaximoContaCorrenteComLimiteInicial() {
		Banco banco = new Banco();
		Conta conta = new ContaCorrente(1500.00, 1000.00);
		assertEquals(1000.00, banco.calcularLimiteMaximo(conta), 0.1);
	}
	
	/**
	 * Verificar se realmente o esperado é 1000 reais nesse caso
	 */
	@Test
	public void testCalculoLimiteMaximoContaCorrente() {
		Banco banco = new Banco();
		Conta conta = new ContaCorrente(1500.00);
		assertEquals(1000.00, banco.calcularLimiteMaximo(conta), 0.1);
	}
	
	
}
