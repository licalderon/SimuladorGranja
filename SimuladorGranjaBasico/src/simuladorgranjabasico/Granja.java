package simuladorgranjabasico;

/**
 * @deprecated se recomienda usar list
 * @author Laboratorio x
 */
import java.util.ArrayList;
import java.util.List;

public class Granja {

    public void simular() {
        int contadorVacas = 0;
        int contadorChanchos = 0;
        int contadorCabras = 0;
        int contadorPerros = 0;
        int contadorGatos = 0;
        List<Vaca> corralVacas = new ArrayList();
        List<Chancho> corralChanchos = new ArrayList();
        List<Cabra> corralCabras = new ArrayList();
        List<Perro> corralPerros = new ArrayList();
        List<Gato> corralGatos = new ArrayList();
        while (true) {
            int animalSeleccionado = (int) (Math.random() * 5);
            int especimen;
            switch (animalSeleccionado) {
                case 0:
                    contadorVacas++;
                    corralVacas.add(new Vaca(contadorVacas));
                    especimen = (int) (Math.random() * corralVacas.size());
                    System.out.println(corralVacas.get(especimen).getNombre()
                            + corralVacas.get(especimen).mugir());
                    break;
                case 1:
                    contadorChanchos++;
                    corralChanchos.add(new Chancho(contadorChanchos));
                    especimen = (int) (Math.random() * corralChanchos.size());
                    System.out.println(corralChanchos.get(especimen).getNombre()
                            + corralChanchos.get(especimen).grunir());
                    break;
                case 2:
                    contadorCabras++;
                    corralCabras.add(new Cabra(contadorCabras));
                    especimen = (int) (Math.random() * corralCabras.size());
                    System.out.println(corralCabras.get(especimen).getNombre()
                            + corralCabras.get(especimen).balar());
                    break;
                case 3:
                    contadorPerros++;
                    corralPerros.add(new Perro(contadorPerros));
                    especimen = (int) (Math.random() * corralPerros.size());
                    System.out.println(corralPerros.get(especimen).getNombre()
                            + corralPerros.get(especimen).ladrar());
                    break;
                case 4:
                    contadorGatos++;
                    corralGatos.add(new Gato(contadorGatos));
                    especimen = (int) (Math.random() * corralGatos.size());
                    System.out.println(corralGatos.get(especimen).getNombre()
                            + corralGatos.get(especimen).maullar());
                    break;
            }
        }
    }
}
