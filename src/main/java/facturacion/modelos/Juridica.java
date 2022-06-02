package facturacion.modelos;

public class Juridica extends Persona{
    Long cuit;
    String razonSocial;

    public Juridica(String telefono, String mail, String direccion, String nombre, Long cuit, String razonSocial) {
        super(telefono, mail, direccion, nombre);
        this.cuit = cuit;
        this.razonSocial = razonSocial;
    }

    public Long getCuit() {
        return cuit;
    }

    public void setCuit(Long cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
}
