import java.util.ArrayList;
import java.util.List;

public class ejercicio3 {
    public static void main(String[] args) {
        List<Integer> valores = new ArrayList<Integer>();
        int numero=1;
        while(valores.size()<100){
            if (verificar_primo(numero)){
                valores.add(numero);
            }
            numero++;
        }
        System.out.println(valores);

    }
    public static boolean verificar_primo(int numero){
        boolean Esprimo = true;
        for (int i =2; i < numero ; i++) {
            if(numero%i==0){
                Esprimo = false;
                return Esprimo;
            }
        }
        return Esprimo;
    }
}
