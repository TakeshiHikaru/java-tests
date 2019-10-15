package br.com.cefet.testes.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.cefet.banco.apresentacao.PainelCadastrarClienteTest;
import br.com.cefet.banco.apresentacao.PainelCadastrarFuncionarioTest;

@RunWith(Suite.class)
@SuiteClasses({
	PainelCadastrarClienteTest.class,
	PainelCadastrarFuncionarioTest.class
})
public class BancoApresentacaoTestSuite {

}
