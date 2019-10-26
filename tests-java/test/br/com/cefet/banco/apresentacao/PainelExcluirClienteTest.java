package br.com.cefet.banco.apresentacao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PainelExcluirClienteTest {


	// técnica de percorrer os caminhos básicos
	@Test
	public void testeInicializaTesteExclusaoCliente() {
		PainelExcluirCliente tela = new PainelExcluirCliente();
		assertNull(tela.getConta());
	}
	
	// técnica de percorrer os caminhos básicos
	@Test
	public void testeInicializaTesteExclusaoSemCliente() {
		PainelExcluirCliente tela = new PainelExcluirCliente();
		assertNull(tela.getClienteEncontrado());
	}
	
	// técnica de percorrer os caminhos básicos
	@Test
	public void testeInicializaTesteExclusaoEApagaCampos() {
		PainelExcluirCliente tela = new PainelExcluirCliente();
		tela.apagarCampos();
		assertEquals("", tela.getCpfTxt().getText());
		assertEquals("", tela.getNomeTxt().getText());
		assertEquals("", tela.getEnderecoTxt().getText());
		assertEquals("", tela.getSaldoTxt().getText());
		assertEquals("", tela.getLimiteTxt().getText());
	}
	
	// técnica de percorrer os caminhos básicos
	@Test
	public void testeObetencaoIdClitenSemCliente() {
		PainelExcluirCliente tela = new PainelExcluirCliente();
		assertEquals("", tela.getIdClienteTxt().getText());
	}

}
