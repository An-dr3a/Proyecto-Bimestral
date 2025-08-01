package Controlador;

import java.util.*;
import java.io.*;
import Modelo.*;

public class Gestionar_Talleres {

    public ArrayList<Sistema_Taller> talleres;
    public ArrayList<Persona_Facilitador> facilitadores;
    public ArrayList<Persona_Participante> participantes;

    public Gestionar_Talleres() {
        this.talleres = new ArrayList<>();
        this.facilitadores = new ArrayList<>();
        this.participantes = new ArrayList<>();
    }

    public void registrarTalleres(Sistema_Taller tall) {
        talleres.add(tall);
    }

    public void asignarFacilitador(String nombreTaller, Persona_Facilitador facilitador) {
        for (Sistema_Taller t : talleres) {
            if (t.toString().contains(nombreTaller)) {
                t.asignarFacilitador(facilitador);
                if (!facilitadores.contains(facilitador)) {
                    facilitadores.add(facilitador);
                }
            }
        }
    }

    public void inscribirParticipantes(String nombreTaller, Persona_Participante participante) {
        for (Sistema_Taller tal : talleres) {
            if (tal.nombre.contains(nombreTaller)) {
                if (tal.agregrarParticipante(participante)) {
                    participantes.add(participante);
                } else {
                    System.out.println("Cupo lleno en el taller " + nombreTaller);
                }
            }
        }
    }

    public void guardarDatosDeTalleresCSV(String archivo) {
        try (Formatter formatter = new Formatter(new File(archivo))) {
            formatter.format("NOMBRE;TIPO;DURACION;MATERIALES;NIVEL;CUPO;CEDULA_FACILITADOR\n");
            for (Sistema_Taller taller : talleres) {
                formatter.format("%s\n", taller.crearArchivoCSV());
            }
        } catch (IOException e) {
        }
    }

    public void guardarDatosDeFacilitadoresCSV(String archivo) {
        try (Formatter formatter = new Formatter(new File(archivo))) {
            formatter.format("NOMBRE;CEDULA;EDAD;ESPECIALIDAD\n");
            for (Persona_Facilitador fac : facilitadores) {
                formatter.format("%s\n", fac.tipoCSV());
            }
        } catch (IOException e) {
        }
    }

    public void guardarDatosDeParticipantesCSV(String archivo) {
        try (Formatter formatter = new Formatter(new File(archivo))) {
            formatter.format("NOMBRE;CEDULA;EDAD;NIVEL\n");
            for (Persona_Participante par : participantes) {
                formatter.format("%s\n", par.tipoCSV());
            }
        } catch (IOException e) {
        }
    }

    public void reporteFinal() {
        for (Sistema_Taller t : talleres) {
            System.out.println("----TALLER----" + t
                    + "\n\nFacilitador: " + t.facilitador
                    + "\n\nParticipantes: " + t.participantes);

        }
    }
}
