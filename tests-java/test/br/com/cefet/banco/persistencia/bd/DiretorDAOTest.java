package br.com.cefet.banco.persistencia.bd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.cefet.banco.negocio.Diretor;
import br.com.cefet.banco.negocio.Funcionario;

public class DiretorDAOTest {

	FuncionarioDAO funcionarioDAO;
	@Before
	public void inicializaTestediretor() {
		this.funcionarioDAO = new FuncionarioDAO();
	}

	// Utilizando a t�cnica dos caminhos b�sicos 
	@Test
	public void testAlteracaoDeFuncionarioDiretor() {
		Funcionario diretor = this.funcionarioDAO.getFuncionario("diretor");
		diretor.setNome("diretor alterado");
		this.funcionarioDAO.altera(diretor);;
		Funcionario diretorAlterado = this.funcionarioDAO.getFuncionario("diretor");
		assertEquals("diretor alterado", diretorAlterado.getNome());
	}
	
	// Utilizando a t�cnica dos caminhos b�sicos 
	@Test
	public void testExclusaoFuncionarioCaixa() {
		Funcionario funcionarioTest = new Diretor("diretor", "", "", "", "", "diretor exclus�o", 9000.00);
		this.funcionarioDAO.adicionaFuncionario(funcionarioTest);
		Funcionario diretor = this.funcionarioDAO.getFuncionario("diretor exclus�o");
		this.funcionarioDAO.remove(diretor);
		assertNull(this.funcionarioDAO.getFuncionario("diretor exclus�o"));
	}

}
