package br.com.cefet.banco.apresentacao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.lowagie.text.pdf.codec.postscript.ParseException;
import com.rp.util.ExceptionUtil;

public class PainelCadastrarFuncionarioTest {

	PainelCadastrarFuncionario panel;
	
	@Before
	public void inicializaTest() {
		this.panel = new PainelCadastrarFuncionario(true);
	}

	
	//Utilizando a t�cnica do teste de condi��o
	@Test
	public void testaVerificacaoCamposVaziosFormulario() {
		assertTrue(!this.panel.verificaCampos("", "", "", "", "", "", "", ""));
	}
	
	//Utilizando a t�cnica do teste de condi��o
	@Test
	public void testaVerificacaoCamposVaziosENomePreenchidoFormulario() {
		assertTrue(!this.panel.verificaCampos("nome", "", "", "", "", "", "", ""));
	}
	
	

}
