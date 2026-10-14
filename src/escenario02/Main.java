package escenario02;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Uso mediante el Director (configuración predefinida)
        System.out.println(ActivoDirector.computador("AF001", 1200, "Dell", "Latitude",
                "SN-998877", "Intel i7", 36));
        System.out.println(ActivoDirector.mesa("AF002", 150, "Madera", "120x60 cm",
                "Oficina 3", "Juan Pérez"));

        // Uso directo del Builder (configuración personalizada, solo lo que aplica)
        ActivoFijo monitor = ActivoFijo.builder("AF003", "Monitor", 280)
                .marca("LG")
                .ubicacion("Cuenca")
                .fechaAdquisicion(LocalDate.of(2025, 3, 10))
                .observaciones("Pantalla de 27 pulgadas")
                .build();
        System.out.println(monitor);

        // Validación de obligatorios
        try {
            ActivoFijo.builder("", "Sin código", 10);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error esperado: " + ex.getMessage());
        }
    }
}
