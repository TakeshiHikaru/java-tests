package br.com.cefet.banco.negocio;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiretorTest {

	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testBonificacaoDiretor() {
		Diretor diretor = new Diretor("","","","","","", 10000.00);
		assertEquals(5000.00, diretor.getBonificacao(), 0.0);
	}
	
	// Utilizando a t�cnica do crit�rio de decis�es
	@Test
	public void testAuthenticacaoDiretor() {
		Diretor diretor = new Diretor("","","","","diretor","", 10000.00);
		assertTrue(diretor.autenticar("diretor"));
	}
	
	// Utilizando a t�cnica do crit�rio de decis�es
	@Test
	public void testAuthenticacaoDiretorComSenhaErrada() {
		Diretor diretor = new Diretor("","","","","diretor","", 10000.00);
		assertTrue(!diretor.autenticar("diretor1"));
	}
	
	// Utilizando a t�cnica dos valores limites
	@Test
	public void testAumentoSalarioDiretor() {
		Diretor diretor = new Diretor("","","","","diretor","", 10000.00);
		diretor.aumentarSalario(1);
		assertEquals(10100, diretor.getSalario(), 0.001);
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testFuncionamentoEstadoDiretorEmFerias() {
		Diretor diretor = new Diretor("","","","","diretor","", 10000.00);
		diretor.setEstado(EstadoFuncionario.EM_FERIAS);
		assertEquals(EstadoFuncionario.EM_FERIAS, diretor.getEstado());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testFuncionamentoEstadoDiretorAfastadoPorDoenca() {
		Diretor diretor = new Diretor("","","","","diretor","", 10000.00);
		diretor.setEstado(EstadoFuncionario.AFASTADO_POR_DOENCA);
		assertEquals(EstadoFuncionario.AFASTADO_POR_DOENCA, diretor.getEstado());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testFuncionamentoEstadoDiretorAposentado() {
		Diretor diretor = new Diretor("","","","","diretor","", 10000.00);
		diretor.setEstado(EstadoFuncionario.APOSENTADO);
		assertEquals(EstadoFuncionario.APOSENTADO, diretor.getEstado());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testFuncionamentoEstadoDiretorEmExercicio() {
		Diretor diretor = new Diretor("","","","","diretor","", 10000.00);
		diretor.setEstado(EstadoFuncionario.EM_EXERCICIO);
		assertEquals(EstadoFuncionario.EM_EXERCICIO, diretor.getEstado());
	}
	
	
	// Utilizando a t�cnica dos valores limites
	@Test
	public void testAumentoSalarioNegativoDiretor() {
		Diretor diretor = new Diretor("","","","","diretor","", 10000.00);
		assertTrue(!diretor.aumentarSalario(-1));
	}
	
	// Utilizando a t�cnica dos valores limites
	@Test
	public void testAumentoSalarioPorcentagemIgualAZeroDiretor() {
		Diretor diretor = new Diretor("","","","","diretor","", 10000.00);
		assertTrue(!diretor.aumentarSalario(0));
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testObterNomeDiretor() {
		Diretor diretor = new Diretor("Nome Diretor","","","","diretor","", 10000.00);
		assertEquals("Nome Diretor", diretor.getNome());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testObterEnderecoDiretor() {
		Diretor diretor = new Diretor("Nome Diretor","Endere�o diretor","","","diretor","", 10000.00);
		assertEquals("Endere�o diretor", diretor.getEndereco());
	}

	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testObterCpfDiretor() {
		Diretor diretor = new Diretor("Nome Diretor","Endere�o diretor","111.111.111.11","","diretor","", 10000.00);
		assertEquals("111.111.111.11", diretor.getCpf());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testObterDepartamentoDiretor() {
		Diretor diretor = new Diretor("Nome Diretor","Endere�o diretor","111.111.111.11","dire��o","diretor","", 10000.00);
		assertEquals("dire��o", diretor.getDepartamento());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testObterSenhaDiretor() {
		Diretor diretor = new Diretor("Nome Diretor","Endere�o diretor","111.111.111.11","dire��o","diretor","diretor", 10000.00);
		assertEquals("diretor", diretor.getSenha());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testObterUsuarioDiretor() {
		Diretor diretor = new Diretor("Nome Diretor","Endere�o diretor","111.111.111.11","dire��o","diretor","diretor", 10000.00);
		assertEquals("diretor", diretor.getUsuario());
	}
	
	// Teste utilizando a t�cnica do crit�rio de decis�es
	@Test
	public void testaTipoCargoDiretorComGetTipoString() {
		Diretor diretor = new Diretor("Nome Diretor","Endere�o diretor","111.111.111.11","dire��o","diretor","diretor", 10000.00);
		diretor.setCargo(2);
		assertEquals("Diretor", diretor.getCargoStr());
	}
	
	// Teste utilizando a t�cnica do crit�rio de decis�es
	// 
	@Test
	public void testaTipoCargoDiretorComGetTipoStringEValorInvalido() {
		Diretor diretor = new Diretor("Nome Diretor","Endere�o diretor","111.111.111.11","dire��o","diretor","diretor", 10000.00);
		diretor.setCargo(1);
		assertEquals("Diretor", diretor.getCargoStr());
	}
	
	// Teste utilizando a t�cnica do crit�rio de decis�es
	// 
	@Test
	public void testaTipoCargoDiretorComGetTipoStringCargoInvalido() {
		Diretor diretor = new Diretor("Nome Diretor","Endere�o diretor","111.111.111.11","dire��o","diretor","diretor", 10000.00);
		diretor.setCargo(5);
		assertEquals("Cargo inv�lido", diretor.getCargoStr());
	}
	
	// Teste utilizando a t�cnica do crit�rio de decis�es
	@Test
	public void testaImpressaoResumoDiretor() {
		Diretor diretor = new Diretor("Nome Diretor","Endere�o diretor","111.111.111.11","dire��o","diretor","diretor", 10000.00);
		diretor.setEstado(EstadoFuncionario.EM_EXERCICIO);
		diretor.imprimirResumo();
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testaGetESetNomeDiretor() {
		Diretor diretor = new Diretor("","","111.111.111.11","dire��o","diretor","diretor", 10000.00);
		diretor.setNome("diretor");
		assertEquals("diretor", diretor.getNome());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testaGetESetEnderecoDiretor() {
		Diretor diretor = new Diretor("","","111.111.111.11","dire��o","diretor","diretor", 10000.00);
		diretor.setEndereco("endere�o diretor");
		assertEquals("endere�o diretor", diretor.getEndereco());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testaGetESetDepartamentoDiretor() {
		Diretor diretor = new Diretor("","","111.111.111.11","dire��o","diretor","diretor", 10000.00);
		diretor.setDepartamento("departamento diretor");
		assertEquals("departamento diretor", diretor.getDepartamento());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testaGetESetSalarioDiretor() {
		Diretor diretor = new Diretor("","","111.111.111.11","dire��o","diretor","diretor", 10000.00);
		diretor.setSalario(5000);
		assertEquals(5000, diretor.getSalario(), 0.00001);
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testaGetESetSenhaDiretor() {
		Diretor diretor = new Diretor("","","111.111.111.11","dire��o","diretor","diretor", 10000.00);
		diretor.setSenha("senhadiretor");
		assertEquals("senhadiretor", diretor.getSenha());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testaGetESetCpfDiretor() {
		Diretor diretor = new Diretor("","","","dire��o","diretor","diretor", 10000.00);
		diretor.setCpf("111.111.111.11");
		assertEquals("111.111.111.11", diretor.getCpf());
	}

	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testaGetESetUsuarioDiretor() {
		Diretor diretor = new Diretor("","","","","","", 10000.00);
		diretor.setUsuario("diretor");
		assertEquals("diretor", diretor.getUsuario());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testaGetESetIdDiretor() {
		Diretor diretor = new Diretor("","","","","","", 10000.00);
		diretor.setId(1);
		assertEquals(1, diretor.getId());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos
	@Test
	public void testaGetESetIdCargo() {
		Diretor diretor = new Diretor("","","","","","", 10000.00);
		diretor.setCargo(2);
		assertEquals(2, diretor.getCargo());
	}
	

}
