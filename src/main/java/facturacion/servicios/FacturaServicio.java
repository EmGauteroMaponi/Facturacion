package facturacion.servicios;

import facturacion.modelos.Factura;
import facturacion.modelos.Fisica;
import facturacion.modelos.Juridica;
import facturacion.modelos.Persona;
import facturacion.modelos.Producto;
import facturacion.modelos.enums.TipoFactura;

import java.util.Date;
import java.util.List;

public class FacturaServicio {

    private Boolean validarVendedor(Fisica vendedor){
        return vendedor.getDni()!=null || vendedor.getDni()!=0;
    }

    private Boolean validarVendedor(Juridica vendedor){
        return vendedor.getCuit() != null || vendedor.getCuit() != 0;
    }



}
