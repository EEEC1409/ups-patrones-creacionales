package escenario01;

public class Main {
    public static void main(String[] args) {
        RegistroCreators reg = new RegistroCreators();
        reg.registrar("AUTO", new AutoCreator());
        reg.registrar("CAMIONETA", new CamionetaCreator());
        reg.registrar("CAMION", new CamionCreator());

        DatosVehiculo[] entradas = {
            new DatosVehiculo("AUTO", "ABC-111", "Kia", "Rio", 2020, 18000, 0, 0),
            new DatosVehiculo("CAMIONETA", "PBA-222", "Chevrolet", "D-Max", 2019, 30000, 1.2, 0),
            new DatosVehiculo("CAMION", "XYZ-333", "Hino", "500", 2018, 45000, 0, 8)
        };
        // El cliente solo conoce VehiculoCreator y Vehiculo
        for (DatosVehiculo e : entradas) {
            reg.obtener(e.tipo()).registrar(e);
        }
    }
}
