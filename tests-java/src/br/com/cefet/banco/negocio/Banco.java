package br.com.cefet.banco.negocio;

import java.util.List;

import br.com.cefet.banco.persistencia.bd.ClienteDAO;
import br.com.cefet.banco.persistencia.bd.ContaDAO;
import br.com.cefet.banco.persistencia.bd.FuncionarioDAO;

public class Banco {

	private final String NOME_BANCO = "BANCO DE TESTES";
	private final String CNPJ_BANCO = "00.000.000/0000-00";

	private String nome;
	private String endereco;
	private String cnpj;

	private List<Funcionario> funcionarios;
	private List<Conta> contas;
	private List<Cliente> clientes;

	FuncionarioDAO daoFuncionario;
	ClienteDAO daoCliente;
	ContaDAO daoConta;

	public Banco(){
		daoFuncionario = new FuncionarioDAO();
		daoCliente = new ClienteDAO();
		daoConta = new ContaDAO();
		this.funcionarios = daoFuncionario.getListaFuncionarios();
		this.contas = daoConta.getListaContas();
		this.clientes = daoCliente.getListaClientes();
	}

	public void contratarFuncionario(Funcionario novoFunc){
		this.funcionarios.add(novoFunc);
	}

	public void demitirFuncionario(Funcionario func){
		this.funcionarios.remove(func);		
	}


	public void adicionarConta(Conta c){
		this.contas.add(c);
	}


	public void excluirConta(Conta c){
		this.contas.remove(c);			
	}

	public double calcularSaldoTotal() {
		double total = 0;
		for(Conta c: contas){
			if (c!=null){
				total += c.getSaldo();
			}
		}	
		return total;
	}

	public double calcularTotalDeGastos() {
		double total = 0;
		for(Funcionario f: funcionarios){
			if (f!=null){
				total += f.getSalario();
			}
		}	
		return total;
	}

	public void imprimeListaDeFuncionarios(){
		for(Funcionario f: funcionarios){
			if (f!=null){
				f.imprimirResumo();
			}
		}
	}

	public void atualizarContas(double taxa){
		for(int i = 0; i < contas.size()-1;i++){
			Conta c = contas.get(i);
			c.atualiza(taxa);
			ContaDAO contaDAO = new ContaDAO();
			contaDAO.altera(c);
		}
	}

	public void imprimeRelatorioDeContas(){
		for(Conta c: contas){
			if (c!=null){
				c.imprimirResumo();
			}
		}
	}

	public double calcularLimiteMaximo(Conta conta) {
		double limiteMaximo = 0;
		if(conta.getSaldo()<0) {
			limiteMaximo = conta.getLimite();
		} else {
			double limiteMaximoGeral = 0;
			double gastoPorCliente = this.calcularTotalDeGastos()/this.clientes.size();
			double ganhoPorFuncionario = this.calcularSaldoTotal()/this.funcionarios.size();
			if(gastoPorCliente>ganhoPorFuncionario && this.calcularSaldoTotal()>this.calcularTotalDeGastos()) {
				limiteMaximoGeral = this.calcularSaldoTotal();
			} else {
				limiteMaximoGeral = this.calcularSaldoTotal()/this.clientes.size();
			}
			double limiteIndividual = conta.getLimite();
			if(limiteIndividual == 0) {
				limiteIndividual = 100;
			}
			double saldoMedio = this.calcularSaldoTotal()/this.clientes.size();
			if(conta.getSaldo()>10*saldoMedio && conta instanceof ContaCorrente) {
				limiteIndividual = limiteIndividual*10;
			} else if(conta.getSaldo()>5*saldoMedio && conta instanceof ContaCorrente) {
				limiteIndividual = limiteIndividual*5;
			} else if(conta.getSaldo()>saldoMedio || conta instanceof ContaPoupanca) {
				limiteIndividual = limiteIndividual*2;
			} else {
				if(limiteIndividual+conta.getSaldo() > limiteIndividual*2) {
					limiteIndividual = limiteIndividual*2;
				} else {
					limiteIndividual = limiteIndividual+conta.getSaldo();
				}
			}
			if(limiteIndividual > limiteMaximoGeral) {
				limiteIndividual = limiteMaximoGeral;
			}
			limiteMaximo = Math.floor(limiteIndividual);
		}
		return limiteMaximo;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getCnpj() {
		return cnpj;
	}

	
	
	
}
