package br.com.cefet.banco.apresentacao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PainelExcluirClienteTest {


	// t�cnica de percorrer os caminhos b�sicos
	@Test
	public void testeInicializaTesteExclusaoCliente() {
		PainelExcluirCliente tela = new PainelExcluirCliente();
		assertNull(tela.getConta());
	}
	
	// t�cnica de percorrer os caminhos b�sicos
	@Test
	public void testeInicializaTesteExclusaoSemCliente() {
		PainelExcluirCliente tela = new PainelExcluirCliente();
		assertNull(tela.getClienteEncontrado());
	}
	
	// t�cnica de percorrer os caminhos b�sicos
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
	
	// t�cnica de percorrer os caminhos b�sicos
	@Test
	public void testeObetencaoIdClitenSemCliente() {
		PainelExcluirCliente tela = new PainelExcluirCliente();
		assertEquals("", tela.getIdClienteTxt().getText());
	}

}
