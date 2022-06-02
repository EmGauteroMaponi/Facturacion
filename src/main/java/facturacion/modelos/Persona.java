package facturacion.modelos;

import java.util.UUID;

public abstract class Persona {
    UUID id;
    String telefono;
    String mail;
    String direccion;
    String nombre;

    public Persona(String telefono, String mail, String direccion, String nombre) {
        this.id = UUID.randomUUID();
        this.telefono = telefono;
        this.mail = mail;
        this.direccion = direccion;
        this.nombre = nombre;
    }

    public UUID getId() {
        return id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
