
package lab7p2_.luishenriquez;


public class VEHICULO {

private String marca;

private String color;

private String modelo;

private int anio;

private int precioventa;

    public VEHICULO(String marca, String color, String modelo, int anio, int precioventa) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.anio = anio;
        this.precioventa = precioventa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(int precioventa) {
        this.precioventa = precioventa;
    }

    @Override
    public String toString() {
        return "VEHICULO : " + "\n"+ 
                "Marca = " + marca + "," + " \n" + 
                "Color = " + color + "," + "\n"+ 
                "Modelo = " + modelo + "," + "\n"+ 
                "Anio = " + anio + "\n"+ 
                "Precio para la venta del vehiculo = " + precioventa ;
    }


    
    
    
    
}
