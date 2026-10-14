package escenario01;

import java.util.HashMap;
import java.util.Map;

/** Selecciona el creador adecuado en ejecución según el tipo indicado por el cliente. */
public class RegistroCreators {
    private final Map<String, VehiculoCreator> creators = new HashMap<>();

    public void registrar(String tipo, VehiculoCreator creator) {
        creators.put(tipo.toUpperCase(), creator);
    }

    public VehiculoCreator obtener(String tipo) {
        VehiculoCreator c = creators.get(tipo.toUpperCase());
        if (c == null) throw new IllegalArgumentException("Tipo no soportado: " + tipo);
        return c;
    }
}
