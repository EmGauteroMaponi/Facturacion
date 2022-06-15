package facturacion.servicios;

import facturacion.modelos.Fisica;
import facturacion.modelos.Juridica;
import org.springframework.stereotype.Service;

@Service
public class FacturaServicio {

    private Boolean validarVendedor(Fisica vendedor){
        return vendedor.getDni()!=null || vendedor.getDni()!=0;
    }

    private Boolean validarVendedor(Juridica vendedor){
        return vendedor.getCuit() != null || vendedor.getCuit() != 0;
    }



}
