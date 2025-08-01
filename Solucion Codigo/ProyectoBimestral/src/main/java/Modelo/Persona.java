package Modelo;

import java.io.Serializable;

public abstract class Persona implements Serializable {

    public String nombre;
    public String cedula;
    public int edad;

    public Persona(String nombre, String cedula, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
    }

    public abstract String tipoCSV();

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + "\n\t\tCedula: " + cedula
                + "\n\t\tEdad; " + edad;
    }

}
