package br.com.cefet.testes.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.cefet.banco.apresentacao.PainelCadastrarClienteTest;
import br.com.cefet.banco.apresentacao.PainelCadastrarFuncionarioTest;
import br.com.cefet.banco.apresentacao.PainelClienteTest;
import br.com.cefet.banco.apresentacao.PainelConsultarClienteTest;
import br.com.cefet.banco.apresentacao.PainelConsultarFuncionarioTest;
import br.com.cefet.banco.apresentacao.PainelExcluirClienteTest;
import br.com.cefet.banco.apresentacao.PainelExcluirFuncionarioTest;
import br.com.cefet.banco.apresentacao.PainelRelatorioGeralTest;
import br.com.cefet.banco.apresentacao.TelaAlterarSenhaTest;
import br.com.cefet.banco.apresentacao.TelaLogin;
import br.com.cefet.banco.apresentacao.TelaLoginTest;
import br.com.cefet.banco.apresentacao.TelaPrimeiroDiretorTest;
import br.com.cefet.banco.apresentacao.TelaPrincipalTest;

@RunWith(Suite.class)
@SuiteClasses({
	PainelCadastrarClienteTest.class,
	PainelCadastrarFuncionarioTest.class,
	TelaAlterarSenhaTest.class,
	TelaPrimeiroDiretorTest.class,
	TelaLoginTest.class,
	PainelClienteTest.class,
	TelaPrincipalTest.class,
	PainelRelatorioGeralTest.class,
	PainelExcluirClienteTest.class,
	PainelExcluirFuncionarioTest.class,
	PainelConsultarFuncionarioTest.class,
	PainelConsultarClienteTest.class
})
public class BancoApresentacaoTestSuite {

}
