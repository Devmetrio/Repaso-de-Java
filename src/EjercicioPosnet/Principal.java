package EjercicioPosnet;

public class Principal {
    public static void main(String[] args) {
        Posnet posnet = new Posnet();
        persona p = new persona("40545665","Pepe","Gomez","11123484","pepe@gmail.com");
        TarjetaCredito t = new TarjetaCredito("FakeBank", "165465465454", 15000, EntidadFinanciera.BINZA, p);

        System.out.println("Tarjeta antes del pago:");
        System.out.println(t);

        System.out.println("Ticket luego de pagar:");
        Ticket ticketGenerado = posnet.efectuarPago(t,10000,5);
        System.out.println(ticketGenerado);

        System.out.println("Tarjeta despues del pago");
        System.out.println(t);
    }
}
