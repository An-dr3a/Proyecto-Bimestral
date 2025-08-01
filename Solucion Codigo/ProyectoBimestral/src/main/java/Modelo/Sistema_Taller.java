package Modelo;

import java.util.*;

public class Sistema_Taller {

    public String nombre;
    public String tipoTaller;
    public double duracion;
    public String materiales;
    public int nivelDificultad;
    public int cupoMaximo;
    public Persona_Facilitador facilitador;
    public ArrayList<Persona_Participante> participantes;

    public Sistema_Taller(String nombre, String tipoTaller, double duracion, String materiales, int nivelDificultad, int cupoMaximo) {
        this.nombre = nombre;
        this.tipoTaller = tipoTaller;
        this.duracion = duracion;
        this.materiales = materiales;
        this.nivelDificultad = nivelDificultad;
        this.cupoMaximo = cupoMaximo;
        this.participantes = new ArrayList<>();
    }

    public boolean aregrarParticipante(Persona_Participante par) {
        if (participantes.size() < cupoMaximo) {
            participantes.add(par);
            return true;
        }
        return false;
    }

    public void asignarFacilitador(Persona_Facilitador fac) {
        this.facilitador = fac;
    }

    @Override
    public String toString() {
        return "Sistema_Taller{" + "nombre=" + nombre + ", tipoTaller="
                + tipoTaller + ", duracion=" + duracion + ", materiales="
                + materiales + ", nivelDificultad=" + nivelDificultad + ", cupoMaximo="
                + cupoMaximo + ", facilitador=" + facilitador + ", participantes="
                + participantes + '}';
    }

}
