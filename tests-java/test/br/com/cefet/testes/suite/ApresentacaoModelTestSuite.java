package br.com.cefet.testes.suite;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.cefet.banco.apresentacao.PainelCadastrarClienteTest;
import br.com.cefet.banco.apresentacao.PainelCadastrarFuncionarioTest;
import br.com.cefet.banco.apresentacao.panels.ClientesTableModelTest;
import br.com.cefet.banco.apresentacao.panels.ClockLabelTest;
import br.com.cefet.banco.apresentacao.panels.FuncionariosTableModelTest;
import br.com.cefet.banco.apresentacao.panels.StatusbarTest;

@RunWith(Suite.class)
@SuiteClasses({
	StatusbarTest.class,
	FuncionariosTableModelTest.class,
	ClockLabelTest.class,
	ClientesTableModelTest.class
})
public class ApresentacaoModelTestSuite {

}
