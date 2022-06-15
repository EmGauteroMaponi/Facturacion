package facturacion.modelos;

import java.util.UUID;


public class Proveedor {
    UUID id;
    Persona persona;
    String rubro;
    Integer stock;
    Integer montoMinimo;
    Integer montoMaximo;

    public Proveedor(Persona persona, String rubro, Integer stock, Integer montoMinimo, Integer montoMaximo) {
        this.id = UUID.randomUUID();
        this.persona = persona;
        this.rubro = rubro;
        this.stock = stock;
        this.montoMinimo = montoMinimo;
        this.montoMaximo = montoMaximo;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getMontoMinimo() {
        return montoMinimo;
    }

    public void setMontoMinimo(Integer montoMinimo) {
        this.montoMinimo = montoMinimo;
    }

    public Integer getMontoMaximo() {
        return montoMaximo;
    }

    public void setMontoMaximo(Integer montoMaximo) {
        this.montoMaximo = montoMaximo;
    }
}
