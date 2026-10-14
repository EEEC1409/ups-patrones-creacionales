package escenario01;

public class CamionCreator extends VehiculoCreator {
    @Override
    protected Vehiculo crearVehiculo(DatosVehiculo d) { return new Camion(d); }
}
