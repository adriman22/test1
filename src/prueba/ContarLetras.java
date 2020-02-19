package prueba;

public class ContarLetras {
	int contarLetras(String cadena, char letra) {
		int contador = 0;
		if (cadena.length() > 0) {
			for (int i = 0; i < cadena.length(); i++) {
				if (cadena.charAt(i) == letra) {
					contador++;
				}
			}
		}
		return contador;
	}
}
