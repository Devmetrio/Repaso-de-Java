package EjercicioBarajaInglesa.baraja;

import EjercicioBarajaInglesa.cartas.Carta;
import EjercicioBarajaInglesa.cartas.CartaFigura;
import EjercicioBarajaInglesa.cartas.CartaJoker;
import EjercicioBarajaInglesa.cartas.CartaNumeral;

import java.util.ArrayList;

public class BarajaInglesa {
    private ArrayList<Carta> cartas;

    public BarajaInglesa(){
        this.cartas = new ArrayList<>();
        generarCartas();
    }

    public void mostrarBaraja(){
        for(Carta carta: cartas){
            carta.mostrar();
        }
    }

    public void generarCartas(){
        generarCartasNumerales();
        generarCartasFiguras();
        generarCartasJoker();
    }

    private void generarCartasJoker() {
        this.cartas.add(new CartaJoker(true));
        this.cartas.add(new CartaJoker(false));
    }

    private void generarCartasFiguras() {
        char[] letras = {'A','J','Q','K'};
        Palo[] palos = Palo.values();
        for (int p = 0; p < palos.length ; p++) {
            Palo paloActual = palos[p];
            for (int i = 0; i < letras.length; i++) {
                this.cartas.add( new CartaFigura(paloActual, letras[i]));
            }
        }
    }

    private void generarCartasNumerales(){
        final int MIN_VALOR = 2;
        final int MAX_VALOR = 10;
        Palo[] palos = Palo.values();
        for (int p = 0; p < palos.length ; p++) {
            Palo paloActual = palos[p];
            for (int i = MIN_VALOR; i <= MAX_VALOR; i++) {
                this.cartas.add( new CartaNumeral(paloActual, i));
            }
        }
    }
}
