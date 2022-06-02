package facturacion.modelos;

import java.util.UUID;

public class Producto {
    UUID codigo;
    String nombre;
    String descripcion;
    String origen;
    Proveedor proveedor;
    Integer stock;

    public Producto(UUID codigo, String nombre, String descripcion, String origen, Proveedor proveedor, Integer stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.origen = origen;
        this.proveedor = proveedor;
        this.stock = stock;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public UUID getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getOrigen() {
        return origen;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public Integer getStock() {
        return stock;
    }
}
