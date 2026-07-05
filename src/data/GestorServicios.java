package data;

import java.util.ArrayList;
import java.util.List;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

public class GestorServicios {

    private List<ServicioTuristico> servicios;

    public GestorServicios() {
        servicios = new ArrayList<>();
    }

    public void crearServicios() {

        servicios.add(new RutaGastronomica("Sabores de Puerto Varas", 4, 5));
        servicios.add(new RutaGastronomica("Ruta Alemana", 3, 4));

        servicios.add(new PaseoLacustre("Lago Llanquihue", 2, "Catamarán"));
        servicios.add(new PaseoLacustre("Todos los Santos", 3, "Lancha"));

        servicios.add(new ExcursionCultural("Frutillar Histórico", 5, "Museo Colonial"));
        servicios.add(new ExcursionCultural("Puerto Montt", 4, "Catedral"));
    }

    public List<ServicioTuristico> obtenerServicios() {
        return servicios;
    }
}