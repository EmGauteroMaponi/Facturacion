package facturacion.modelos;

import facturacion.modelos.enums.TipoFactura;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Factura {
    UUID id;
    String nro;
    TipoFactura tipo;
    Date fecha;
    Date fechaDeVencimiento;
    Persona vendedor;
    Persona comprador;
    List<Producto> productos;
    Double neto;
    Double total;
    Double alicuotaIva;

    public Factura(String nro, TipoFactura tipo, Date fecha, Date fechaDeVencimiento, Fisica vendedor, Persona comprador, List<Producto> productos, Double neto, Double total, Double alicuotaIva) throws Exception {
        this.nro = nro;
        this.tipo = tipo;
        this.fecha = fecha;
        this.fechaDeVencimiento = fechaDeVencimiento;
        if(vendedor.getDni() == null || vendedor.getDni() == 0){
            throw new Exception("El vendedor debe especificar su DNI");
        }
        this.vendedor = vendedor;
        this.comprador = comprador;
        this.productos = productos;
        this.neto = neto;
        this.total = total;
        this.alicuotaIva = alicuotaIva;
    }

    public Factura(String nro, TipoFactura tipo, Date fecha, Date fechaDeVencimiento, Juridica vendedor, Persona comprador, List<Producto> productos, Double neto, Double total, Double alicuotaIva) throws Exception {
        this.nro = nro;
        this.tipo = tipo;
        this.fecha = fecha;
        this.fechaDeVencimiento = fechaDeVencimiento;
        if(vendedor.getCuit() == null || vendedor.getCuit() == 0){
            throw new Exception("El vendedor debe especificar su CUIT");
        }
        this.vendedor = vendedor;
        this.comprador = comprador;
        this.productos = productos;
        this.neto = neto;
        this.total = total;
        this.alicuotaIva = alicuotaIva;
    }

    public UUID getId() {
        return id;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public TipoFactura getTipo() {
        return tipo;
    }

    public void setTipo(TipoFactura tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(Date fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public Persona getVendedor() {
        return vendedor;
    }

    public void setVendedor(Persona vendedor) {
        this.vendedor = vendedor;
    }

    public Persona getComprador() {
        return comprador;
    }

    public void setComprador(Persona comprador) {
        this.comprador = comprador;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Double getNeto() {
        return neto;
    }

    public void setNeto(Double neto) {
        this.neto = neto;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getAlicuotaIva() {
        return alicuotaIva;
    }

    public void setAlicuotaIva(Double alicuotaIva) {
        this.alicuotaIva = alicuotaIva;
    }
}
