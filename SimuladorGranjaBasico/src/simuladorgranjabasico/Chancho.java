package simuladorgranjabasico;

/**
 *
 * @author Laboratorio x
 */
public class Chancho {

    private String nombre;
    private final String GRUNIDO = "OINK OINK OINK!";

    public Chancho(int consecutivo) {
        this.nombre = "Chancho" + consecutivo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String grunir() {
        return this.GRUNIDO;
    }
}
