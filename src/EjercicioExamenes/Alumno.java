package EjercicioExamenes;

import java.util.ArrayList;

public class Alumno implements Aprobable{
    private String DNI;
    private String apellido;
    private String nombre;
    private ArrayList<Examen> examenes;

    public Alumno(String DNI, String apellido, String nombre) {
        this.DNI = DNI;
        this.apellido = apellido;
        this.nombre = nombre;
        this.examenes = new ArrayList<>();
    }

    public void agregarExamen(Examen e){
        this.examenes.add(e);
    }

    @Override
    public boolean aprobo() {
        int i = 0;
        while (i< this.examenes.size() && this.examenes.get(i).aprobo()){
            i++;
        }
        return i == this.examenes.size();
    }
}
