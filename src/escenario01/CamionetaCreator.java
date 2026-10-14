package escenario01;

public class CamionetaCreator extends VehiculoCreator {
    @Override
    protected Vehiculo crearVehiculo(DatosVehiculo d) { return new Camioneta(d); }
}
