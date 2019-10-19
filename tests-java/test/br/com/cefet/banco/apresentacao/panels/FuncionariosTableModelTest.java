package br.com.cefet.banco.apresentacao.panels;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.cefet.banco.negocio.Caixa;
import br.com.cefet.banco.negocio.Funcionario;

public class FuncionariosTableModelTest {
	
	FuncionariosTableModel funcTableModel;
	@Before
	public void init() {
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		Funcionario func1 = new Caixa("caixa", "", "", "", "", "", 2000);
		Funcionario func2 = new Caixa("caixa2", "", "", "", "", "", 2000);
		funcionarios.add(func1);
		funcionarios.add(func2);
		this.funcTableModel = new FuncionariosTableModel(funcionarios);
	}

	//técnica dos caminhos básicos
	@Test
	public void testObtencaoNomeDaColunaTableModel() {
		assertEquals("Funcionario", this.funcTableModel.getColumnName(1));
	}
	
	//técnica dos caminhos básicos
	@Test
	public void testObtencaoQuantidadeFuncionarios() {
		assertEquals(2, this.funcTableModel.getRowCount());
	}
	
	//técnica dos caminhos básicos
	@Test
	public void testObtencaoQuantidadeColunasTableModel() {
		assertEquals(5, this.funcTableModel.getColumnCount());
	}
	
	//técnica dos caminhos básicos
	@Test
	public void testObtencaoValorFuncionarioPosicaoEspecifica() {
		assertEquals("caixa2", this.funcTableModel.getValueAt(1, 1));
	}

}
