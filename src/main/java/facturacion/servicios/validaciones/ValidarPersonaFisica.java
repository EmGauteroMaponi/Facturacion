/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturacion.servicios.validaciones;

import facturacion.modelos.Fisica;
import facturacion.modelos.Persona;

/**
 *
 * @author emanu
 */
public class ValidarPersonaFisica implements ValidarPersona {
    @Override
    public boolean validarVendedor(Persona fisica){
        return true;
    }
    @Override
    public boolean validarComprador(Persona fisica){
        return true;
    }
}
