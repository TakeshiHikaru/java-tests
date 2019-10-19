package br.com.cefet.banco.negocio;

import static org.junit.Assert.*;

import org.junit.Test;

public class CaixaTest {

	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testBonificacaoCaixa() {
		Caixa caixa = new Caixa("","","","","","", 1500.00);
		assertEquals(150.00, caixa.getBonificacao(), 0.0001);
	}
	
	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testFuncionamentoNumeroDoGuicheCaixa() {
		Caixa caixa = new Caixa("","","","","","", 1500.00);
		caixa.setNumeroDoGuiche(15);
		assertEquals(15, caixa.getNumeroDoGuiche());
	}
	
	// Utilizando a técnica dos valores limites
	@Test
	public void testAumentoSalarioCaixa() {
		Caixa caixa = new Caixa("","","","","caixa","", 1500.00);
		caixa.aumentarSalario(1);
		assertEquals(1515, caixa.getSalario(), 0.001);
	}
	
	// Utilizando a técnica dos valores limites
	@Test
	public void testAumentoSalarioNegativoCaixa() {
		Caixa caixa = new Caixa("","","","","caixa","", 1500.00);
		assertTrue(!caixa.aumentarSalario(-1));
	}
	
	// Utilizando a técnica dos valores limites
	@Test
	public void testAumentoSalarioPorcentagemIgualAZeroCaixa() {
		Caixa caixa = new Caixa("","","","","caixa","", 1500.00);
		assertTrue(!caixa.aumentarSalario(0));
	}
	
	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testFuncionamentoEstadoCaixa() {
		Caixa caixa = new Caixa("","","","","caixa","", 1500.00);
		caixa.setEstado(EstadoFuncionario.EM_EXERCICIO);
		assertEquals(EstadoFuncionario.EM_EXERCICIO, caixa.getEstado());
	}
	
	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testFuncionamentoEstadoCaixaEmFerias() {
		Caixa caixa = new Caixa("","","","","caixa","", 1500.00);
		caixa.setEstado(EstadoFuncionario.EM_FERIAS);
		assertEquals(EstadoFuncionario.EM_FERIAS, caixa.getEstado());
	}
	
	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testFuncionamentoEstadoCaixaAfastadoPorDoenca() {
		Caixa caixa = new Caixa("","","","","caixa","", 1500.00);
		caixa.setEstado(EstadoFuncionario.AFASTADO_POR_DOENCA);
		assertEquals(EstadoFuncionario.AFASTADO_POR_DOENCA, caixa.getEstado());
	}
	
	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testFuncionamentoEstadoCaixaAposentado() {
		Caixa caixa = new Caixa("","","","","caixa","", 1500.00);
		caixa.setEstado(EstadoFuncionario.APOSENTADO);
		assertEquals(EstadoFuncionario.APOSENTADO, caixa.getEstado());
	}
	
	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testAuthenticacaoCaixa() {
		Caixa caixa = new Caixa("","","","","caixa","", 1500.00);
		assertTrue(caixa.autenticar("caixa"));
	}
	
	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testObterNomeCaixa() {
		Caixa caixa = new Caixa("Nome Caixa","","","","Caixa","", 1500.00);
		assertEquals("Nome Caixa", caixa.getNome());
	}
	
	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testObterEnderecoCaixa() {
		Caixa caixa = new Caixa("Nome Caixa","Endereço Caixa","","","Caixa","", 1500.00);
		assertEquals("Endereço Caixa", caixa.getEndereco());
	}

	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testObterCpfCaixa() {
		Caixa caixa = new Caixa("Nome Caixa","Endereço Caixa","111.111.111.11","","Caixa","", 1500.00);
		assertEquals("111.111.111.11", caixa.getCpf());
	}
	
	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testObterDepartamentoCaixa() {
		Caixa caixa = new Caixa("Nome Caixa","Endereço Caixa","111.111.111.11","funcionários","Caixa","", 1500.00);
		assertEquals("funcionários", caixa.getDepartamento());
	}
	
	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testObterSenhaCaixa() {
		Caixa caixa = new Caixa("Nome Caixa","Endereço Caixa","111.111.111.11","direção","caixa","caixa", 1500.00);
		assertEquals("caixa", caixa.getSenha());
	}
	
	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testObterUsuarioCaixa() {
		Caixa caixa = new Caixa("Nome Caixa","Endereço Caixa","111.111.111.11","direção","caixa","caixa", 1500.00);
		assertEquals("caixa", caixa.getUsuario());
	}
	
	// Teste utilizando a técnica do critério de decisões
	@Test
	public void testaCadastroTipoCargoCaixaComGetTipoString() {
		Caixa caixa = new Caixa("Nome Caixa","Endereço Caixa","111.111.111.11","direção","caixa","caixa", 1500.00);
		caixa.setCargo(0);
		assertEquals("Caixa", caixa.getCargoStr());
	}
	
	// Teste utilizando a técnica do critério de decisões
	@Test
	public void testaCadastroTipoCargoCaixaComValorInvalido() {
		Caixa caixa = new Caixa("Nome Caixa","Endereço Caixa","111.111.111.11","direção","caixa","caixa", 1500.00);
		caixa.setCargo(2);
		assertEquals("Caixa", caixa.getCargoStr());
	}

}
