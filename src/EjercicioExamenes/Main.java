package EjercicioExamenes;

public class Main {
    public static void main(String[] args) {
        CentroEducativo c = new CentroEducativo();

        Alumno pepe = new Alumno("123","Fulano", "Pepe");
        Alumno maria = new Alumno("2548","Mengano", "Maria");
        Alumno luis = new Alumno("874", "Porras", "Luis");
        Alumno german = new Alumno("8421", "Ames", "German");

        german.agregarExamen(new ExamenEscrito(90,8,"00/00/2020"));
        german.agregarExamen(new ExamenOral(NivelSatisfaccion.EXCELENTE, "00/00/2024"));

        pepe.agregarExamen(new ExamenEscrito(40,7,"00/00/0000"));
        pepe.agregarExamen(new ExamenOral(NivelSatisfaccion.SUFICIENTE, "00/00/0000"));
        pepe.agregarExamen(new ExamenEscrito(89,10,"00/00/0000"));

        maria.agregarExamen(new ExamenEscrito(60,4,"00/00/0000"));
        maria.agregarExamen(new ExamenEscrito(65,8,"00/00/0000"));
        maria.agregarExamen(new ExamenOral(NivelSatisfaccion.EXCELENTE, "00/00/0000"));

        luis.agregarExamen(new ExamenEscrito(100,5,"00/00/0000"));
        luis.agregarExamen(new ExamenOral(NivelSatisfaccion.INSUFICIENTE, "00/00/0000"));
        luis.agregarExamen(new ExamenOral(NivelSatisfaccion.EXCELENTE, "00/00/0000"));

        c.agregarAlumno(pepe);
        c.agregarAlumno(maria);
        c.agregarAlumno(luis);
        c.agregarAlumno(german);

        System.out.println("Cantidad de aprobados: " + c.cantAprobados());
    }
}
