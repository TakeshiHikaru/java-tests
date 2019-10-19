package br.com.cefet.banco.negocio;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.cefet.banco.apresentacao.PainelCadastrarCliente;
import br.com.cefet.banco.exceptions.DepositoInvalidoException;
import br.com.cefet.banco.exceptions.SaldoInsuficienteException;

public class ContaPoupancaTest {

	ContaPoupanca conta;
	@Before
	public void inicializaTest() {
		this.conta = new ContaPoupanca(3000);
	}

	// Teste utilizando a técnica de critério de decisões
	@Test
	public void testaSaqueContaComValorValido() {
		try {
			this.conta.sacar(1500);
			assertEquals(1500, this.conta.getSaldo(), 0.001);
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
			assertEquals(4500, this.conta.getSaldo(), 0.0001);
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
		ContaPoupanca conta = new ContaPoupanca(1500);
		ContaPoupanca contaDestino = new ContaPoupanca(100);
		conta.transferir(contaDestino, 1000);
		assertEquals(1100, contaDestino.getSaldo(), 0.0001);
		assertEquals(500, conta.getSaldo(), 0.0001);
	}
	
	
	// Teste utilizando a técnica de critério de decisões
	@Test
	public void testaTransferenciaContaComValorInvalido() throws DepositoInvalidoException {
		ContaPoupanca conta = new ContaPoupanca(1500);
		ContaPoupanca contaDestino = new ContaPoupanca(100);
		conta.transferir(contaDestino, 1600);
	}
	
	// Teste utilizando a técnica dos caminhos básicos
	@Test
	public void testaCadastroValorLimite() {
		this.conta.setLimite(1000);
		assertEquals(1000, this.conta.getLimite(), 0.0001);
	}
	
	// Teste utilizando a técnica dos caminhos básicos
	@Test
	public void testaCadastroSaldo() {
		this.conta.setSaldo(1000);
		assertEquals(1000, this.conta.getSaldo(), 0.0001);
	}
	
	// Teste utilizando a técnica dos caminhos básicos
	@Test
	public void testaCadastroSaldoNegativo() {
		this.conta.setSaldo(-1);
		assertEquals(-1, this.conta.getSaldo(), 0.0001);
	}
	
	// Teste utilizando a técnica dos caminhos básicos
	@Test
	public void testaCadastroTipoConta() {
		this.conta.setTipo(1);
		assertEquals(1, this.conta.getTipo());
	}
	
	// Teste utilizando a técnica dos caminhos básicos
	@Test
	public void testaCadastroIdConta() {
		this.conta.setId(1);
		assertEquals(1, this.conta.getId());
	}
	
	// Teste utilizando a técnica do critério de decisões
	@Test
	public void testaCadastroTipoContaComGetTipoString() {
		this.conta.setTipo(1);
		assertEquals("Conta poupança", this.conta.getTipoStr());
	}
	
	// Teste utilizando a técnica dos caminhos básicos
	@Test
	public void testaContaPoupancaComLimiteInicial() {
		ContaPoupanca conta = new ContaPoupanca(1000,2000);
		assertEquals(1000, conta.getSaldo(), 0.0001);
		assertEquals(2000, conta.getLimite(), 0.0001);
	}
	
	// Teste utilizando a técnica do critério de decisões
	@Test
	public void testaComparacaoContaComContaDeMaiorSaldo() {
		ContaPoupanca conta1 = new ContaPoupanca(1000);
		ContaPoupanca conta2 = new ContaPoupanca(1200);
		assertEquals(-1, conta1.compareTo(conta2));
	}
	
	// Teste utilizando a técnica do critério de decisões
	@Test
	public void testaComparacaoContaComContaDeMenorSaldo() {
		ContaPoupanca conta1 = new ContaPoupanca(1500);
		ContaPoupanca conta2 = new ContaPoupanca(1200);
		assertEquals(1, conta1.compareTo(conta2));
	}
	
	// Teste utilizando a técnica do critério de decisões
	@Test
	public void testaComparacaoContaComContaDeSaldoIgual() {
		ContaPoupanca conta1 = new ContaPoupanca(1500);
		ContaPoupanca conta2 = new ContaPoupanca(1500);
		assertEquals(0, conta1.compareTo(conta2));
	}
	
	// Teste utilizando a técnica dos caminhos básicos //REVER PQ TA FALHANDO
	@Test
	public void testaAImpressaoDoResumo() {
		ContaPoupanca conta = new ContaPoupanca(1500);
		conta.imprimirResumo();
	}
	
	// Teste utilizando a técnica dos caminhos básicos
	@Test
	public void testaACriacaoEObtencaoTitularConta() {
		ContaPoupanca conta = new ContaPoupanca(1500);
		Cliente titular = new Cliente("titular", "", "", "", "");
		conta.setTitular(titular);
		assertEquals(titular, conta.getTitular());
	}
	
	// Teste utilizando a técnica dos caminhos básicos
	@Test
	public void testaAplicacaoTaxaContaPoupanca() {
		ContaPoupanca conta = new ContaPoupanca(1500);
		conta.atualiza(100);
		assertEquals(1400, conta.getSaldo(), 0.0001);
	}
	
	 
}
