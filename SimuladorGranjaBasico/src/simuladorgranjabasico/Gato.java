package simuladorgranjabasico;

/**
 *
 * @author Laboratorio x
 */
public class Gato {

    private String nombre;
    private final String MAULLIDO = "MEOW!";

    public Gato(int consecutivo) {
        this.nombre = "Gato" + consecutivo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String maullar() {
        return this.MAULLIDO;
    }
}
