package escenario01;

/** Producto concreto: añade tonelaje al cálculo. */
public class Camion extends Vehiculo {
    private final double tonelaje;

    public Camion(DatosVehiculo d) {
        super(d);
        this.tonelaje = d.tonelaje();
    }

    @Override
    public double calcularMatricula() {
        return avaluo * 0.025 + antiguedad() * 5 + tonelaje * 40;
    }
}
