package Vista;

import Controlador.*;
import Modelo.*;

public class SistemaDeTalleresArtisticos {

    public static void main(String[] args) {

        Gestionar_Talleres gestionar = new Gestionar_Talleres();

        Sistema_Taller danza = new Sistema_Taller("Taller Danza contemporanea",
                "Danza", 10, "Preferible ropa deportiva", 8, 15);
        Sistema_Taller pintura = new Sistema_Taller("Taller pintura basica",
                "Pintura", 20, "Ropa vieja", 5, 25);

        Persona_Facilitador facilitador1 = new Persona_Facilitador("Andres", "1112383", 36, "Danza");
        Persona_Facilitador facilitador2 = new Persona_Facilitador("Sofia", "1112385", 27, "Pintura");
        gestionar.asignarFacilitador("Danza", facilitador1);
        gestionar.asignarFacilitador("Pintura", facilitador2);

        Persona_Participante participante1 = new Persona_Participante("Camila", "4546566", 15);
        Persona_Participante participante2 = new Persona_Participante("Miguel", "2123445", 18);
        gestionar.inscribirParticipantes("Danza", participante1);
        gestionar.inscribirParticipantes("Pintura", participante2);

        gestionar.reporteFinal();
    }
}
