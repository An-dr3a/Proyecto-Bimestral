package Controlador;

import java.util.*;
import java.io.*;
import Modelo.*;

public class Gestionar_Talleres {

    public ArrayList<Sistema_Taller> talleres;

    public Gestionar_Talleres() {
        this.talleres = new ArrayList<>();
    }

    public void registrarTalleres(Sistema_Taller tall) {
        talleres.add(tall);
    }

    public void asignarFacilitador(String nombreTaller, Persona_Facilitador facilitador) {
        for (Sistema_Taller t : talleres) {
            if (t.toString().contains(nombreTaller)) {
                t.asignarFacilitador(facilitador);
            }
        }
    }

    public void inscribirParticipantes(String nombreTaller, Persona_Participante participante) {
        for (Sistema_Taller tal : talleres) {
            if (tal.toString().contains(nombreTaller)) {
                if (!tal.aregrarParticipante(participante)) {
                    System.out.println("Cupo lleno en el taller " + nombreTaller);
                }
            }
        }
    }

    public void guardarDatos(String archivo) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo))) {
            out.writeObject(talleres);
        } catch (IOException e) {
        }
    }

    public void subirDatos(String archivo) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            talleres = (ArrayList<Sistema_Taller>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
        }
    }

    public void reporteFinal() {
        for (Sistema_Taller t : talleres) {
            System.out.println("\nTaller" + t
                    + "\nFacilitador: " + t.facilitador
                    + "\nParticipantes: ");
            for (Persona_Participante p : t.participantes) {
                System.out.println(" - " + p);
            }
        }
    }
}
