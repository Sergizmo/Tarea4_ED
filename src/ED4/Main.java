package ED4;

import java.util.Scanner;

/**
 * Es el m�todo principal encargado de iniciar el programa.
 * 
 * @author Sergio Salgado
 */

public class Main {

    /**
     * M�todo Main. Instancia un objeto Persona y pregunta al usuario
     * por su edad. Guardar� la edad en el objeto y luego usar� el m�todo de clase
     * calcularAniosHastaJubilacion para mostrar un mensaje.
     * 
     * @param args No se usa.
     */

    public static void main(String[] args) {

	int edad = 0;

	final Scanner entrada = new Scanner(System.in);

	// Instanciamos un objeto Persona
	Persona juan = new Persona();

	// Se repite hasta tener una edad v�lida
	while (edad == 0) {

	    // Se pide la edad
	    System.out.println("�Cu�l es tu edad?");

	    edad = entrada.nextInt();
	    
	    // Se comprueba que sea una edad de trabajador v�lida

	    if (edad < 18 || edad > 67) {

		System.out.println("No es una edad correcta, elige un n�mero entre 18 y 67");
		edad = 0;

	    }

	}

	// Se guarda la edad usando el m�todo para ello
	juan.ponEdad(edad);

	// Se pide calcular la edad usando el m�todo para ello
	juan.calcularAniosHastaJubilacion();
	
	entrada.close();

    }

}
