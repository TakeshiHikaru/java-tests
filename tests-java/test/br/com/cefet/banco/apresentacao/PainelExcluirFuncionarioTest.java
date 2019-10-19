package br.com.cefet.banco.apresentacao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.cefet.banco.negocio.Caixa;

public class PainelExcluirFuncionarioTest {

	PainelExcluirFuncionario tela;

	// técnica de percorrer os caminhos básicos
	@Before
	public void inicializaTest() {
		Caixa caixa = new Caixa("caixa", "", "", "", "", "" , 1500);
		this.tela = new PainelExcluirFuncionario(caixa);
	}
	
	@Test
	public void testeQualquer() {
		
	}

}
