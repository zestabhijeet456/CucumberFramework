package acom.test.runner;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.test.stepdefinition.HelloWorld;

import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
public class UTTestHelloWorld {
	HelloWorld h= new HelloWorld();
	@Test
	public void testSum() {
		assertTrue(h.sum(4, 8)==12);
		System.out.println(h.sum(4, 8));
	}

}
