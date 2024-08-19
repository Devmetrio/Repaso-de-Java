package EjercicioBarajaInglesa.cartas;

import EjercicioBarajaInglesa.baraja.Palo;

public class CartaFigura extends CartaConPalo{
    private char letra;

    public CartaFigura(Palo palo, char letra) {
        super(palo);
        this.letra = letra;
    }
}
