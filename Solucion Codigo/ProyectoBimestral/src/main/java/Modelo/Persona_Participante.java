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
        return super.toString() + "\n\t\tNivel: " + nivel;
    }

    @Override
    public String tipoCSV() {

        return String.format("%s;%s;%d;%s", nombre, cedula, edad, nivel);

    }

}
