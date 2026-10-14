package escenario01;

/** Producto concreto: añade capacidad al cálculo. */
public class Camioneta extends Vehiculo {
    private final double capacidad;

    public Camioneta(DatosVehiculo d) {
        super(d);
        this.capacidad = d.capacidad();
    }

    @Override
    public double calcularMatricula() {
        return avaluo * 0.02 + antiguedad() * 3 + capacidad * 10;
    }
}
