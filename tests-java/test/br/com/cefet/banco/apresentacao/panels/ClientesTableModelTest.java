package br.com.cefet.banco.apresentacao.panels;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.cefet.banco.negocio.Caixa;
import br.com.cefet.banco.negocio.Cliente;
import br.com.cefet.banco.negocio.Funcionario;

public class ClientesTableModelTest {

	ClientesTableModel clientesTableModel;
	@Before
	public void iniciaTeste() {
		List<Cliente> clientes = new ArrayList<Cliente>();
		Cliente cliente1 = new Cliente("cliente1", "111.111.111-11", "endereço1", "cliente1", "cliente1");
		Cliente cliente2 = new Cliente("cliente2", "111.111.111-12", "endereço2", "cliente2", "cliente2");
		clientes.add(cliente1);
		clientes.add(cliente2);
		this.clientesTableModel = new ClientesTableModel(clientes);
	}

	
	// teste utilizando técnicas de percorrer os caminhos básicos
	@Test
	public void testaRetornoValorColunaCliente() {
		assertEquals("Cliente", this.clientesTableModel.getColumnName(1));
	}
	
	// teste utilizando técnicas de percorrer os caminhos básicos
	@Test
	public void testaRetornoQuantidadeColunasCliente() {
		assertEquals(4, this.clientesTableModel.getColumnCount());
	}
	
	// teste utilizando técnicas de percorrer os caminhos básicos
	@Test
	public void testaRetornoQuantidadeClientesNaTabela() {
		assertEquals(2, this.clientesTableModel.getRowCount());
	}
	
	// teste utilizando técnicas de percorrer os caminhos básicos
	@Test
	public void testaRetornoValorClienteEmDeterminadaPosicao() {
		assertEquals("cliente2", this.clientesTableModel.getValueAt(1, 1));
	}


}
