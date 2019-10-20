package br.com.cefet.testes.suite;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.cefet.banco.negocio.BancoTest;
import br.com.cefet.banco.util.BancoUtilTest;
import junit.framework.TestSuite;


@RunWith(Suite.class)
@SuiteClasses({
	BancoUtilTest.class,
	BancoTest.class
})

public class BancoTestSuite {

}
