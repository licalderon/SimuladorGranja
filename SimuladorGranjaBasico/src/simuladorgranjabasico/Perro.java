package simuladorgranjabasico;

/**
 *
 * @author Laboratorio x
 */
public class Perro {

    private String nombre;
    private final String LADRIDO = "guau!";

    public Perro(int consecutivo) {
        this.nombre = "Perro" + consecutivo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String ladrar() {
        return this.LADRIDO;
    }
}
