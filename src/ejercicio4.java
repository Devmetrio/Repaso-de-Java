import java.util.*;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabraAdivinar = PalabraEscogida();
        int intentos = 8;
        List<Character> letrasAdivinadas = new ArrayList<>();
        while(intentos>0){
            StringBuilder lineas = Pantalla(palabraAdivinar, letrasAdivinadas);
            System.out.println(lineas);
            if(!lineas.toString().contains("_")){
                System.out.println("¡¡Felicidades, completaste todas las letras!!");
                break;
            }
            System.out.print("Ingrese una letra:");
            String input = scanner.nextLine();
            char letra = input.charAt(0);

            if(letrasAdivinadas.contains(letra)){
                System.out.println("Ya ingresó esa letra, intente con otra letra");
            }else{
            letrasAdivinadas.add(letra);
                if(palabraAdivinar.contains(String.valueOf(letra))){
                    System.out.println("Bien hecho sigue así\n");
                }else{
                intentos--;
                    if (intentos==0){
                        System.out.println("!!Perdiste, fuiste colgado!!");
                        DibujarColgado(intentos);
                        break;
                    }
                System.out.println("Fallaste, te quedan " + intentos + " intentos");
                DibujarColgado(intentos);
            }
            }
        }

    }
    static String PalabraEscogida(){
        List<String> arreglo = new ArrayList<>();
        Collections.addAll(arreglo, "camara", "television", "licuadora","cafetera");
        Random random = new Random();
        return arreglo.get(random.nextInt(arreglo.size()));
    }

    static StringBuilder Pantalla(String palabra, List<Character> letraAdivinada){
        StringBuilder tablero = new StringBuilder();
        for(int i=0; i < palabra.length(); i++){
            char letra = palabra.charAt(i);
            if(letraAdivinada.contains(letra)){
                tablero.append(letra);
            }else{
                tablero.append("_");
            }
        }
        return tablero;
    }

    static void DibujarColgado(int intentos){
        String dibujo = "";
        switch (intentos){
            case 7:
                dibujo = " ---";
                break;
            case 6:
                dibujo = """
                           ---
                             |
                             |""";
                break;
            case 5:
                dibujo = """
                           ---
                             |
                             |
                             ▀""";
                break;
            case 4:
                dibujo = """
                           ---
                             |
                             |
                             ▀
                             |""";
                break;
            case 3:
                dibujo = """
                           ---
                             |
                             |
                             ▀
                           --|""";
                break;
            case 2:
                dibujo = """
                           ---
                             |
                             |
                             ▀
                           --|--""";
                break;
            case 1:
                dibujo = """
                           ---
                             |
                             |
                             ▀
                           --|--
                            /""";
                break;
            case 0:
                dibujo = """
                           ---
                             |
                             |
                             ▀
                           --|--
                            / \\""";
                break;
        }
        System.out.println(dibujo+"\n\n");
    }
}
