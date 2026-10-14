package escenario02;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

/** Producto: objeto inmutable construido paso a paso mediante su Builder. */
public final class ActivoFijo {
    // Obligatorios
    private final String codigo, nombre;
    private final double precio;
    // Opcionales
    private final String marca, modelo, numeroSerie, ubicacion, custodio, proveedor, observaciones;
    private final LocalDate fechaAdquisicion;
    private final Integer garantiaMeses;
    private final Map<String, String> caracteristicas;

    private ActivoFijo(Builder b) {
        codigo = b.codigo; nombre = b.nombre; precio = b.precio;
        marca = b.marca; modelo = b.modelo; numeroSerie = b.numeroSerie;
        ubicacion = b.ubicacion; custodio = b.custodio; proveedor = b.proveedor;
        observaciones = b.observaciones; fechaAdquisicion = b.fechaAdquisicion;
        garantiaMeses = b.garantiaMeses;
        caracteristicas = Map.copyOf(b.caracteristicas);
    }

    public static Builder builder(String codigo, String nombre, double precio) {
        return new Builder(codigo, nombre, precio);
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ActivoFijo[" + codigo + ", " + nombre + ", $" + precio);
        if (marca != null) sb.append(", marca=").append(marca);
        if (modelo != null) sb.append(", modelo=").append(modelo);
        if (numeroSerie != null) sb.append(", serie=").append(numeroSerie);
        if (ubicacion != null) sb.append(", ubicación=").append(ubicacion);
        if (custodio != null) sb.append(", custodio=").append(custodio);
        if (proveedor != null) sb.append(", proveedor=").append(proveedor);
        if (fechaAdquisicion != null) sb.append(", adquirido=").append(fechaAdquisicion);
        if (garantiaMeses != null) sb.append(", garantía=").append(garantiaMeses).append(" meses");
        if (!caracteristicas.isEmpty()) sb.append(", características=").append(caracteristicas);
        if (observaciones != null) sb.append(", obs=").append(observaciones);
        return sb.append("]").toString();
    }

    /** Builder concreto: los datos obligatorios se exigen en el constructor; el resto es opcional. */
    public static final class Builder {
        private final String codigo, nombre;
        private final double precio;
        private String marca, modelo, numeroSerie, ubicacion, custodio, proveedor, observaciones;
        private LocalDate fechaAdquisicion;
        private Integer garantiaMeses;
        private final Map<String, String> caracteristicas = new LinkedHashMap<>();

        private Builder(String codigo, String nombre, double precio) {
            if (codigo == null || codigo.isBlank()) throw new IllegalArgumentException("El código es obligatorio");
            if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("El nombre es obligatorio");
            if (precio <= 0) throw new IllegalArgumentException("El precio debe ser mayor que cero");
            this.codigo = codigo; this.nombre = nombre; this.precio = precio;
        }

        public Builder marca(String v) { this.marca = v; return this; }
        public Builder modelo(String v) { this.modelo = v; return this; }
        public Builder numeroSerie(String v) { this.numeroSerie = v; return this; }
        public Builder ubicacion(String v) { this.ubicacion = v; return this; }
        public Builder custodio(String v) { this.custodio = v; return this; }
        public Builder proveedor(String v) { this.proveedor = v; return this; }
        public Builder observaciones(String v) { this.observaciones = v; return this; }
        public Builder fechaAdquisicion(LocalDate v) { this.fechaAdquisicion = v; return this; }
        public Builder garantiaMeses(int v) {
            if (v < 0) throw new IllegalArgumentException("La garantía no puede ser negativa");
            this.garantiaMeses = v; return this;
        }
        public Builder caracteristica(String clave, String valor) {
            this.caracteristicas.put(clave, valor); return this;
        }

        public ActivoFijo build() { return new ActivoFijo(this); }
    }
}
