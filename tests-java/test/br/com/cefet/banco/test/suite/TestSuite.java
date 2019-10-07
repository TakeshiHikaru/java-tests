package br.com.cefet.banco.test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.cefet.banco.util.BancoUtilTest;


@RunWith(Suite.class)
@SuiteClasses(BancoUtilTest.class) //testes separados por vírgula
public class TestSuite {

}
