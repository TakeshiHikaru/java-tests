package br.com.cefet.testes.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.cefet.banco.negocio.BancoTest;
import br.com.cefet.banco.negocio.FuncionarioTest;

@RunWith(Suite.class)
@SuiteClasses({
	BancoTest.class,
	FuncionarioTest.class
})
public class BancoNegocioTestSuite {

}
