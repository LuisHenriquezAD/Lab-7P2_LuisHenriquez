package lab7p2_.luishenriquez;


public class CLIENTE {

private String nombrec;

private int edad;

private String profesion;

private int carrosC;

private int sueldo;

    public CLIENTE(String nombrec, int edad, String profesion, int carrosC, int sueldo) {
        this.nombrec = nombrec;
        this.edad = edad;
        this.profesion = profesion;
        this.carrosC = carrosC;
        this.sueldo = sueldo;
    }

    public String getNombrec() {
        return nombrec;
    }

    public void setNombrec(String nombrec) {
        this.nombrec = nombrec;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getCarrosC() {
        return carrosC;
    }

    public void setCarrosC(int carrosC) {
        this.carrosC = carrosC;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    

    @Override
    public String toString() {
        return "CLIENTE : " + "\n" +
                "Nombre del cliente = " + nombrec + "," + " \n" +  
                " Edad = " + edad + "," + " \n" + 
                "Profesion del cliente = " + profesion+ "," + " \n" + 
                "Carros Comprados por el cliente = " + carrosC + "," + " \n" +   
                "Sueldo disponible = " + sueldo ;
    }



    
}
