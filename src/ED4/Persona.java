package ED4;

/**
 * Esta clase contiene la edad de una persona. Dispone de un m�todo que, seg�n
 * los a�os restantes hasta la jubilaci�n (67 a�os), devuelve un mensaje.
 * 
 * @author Sergio Salgado
 */

public class Persona {

    private int edad;

    /**
     * Constructor del m�todo Persona.
     */

    public Persona() {

    }

    /**
     * Calcula los a�os que quedan para la jubilaci�n de esta persona y muestra la
     * cantidad resultante junto con un mensaje en base a esos a�os restantes.
     */

    public void calcularAniosHastaJubilacion() {

	int quedan = 67 - edad;

	if (quedan < 10) {

	    System.out.println("S�lo te quedan " + quedan + " a�os. �Vamos que ya queda poco!");
	}

	if (quedan > 20) {

	    System.out.println("Te quedan " + quedan + " a�os. �A seguir trabajando gandul!");
	}

    }

    /**
     * Recibe como par�metro la edad como n�mero entero y la guarda en el par�metro
     * de clase "edad"
     * 
     * @param edad	Edad que tendr� el objeto persona, como entero.
     */

    public void ponEdad(int edad) {

	this.edad = edad;

    }

}
