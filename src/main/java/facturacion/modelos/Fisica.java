package facturacion.modelos;

public class Fisica extends Persona{
    String apellido;
    Long dni;

    public Fisica(String telefono, String mail, String direccion, String nombre, String apellido, Long dni) {
        super(telefono, mail, direccion, nombre);
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }
}
