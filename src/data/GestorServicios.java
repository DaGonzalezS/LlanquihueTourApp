package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;

public class GestorServicios {

    public void crearServicios() {

        RutaGastronomica ruta1 = new RutaGastronomica("Sabores de Puerto Varas", 4, 5);
        RutaGastronomica ruta2 = new RutaGastronomica("Ruta Alemana", 3, 4);

        PaseoLacustre paseo1 = new PaseoLacustre("Lago Llanquihue", 2, "Catamarán");
        PaseoLacustre paseo2 = new PaseoLacustre("Todos los Santos", 3, "Lancha");

        ExcursionCultural excursion1 = new ExcursionCultural("Frutillar Histórico", 5, "Museo Colonial");
        ExcursionCultural excursion2 = new ExcursionCultural("Puerto Montt", 4, "Catedral");

        System.out.println(ruta1);
        System.out.println(ruta2);

        System.out.println();

        System.out.println(paseo1);
        System.out.println(paseo2);

        System.out.println();

        System.out.println(excursion1);
        System.out.println(excursion2);
    }
}