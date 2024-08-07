package EjercicioPosnet;

public class Posnet {
    public static final double RECARGO_POR_CUOTA = 0.03;
    public static final int MIN_CANT_CUOTAS = 1;
    public static final int MAX_CANT_CUOTAS = 6;

    public Ticket efectuarPago(TarjetaCredito tarjeta, double montoAbonar, int cantCuotas){
        Ticket elticket = null;
        if(datosValidos(tarjeta, montoAbonar, cantCuotas)){
            double montoFinal = montoAbonar + montoAbonar * recargoSegunCuotas(cantCuotas);
            if(tarjeta.haySaldoDisponible(montoFinal)){
            tarjeta.descontar(montoFinal);
            String nomApe = tarjeta.nombreCompletoTitular();
            double montoPorCuota = montoFinal / cantCuotas;
            elticket = new Ticket(nomApe, montoFinal, montoPorCuota);
            }
        }
        return elticket;
    }

    private  boolean datosValidos(TarjetaCredito tarjeta,double monto, int cant){
        boolean tarjetaValida = tarjeta != null;
        boolean montoValido = monto>0;
        boolean cantCuotasValidas = cant >= MIN_CANT_CUOTAS && cant <= MAX_CANT_CUOTAS;
        return tarjetaValida && montoValido && cantCuotasValidas;
    }

    private double recargoSegunCuotas(int cantCuotas){
        return  (cantCuotas - 1) * RECARGO_POR_CUOTA;
    }

}
