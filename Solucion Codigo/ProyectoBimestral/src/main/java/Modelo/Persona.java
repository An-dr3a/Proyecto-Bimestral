package Modelo;
import java.io.Serializable;

public class Persona implements Serializable{

    public String nombre;
    public String cedula;
    public int edad;

    public Persona(String nombre, String cedula, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", cedula=" + cedula + '}';
    }

}
