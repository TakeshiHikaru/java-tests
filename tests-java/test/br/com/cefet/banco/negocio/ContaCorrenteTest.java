package br.com.cefet.banco.negocio;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.cefet.banco.exceptions.DepositoInvalidoException;
import br.com.cefet.banco.exceptions.SaldoInsuficienteException;


public class ContaCorrenteTest {

	ContaCorrente conta;
	@Before
	public void inicializaTest() {
		this.conta = new ContaCorrente(2000);
	}
	
	// Teste utilizando a técnica de critério de decisões
	@Test
	public void testaSaqueContaComValorValido() {
		try {
			this.conta.sacar(1800);
			assertEquals(200, this.conta.getSaldo(), 0.001);
		} catch (SaldoInsuficienteException e) {
		}
	}
	
	// Teste utilizando a técnica de critério de decisões
	@Test(expected = SaldoInsuficienteException.class)
	public void testaSaqueContaComValorInvValido() throws SaldoInsuficienteException {
		try {
			this.conta.sacar(3001);
		} catch (SaldoInsuficienteException e) {
			throw e;
		}
	}
	
	// Teste utilizando a técnica de critério de decisões
	@Test
	public void testaDepositoContaComValorValido() {
		try {
			this.conta.depositar(1500);
			assertEquals(3500, this.conta.getSaldo(), 0.0001);
		} catch (DepositoInvalidoException e) {
		}
	}
	
	
	// Teste utilizando a técnica de critério de decisões
	@Test(expected = DepositoInvalidoException.class)
	public void testaDepositoContaComValorInvalido() throws DepositoInvalidoException {
		try {
			this.conta.depositar(-1);
		} catch (DepositoInvalidoException e) {
			throw e;
		}
	}
	
	// Teste utilizando a técnica de critério de decisões
	@Test
	public void testaTransferenciaContaComValorValido() {
		ContaCorrente conta = new ContaCorrente(1500);
		ContaCorrente contaDestino = new ContaCorrente(100);
		conta.transferir(contaDestino, 1000);
		assertEquals(1100, contaDestino.getSaldo(), 0.0001);
		assertEquals(500, conta.getSaldo(), 0.0001);
	}
	
	
	// Teste utilizando a técnica de critério de decisões
	@Test
	public void testaTransferenciaContaComValorInvalido() throws DepositoInvalidoException {
		ContaCorrente conta = new ContaCorrente(1500);
		ContaCorrente contaDestino = new ContaCorrente(100);
		conta.transferir(contaDestino, 1600);
	}
	
	// Teste utilizando a técnica do critério de decisões
	@Test
	public void testaCadastroTipoContaComGetTipoString() {
		this.conta.setTipo(0);
		assertEquals("Conta corrente", this.conta.getTipoStr());
	}
	
	
	// Teste utilizando a técnica dos caminhos básicos
	@Test
	public void testaAplicacaoTaxaContaCorrente() {
		ContaCorrente conta = new ContaCorrente(1500);
		conta.atualiza(100);
		assertEquals(1300, conta.getSaldo(), 0.0001);
	}
	
	// Teste utilizando a técnica dos caminhos básicos
	@Test
	public void testaContaCorrentComLimiteInicial() {
		ContaCorrente conta = new ContaCorrente(1000,2000);
		assertEquals(1000, conta.getSaldo(), 0.0001);
		assertEquals(2000, conta.getLimite(), 0.0001);
	}
	
}
