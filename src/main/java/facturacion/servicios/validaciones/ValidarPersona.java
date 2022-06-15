/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package facturacion.servicios.validaciones;

import facturacion.modelos.Persona;

/**
 *
 * @author emanu
 */
public interface ValidarPersona {
    public boolean validarVendedor(Persona persona);
    public boolean validarComprador(Persona persona);
    
}
