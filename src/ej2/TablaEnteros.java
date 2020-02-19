package ej2;

public class TablaEnteros{
	private Integer[] tabla;

	TablaEnteros(Integer[] tabla) {
		if (tabla == null || tabla.length == 0)
			throw new IllegalArgumentException("No hay elementos");
		this.tabla = tabla;
	}

	public int sumaTabla() {
		int suma = 0;
		for (int i = 0; i < tabla.length; i++) {
			suma += tabla[i];
		}
		return suma;
	}
	
	public int mayorTabla() {

		int mayor = tabla[0];
		for (int i = 1; i < tabla.length; i++) {
			if (tabla[i] > mayor)
				mayor = tabla[i];
		}
		return mayor;
	}

	public int posicionTabla(int elem) {
		for (int i = 0; i < tabla.length; i++) {
			if (elem == tabla[i])
				return i;
		}
		throw new java.util.NoSuchElementException("No existe el elemento" + elem);
	}
}
