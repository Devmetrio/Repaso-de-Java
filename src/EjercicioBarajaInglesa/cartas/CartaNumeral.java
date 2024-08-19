package EjercicioBarajaInglesa.cartas;

import EjercicioBarajaInglesa.baraja.Palo;

public class CartaNumeral extends CartaConPalo {
    private int numero;

    public CartaNumeral(Palo palo, int numero) {
        super(palo);
        this.numero = numero;
    }
}
