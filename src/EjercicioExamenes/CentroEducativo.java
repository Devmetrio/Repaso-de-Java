package EjercicioExamenes;

import java.util.ArrayList;

public class CentroEducativo {
    private ArrayList<Alumno> alumnos;
    public CentroEducativo(){
        this.alumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno a){
        this.alumnos.add(a);
    }

    public int cantAprobados(){
        int cant = 0;
        for(Alumno al :alumnos){
            if (al.aprobo()){
                cant++;
            }
        }
        return cant;
    }
}
