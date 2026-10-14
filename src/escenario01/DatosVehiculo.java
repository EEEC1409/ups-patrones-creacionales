package escenario01;

/** Datos proporcionados por el cliente en ejecución. */
public record DatosVehiculo(String tipo, String placa, String marca, String modelo,
                            int anio, double avaluo, double capacidad, double tonelaje) {}
