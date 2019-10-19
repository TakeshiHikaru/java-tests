package br.com.cefet.banco.negocio;

import static org.junit.Assert.*;

import org.junit.Test;

public class GerenteTest {

	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testBonificacaoGerente() {
		Gerente gerente = new Gerente("","","","","","", 3000.00);
		assertEquals(600.00, gerente.getBonificacao(), 0.0);
	}
	
	// Utilizando a técnica dos valores limites
	@Test
	public void testAumentoSalarioGerente() {
		Gerente gerente = new Gerente("","","","","gerente","", 3000.00);
		gerente.aumentarSalario(1);
		assertEquals(3030, gerente.getSalario(), 0.001);
	}
	
	// Utilizando a técnica dos valores limites
	@Test
	public void testAumentoSalarioNegativoGerente() {
		Gerente gerente = new Gerente("","","","","gerente","", 3000.00);
		assertTrue(!gerente.aumentarSalario(-1));
	}
	
	// Utilizando a técnica dos valores limites
	@Test
	public void testAumentoSalarioPorcentagemIgualAZeroGerente() {
		Gerente gerente = new Gerente("","","","","gerente","", 3000.00);
		assertTrue(!gerente.aumentarSalario(0));
	}
	
	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testFuncionamentoEstadoGerenteEmExercicio() {
		Gerente gerente = new Gerente("","","","","gerente","", 3000.00);
		gerente.setEstado(EstadoFuncionario.EM_EXERCICIO);
		assertEquals(EstadoFuncionario.EM_EXERCICIO, gerente.getEstado());
	}
	
	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testFuncionamentoEstadoGerenteEmFerias() {
		Gerente gerente = new Gerente("","","","","gerente","", 3000.00);
		gerente.setEstado(EstadoFuncionario.EM_FERIAS);
		assertEquals(EstadoFuncionario.EM_FERIAS, gerente.getEstado());
	}
	
	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testFuncionamentoEstadoGerenteAfastadoPorDoenca() {
		Gerente gerente = new Gerente("","","","","gerente","", 3000.00);
		gerente.setEstado(EstadoFuncionario.AFASTADO_POR_DOENCA);
		assertEquals(EstadoFuncionario.AFASTADO_POR_DOENCA, gerente.getEstado());
	}
	
	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testFuncionamentoEstadoGerenteAposentado() {
		Gerente gerente = new Gerente("","","","","gerente","", 3000.00);
		gerente.setEstado(EstadoFuncionario.APOSENTADO);
		assertEquals(EstadoFuncionario.APOSENTADO, gerente.getEstado());
	}
		
		
	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testAuthenticacaoGerente() {
		Gerente gerente = new Gerente("","","","","gerente","", 3000.00);
		assertTrue(gerente.autenticar("gerente"));
	}
	
	
	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testObterNomeGerente() {
		Gerente gerente = new Gerente("Nome Gerente","","","","Gerente","", 3000.00);
		assertEquals("Nome Gerente", gerente.getNome());
	}
	
	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testObterEnderecoGerente() {
		Gerente gerente = new Gerente("Nome Gerente","Endereço Gerente","","","Gerente","", 3000.00);
		assertEquals("Endereço Gerente", gerente.getEndereco());
	}

	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testObterCpfGerente() {
		Gerente gerente = new Gerente("Nome Gerente","Endereço Gerente","111.111.111.11","","Gerente","", 3000.00);
		assertEquals("111.111.111.11", gerente.getCpf());
	}
	
	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testObterDepartamentoGerente() {
		Gerente gerente = new Gerente("Nome Gerente","Endereço Gerente","111.111.111.11","gestão","Gerente","", 3000.00);
		assertEquals("gestão", gerente.getDepartamento());
	}
	
	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testObterSenhaGerente() {
		Gerente gerente = new Gerente("Nome Gerente","Endereço Gerente","111.111.111.11","direção","gerente","gerente", 3000.00);
		assertEquals("gerente", gerente.getSenha());
	}
	
	// Utilizando a técnica dos caminhos básicos
	@Test
	public void testObterUsuarioGerente() {
		Gerente gerente = new Gerente("Nome Gerente","Endereço Gerente","111.111.111.11","direção","gerente","gerente", 3000.00);
		assertEquals("gerente", gerente.getUsuario());
	}
	
	// Teste utilizando a técnica do critério de decisões
	@Test
	public void testaCadastroTipoCargoGerenteComGetTipoString() {
		Gerente gerente = new Gerente("Nome Gerente","Endereço Gerente","111.111.111.11","direção","gerente","gerente", 3000.00);
		gerente.setCargo(1);
		assertEquals("Gerente", gerente.getCargoStr());
	}

	// Teste utilizando a técnica do critério de decisões
	@Test
	public void testaCadastroTipoCargoGerenteComValorInvalido() {
		Diretor diretor = new Diretor("Nome Diretor","Endereço diretor","111.111.111.11","direção","diretor","diretor", 10000.00);
		diretor.setCargo(0);
		assertEquals("Diretor", diretor.getCargoStr());
	}

}
