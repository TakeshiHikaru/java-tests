package br.com.cefet.banco.apresentacao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.cefet.banco.negocio.Caixa;
import br.com.cefet.banco.negocio.Cliente;

public class PainelConsultarClienteTest {

	PainelConsultarCliente tela;

	// técnica de percorrer os caminhos básicos
	@Before
	public void inicializaTest() {
		this.tela = new PainelConsultarCliente();
	}
	
	@Test
	public void testeQualquer() {
		
	}
}
