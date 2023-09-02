package lab7p2_.luishenriquez;


public class VENDEDOR {


private String nombre;

private int carrosv;

private int dinero;

    public VENDEDOR(String nombre, int carrosv, int dinero) {
        this.nombre = nombre;
        this.carrosv = carrosv;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCarrosv() {
        return carrosv;
    }

    public void setCarrosv(int carrosv) {
        this.carrosv = carrosv;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "VENDEDOR : " 
                + "Nombre = " + nombre + "," + " \n" + 
                "Carros vendidos = " + carrosv + "," + " \n" + 
                "Dinero generado = " + dinero ;
    }

 





    
}
