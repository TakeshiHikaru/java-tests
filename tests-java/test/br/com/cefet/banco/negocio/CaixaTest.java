package br.com.cefet.banco.negocio;

import static org.junit.Assert.*;

import org.junit.Test;

public class CaixaTest {

	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testBonificacaoCaixa() {
		Caixa caixa = new Caixa("","","","","","", 1500.00);
		assertEquals(150.00, caixa.getBonificacao(), 0.0001);
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testFuncionamentoNumeroDoGuicheCaixa() {
		Caixa caixa = new Caixa("","","","","","", 1500.00);
		caixa.setNumeroDoGuiche(15);
		assertEquals(15, caixa.getNumeroDoGuiche());
	}
	
	// Utilizando a t�cnica dos valores limites
	@Test
	public void testAumentoSalarioCaixa() {
		Caixa caixa = new Caixa("","","","","caixa","", 1500.00);
		caixa.aumentarSalario(1);
		assertEquals(1515, caixa.getSalario(), 0.001);
	}
	
	// Utilizando a t�cnica dos valores limites
	@Test
	public void testAumentoSalarioNegativoCaixa() {
		Caixa caixa = new Caixa("","","","","caixa","", 1500.00);
		assertTrue(!caixa.aumentarSalario(-1));
	}
	
	// Utilizando a t�cnica dos valores limites
	@Test
	public void testAumentoSalarioPorcentagemIgualAZeroCaixa() {
		Caixa caixa = new Caixa("","","","","caixa","", 1500.00);
		assertTrue(!caixa.aumentarSalario(0));
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testFuncionamentoEstadoCaixa() {
		Caixa caixa = new Caixa("","","","","caixa","", 1500.00);
		caixa.setEstado(EstadoFuncionario.EM_EXERCICIO);
		assertEquals(EstadoFuncionario.EM_EXERCICIO, caixa.getEstado());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testAuthenticacaoCaixa() {
		Caixa caixa = new Caixa("","","","","caixa","", 1500.00);
		assertTrue(caixa.autenticar("caixa"));
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testObterNomeCaixa() {
		Caixa caixa = new Caixa("Nome Caixa","","","","Caixa","", 1500.00);
		assertEquals("Nome Caixa", caixa.getNome());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testObterEnderecoCaixa() {
		Caixa caixa = new Caixa("Nome Caixa","Endere�o Caixa","","","Caixa","", 1500.00);
		assertEquals("Endere�o Caixa", caixa.getEndereco());
	}

	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testObterCpfCaixa() {
		Caixa caixa = new Caixa("Nome Caixa","Endere�o Caixa","111.111.111.11","","Caixa","", 1500.00);
		assertEquals("111.111.111.11", caixa.getCpf());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testObterDepartamentoCaixa() {
		Caixa caixa = new Caixa("Nome Caixa","Endere�o Caixa","111.111.111.11","funcion�rios","Caixa","", 1500.00);
		assertEquals("funcion�rios", caixa.getDepartamento());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testObterSenhaCaixa() {
		Caixa caixa = new Caixa("Nome Caixa","Endere�o Caixa","111.111.111.11","dire��o","caixa","caixa", 1500.00);
		assertEquals("caixa", caixa.getSenha());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testObterUsuarioCaixa() {
		Caixa caixa = new Caixa("Nome Caixa","Endere�o Caixa","111.111.111.11","dire��o","caixa","caixa", 1500.00);
		assertEquals("caixa", caixa.getUsuario());
	}

}
