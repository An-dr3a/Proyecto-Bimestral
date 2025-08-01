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

    public boolean agregrarParticipante(Persona_Participante par) {
        if (participantes.size() < cupoMaximo) {
            participantes.add(par);
            return true;
        }
        return false;
    }

    public void asignarFacilitador(Persona_Facilitador fac) {
        this.facilitador = fac;
    }

    public String crearArchivoCSV() {

        return String.format("%s;%s;%.2f;%s;%d;%d;%s",
                nombre, tipoTaller, duracion, materiales, nivelDificultad, cupoMaximo, facilitador.cedula);
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre
                + "\nTipo de Taller: " + tipoTaller
                + "\nDuracion: " + duracion
                + "\nMateriales: " + materiales
                + "\nNivel de Dificultad: " + nivelDificultad
                + "\nCupos Maximos: " + cupoMaximo
                + "\nFacilitador: " + (facilitador != null ? facilitador.nombre
                        + facilitador.especialidad : "No existe facilitador")
                + "\nParticipantes: " + participantes;

    }

}
