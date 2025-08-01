package Modelo;

public class Persona_Facilitador extends Persona {

    public String especialidad;

    public Persona_Facilitador(String nombre, String cedula, int edad, String especialidad) {
        super(nombre, cedula, edad);
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Persona_Facilitador{" + "especialidad=" + especialidad + '}';
    }

}
