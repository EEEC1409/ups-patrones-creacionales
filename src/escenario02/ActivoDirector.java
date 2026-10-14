package escenario02;

/** Director: encapsula configuraciones reutilizables (receta de construcción por tipo de activo). */
public final class ActivoDirector {
    private ActivoDirector() {}

    public static ActivoFijo computador(String codigo, double precio, String marca, String modelo,
                                        String serie, String procesador, int garantiaMeses) {
        return ActivoFijo.builder(codigo, "Computador", precio)
                .marca(marca).modelo(modelo).numeroSerie(serie)
                .caracteristica("procesador", procesador)
                .garantiaMeses(garantiaMeses)
                .build();
    }

    public static ActivoFijo mesa(String codigo, double precio, String material,
                                  String dimensiones, String ubicacion, String custodio) {
        return ActivoFijo.builder(codigo, "Mesa", precio)
                .caracteristica("material", material)
                .caracteristica("dimensiones", dimensiones)
                .ubicacion(ubicacion).custodio(custodio)
                .build();
    }
}
