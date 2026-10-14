package escenario01;

import java.time.Year;

/** Producto: contrato común de todos los vehículos. */
public abstract class Vehiculo {
    protected final String placa, marca, modelo;
    protected final int anio;
    protected final double avaluo;

    protected Vehiculo(DatosVehiculo d) {
        this.placa = d.placa();
        this.marca = d.marca();
        this.modelo = d.modelo();
        this.anio = d.anio();
        this.avaluo = d.avaluo();
    }

    protected int antiguedad() {
        return Year.now().getValue() - anio;
    }

    public String getPlaca() { return placa; }

    /** Cada tipo implementa su propia lógica de cálculo. */
    public abstract double calcularMatricula();
}
