import java.util.Scanner;

public class ejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero:");
        double numero1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo numero:");
        double numero2 = scanner.nextDouble();
        System.out.print("Ingrese el tercer numero:");
        double numero3 = scanner.nextDouble();

        calcular_promedio(numero1,numero2,numero3);
    }

    public static void calcular_promedio (double n1, double n2, double n3){
        double promedio = (n1+n2+n3)/3;
        System.out.println("El promedio de los numeros es: " +promedio);
    }
}
