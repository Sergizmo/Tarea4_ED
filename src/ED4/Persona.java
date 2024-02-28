package ED4;

/**
 * Esta clase contiene la edad de una persona. Dispone de un método que, según
 * los años restantes hasta la jubilación (67 años), devuelve un mensaje.
 * 
 * @author Sergio Salgado
 */

public class Persona {

    private int edad;

    /**
     * Constructor del método Persona.
     */

    public Persona() {

    }

    /**
     * Calcula los años que quedan para la jubilación de esta persona y muestra la
     * cantidad resultante junto con un mensaje en base a esos años restantes.
     */

    public void calcularAniosHastaJubilacion() {

	int quedan = 67 - edad;

	if (quedan < 10) {

	    System.out.println("Sólo te quedan " + quedan + " años. ¡Vamos que ya queda poco!");
	}

	if (quedan > 20) {

	    System.out.println("Te quedan " + quedan + " años. ¡A seguir trabajando gandul!");
	}

    }

    /**
     * Recibe como parámetro la edad como número entero y la guarda en el parámetro
     * de clase "edad"
     * 
     * @param edad	Edad que tendrá el objeto persona, como entero.
     */

    public void ponEdad(int edad) {

	this.edad = edad;

    }

}
