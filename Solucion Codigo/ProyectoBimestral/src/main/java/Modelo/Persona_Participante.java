package Modelo;

public class Persona_Participante extends Persona {

    public String nivel;

    public Persona_Participante(String nombre, String cedula, int edad) {
        super(nombre, cedula, edad);
        this.nivel = "Principiante";
    }

    public void actualizarNicelProgreso(String nuevo) {
        this.nivel = nuevo;
    }

    @Override
    public String toString() {
        return "Persona_Participante{" + "edad=" + edad + ", nivel=" + nivel + '}';
    }

}
