package br.com.cefet.banco.apresentacao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.cefet.banco.negocio.Caixa;

public class PainelConsultarFuncionarioTest {

	PainelConsultarFuncionario tela;

	// t�cnica de percorrer os caminhos b�sicos
	@Before
	public void inicializaTest() {
		Caixa caixa = new Caixa("caixa", "", "", "", "", "" , 1500);
		this.tela = new PainelConsultarFuncionario(caixa);
	}
	
	@Test
	public void testeQualquer() {
		
	}

}
