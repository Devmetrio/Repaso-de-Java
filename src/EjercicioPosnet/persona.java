package EjercicioPosnet;

public class persona {
    private String DNI;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    public persona(String DNI, String nombre, String apellido, String telefono, String email) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }

    public  String nombreCompleto(){
        return nombre + " "+ apellido;
    }
}
