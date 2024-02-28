package ED4;

import java.util.Scanner;

/**
 * Es el método principal encargado de iniciar el programa.
 * 
 * @author Sergio Salgado
 */

public class Main {

    /**
     * Método Main. Instancia un objeto Persona y pregunta al usuario
     * por su edad. Guardará la edad en el objeto y luego usará el método de clase
     * calcularAniosHastaJubilacion para mostrar un mensaje.
     * 
     * @param args No se usa.
     */

    public static void main(String[] args) {

	int edad = 0;

	final Scanner entrada = new Scanner(System.in);

	// Instanciamos un objeto Persona
	Persona juan = new Persona();

	// Se repite hasta tener una edad válida
	while (edad == 0) {

	    // Se pide la edad
	    System.out.println("¿Cuál es tu edad?");

	    edad = entrada.nextInt();
	    
	    // Se comprueba que sea una edad de trabajador válida

	    if (edad < 18 || edad > 67) {

		System.out.println("No es una edad correcta, elige un número entre 18 y 67");
		edad = 0;

	    }

	}

	// Se guarda la edad usando el método para ello
	juan.ponEdad(edad);

	// Se pide calcular la edad usando el método para ello
	juan.calcularAniosHastaJubilacion();
	
	entrada.close();

    }

}
