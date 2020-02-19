package ej2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testTablaEnteros {
	Integer[] tabla;
	TablaEnteros g;
	
	@BeforeEach
	void before() {
		tabla = new Integer[] {2,3,4,5};
		g = new TablaEnteros(tabla);
	}
	
	@Test
	void tablanull() {
		System.out.println("Estoy en el test0");
		assertThrows(IllegalArgumentException.class, () -> {
			g=new TablaEnteros(null);
		});
	}
	
	@Test
	void noencontrado() {
		System.out.println("Estoy en el test1");
		assertThrows(NoSuchElementException.class, () ->  {
			g.posicionTabla(77);
		});
	}
	
	@Test
	void suma() {
		int resultado=g.sumaTabla();
		System.out.println("Estoy en el test2");
		assertEquals(14, resultado);
	}
	
	@Test
	void mayor() {
		int resultado=g.mayorTabla();
		System.out.println("Estoy en el test3");
		assertEquals(5, resultado);
	}
	@Test
	void posicion() {
		int resultado=g.posicionTabla(3);
		System.out.println("Estoy en el test4");
		assertEquals(1, resultado);
	}

}
