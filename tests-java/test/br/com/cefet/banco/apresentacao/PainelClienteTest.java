package br.com.cefet.banco.apresentacao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.cefet.banco.negocio.Cliente;

public class PainelClienteTest {

	PainelCliente tela;

	// t�cnica de percorrer os caminhos b�sicos
	@Before
	public void inicializaTest() {
		Cliente cliente = new Cliente("cliente", "111.111.111-11", "endere�o", "cliente", "clientesenha");
		this.tela = new PainelCliente(cliente);
	}
	
	@Test
	public void testeQualquer() {
		
	}

}
