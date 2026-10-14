package escenario01;

public class AutoCreator extends VehiculoCreator {
    @Override
    protected Vehiculo crearVehiculo(DatosVehiculo d) { return new Auto(d); }
}
