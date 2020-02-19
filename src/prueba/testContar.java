package prueba;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testContar {
String g=new String();
char letra='a';
ContarLetras c=new ContarLetras();

	@Test
	void prueba1() {
		g="";
		System.out.println("prueba 1");
		int resultado=c.contarLetras(g,letra);
		assertEquals(0, resultado);
	}
	
	@Test
	void prueba2() {
		g="a";
		System.out.println("prueba 2");
		int resultado=c.contarLetras(g,letra);
		assertEquals(1, resultado);
	}
	
	@Test
	void prueba3() {
		g="b";
		System.out.println("prueba 3");
		int resultado=c.contarLetras(g,letra);
		assertEquals(0, resultado);
	}
	
	@Test
	void prueba4() {
		g="ab";
		System.out.println("prueba 4");
		int resultado=c.contarLetras(g,letra);
		assertEquals(1, resultado);
	}

}
