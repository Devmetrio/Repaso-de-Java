import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // FUNCIONES
    Scanner scanner = new Scanner(System.in);
    System.out.println("¡BIENVENIDO!");
    System.out.println("INGRESE UNA OPCIÓN:" +
            "\n1. SUMAR" +
            "\n2. RESTAR" +
            "\n3. MULTIPLICAR" +
            "\n4. DIVIDIR");

    int opcion = scanner.nextInt();
    System.out.println("Ingrese valores para calcular:");
    System.out.print("a:");
    int a = scanner.nextInt();
    System.out.print("b:");
    int b = scanner.nextInt();

    if (opcion == 1){
        System.out.println(sumar(a,b));
    } else if (opcion == 2){
        System.out.println(restar(a,b));
    } else if (opcion == 3){
        System.out.println(multiplicar(a,b));
    } else if (opcion == 4){
        System.out.println(dividir(a,b));
    } else {
        System.out.println("Intente de nuevo");
    }
    scanner.close();

    }
    static String sumar(int a, int b) {
        return "El resultado de la suma es " + (a+b);
    };
    static String restar(int a, int b) {
        return "El resultado de la resta es " + (a-b);
    };
    static String multiplicar(int a, int b) {
        return "El resultado de la multiplicación es " + (a*b);
    };
    static String dividir(int a, int b) {
        if(b ==0){
        return "No se puede dividir un número entre 0";
        }
        return "El resultado de la division es " + a/b;
    };
}