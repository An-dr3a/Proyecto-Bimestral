package Modelo;

public class Persona_Facilitador extends Persona {

    public String especialidad;

    public Persona_Facilitador(String nombre, String cedula, int edad, String especialidad) {
        super(nombre, cedula, edad);
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\t\tEspecialidad: " + especialidad;
    }

    @Override
    public String tipoCSV() {

        return String.format("%s;%s;%d;%s", nombre, cedula, edad, especialidad);

    }
}
