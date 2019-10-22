package br.com.cefet.banco.negocio;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.cefet.banco.persistencia.bd.FuncionarioDAO;

public class FuncionarioTest {

	Funcionario caixa = null;
	Funcionario gerente = null;
	Funcionario diretor = null;
	FuncionarioDAO funcDAO = new FuncionarioDAO();
	
	@Before
	public void inicializaFuncionarios() {
		this.caixa = new Caixa("Caixa TDD","Endereço caixa 1","111.222.111.11","caixa","caixaTdd","caixaTdd", 1000.00);
		this.funcDAO.adicionaFuncionario(this.caixa);
		this.caixa = this.funcDAO.getFuncionario("caixaTdd");
		
		this.gerente = new Gerente("Gerente TDD","Endereço gerente 1","111.333.111.11","gerente","gerenteTdd","gerenteTdd", 5000.00);
		this.funcDAO.adicionaFuncionario(this.gerente);
		this.gerente = this.funcDAO.getFuncionario("gerenteTdd");
		
		this.diretor = new Diretor("Diretor TDD","Endereço diretor 1","111.444.111.11","diretor","diretorTdd","diretorTdd", 10000.00);
		this.funcDAO.adicionaFuncionario(this.diretor);
		this.diretor = this.funcDAO.getFuncionario("diretorTdd");
	}
	
	//TDD 1
	@Test
	public void promoverCaixaTddTest() {
		assertEquals(0,this.caixa.getCargo());
		Funcionario.promover(this.caixa);
		assertEquals(1,this.caixa.getCargo());
	}
	
	//TDD 2
	@Test
	public void promoverGerenteTddTest() {
		assertEquals(1,this.gerente.getCargo());
		Funcionario.promover(this.gerente);
		assertEquals(2,this.gerente.getCargo());
	}
	
	//TDD 3
	@Test
	public void promoverDiretorTddTest() {
		assertEquals(2,this.diretor.getCargo());
		Funcionario.promover(this.diretor);
		assertEquals(2,this.diretor.getCargo());
	}
	
	//TDD 4
	@Test
	public void promoverGerenteSalvandoNoBdTddTest() {
		assertEquals(1,this.gerente.getCargo());
		Funcionario.promover(this.gerente);
		assertEquals(2,this.funcDAO.getFuncionario("gerenteTdd").getCargo());
	}
	
	//TDD 5
	@Test
	public void promoverCaixaSalvandoNoBdTddTest() {
		assertEquals(0,this.caixa.getCargo());
		Funcionario.promover(this.caixa);
		assertEquals(1,this.funcDAO.getFuncionario("caixaTdd").getCargo());
	}

}
