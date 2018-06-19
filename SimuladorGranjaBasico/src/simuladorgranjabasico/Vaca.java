package simuladorgranjabasico;

/**
 *
 * @author Laboratorio x
 */
public class Vaca {

    private String nombre;
    private final String MUGIDO = "Muuu!";

    /**
     * Constructor
     *
     * @param nombre
     */
    public Vaca(int consecutivo) {
        this.nombre = "Vaca" + consecutivo;
    }

    /**
     * @return String
     */
    public String getNombre() {
        return this.nombre;
    }

    public String mugir() {
        return this.MUGIDO;
    }
}
