import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class TestCalculadora {
	Calculadora c;
	@Before
	public void before() {
		System.out.println("Ejecutando el before");
		c = new Calculadora();
	}
	
	@Test
	public void SumaTest() {
		System.out.println("Ejecutando SumaTest");
		int resultado = c.suma(2,3);
		int esperado = 5;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void RestaTest() {
		System.out.println("Ejecutando RestaTest");
		int resultado = c.resta(7,2);
		int esperado = 5;
		assertEquals(esperado, resultado);
	}

}
