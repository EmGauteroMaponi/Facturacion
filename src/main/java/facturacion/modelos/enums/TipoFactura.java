package facturacion.modelos.enums;

public enum TipoFactura {
    COMPRA("compra"),
    VENTA("venta");

    private String value;
    TipoFactura(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

}
