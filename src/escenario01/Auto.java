package escenario01;

/** Producto concreto: considera avalúo y antigüedad. */
public class Auto extends Vehiculo {
    public Auto(DatosVehiculo d) { super(d); }

    @Override
    public double calcularMatricula() {
        return avaluo * 0.015 + antiguedad() * 2;
    }
}
