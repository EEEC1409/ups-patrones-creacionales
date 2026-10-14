package escenario01;

/** Creador: declara el Factory Method y la lógica común que usa solo Vehiculo. */
public abstract class VehiculoCreator {

    /** Factory Method. */
    protected abstract Vehiculo crearVehiculo(DatosVehiculo datos);

    public Vehiculo registrar(DatosVehiculo datos) {
        Vehiculo v = crearVehiculo(datos);
        System.out.printf("Registrado %s -> matrícula: $%.2f%n", v.getPlaca(), v.calcularMatricula());
        return v;
    }
}
