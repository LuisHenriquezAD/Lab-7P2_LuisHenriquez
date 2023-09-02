package lab7p2_.luishenriquez;


public class VENTA {

private String vendedor;

private String cliente;

private String costo;
        
private String carro;

    public VENTA(String vendedor, String cliente, String costo, String carro) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.costo = costo;
        this.carro = carro;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    @Override
    public String toString() {
        return "VENTA" + "\n" + 
                "Nombre del vendedor = " + vendedor + "," + " \n" +   
                "Nombre del Cliente = " + cliente + "," + " \n" +  
                "Costo del coche = " + costo + "," + " \n" + 
                "Nombre del carro = " + carro ;
    }



    
    
}
