package simuladorgranjabasico;

/*
 * @author Laboratorio x
 * @throws Cabra comportamientos de cabra
 * @serial 
 */
public class Cabra {

    private String nombre;
    private final String BALAGE = "Meeeeeee!";

    /*
 * @serial Nombre y sonido de animal con valor consecutivo
     */
    public Cabra(int consecutivo) {
        this.nombre = "Cabra" + consecutivo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String balar() {
        return this.BALAGE;
    }
}
