package EjercicioPosnet;

public class TarjetaCredito {
    private String entidadBancaria;
    private String nroTarjeta;
    private double saldo;
    private EntidadFinanciera entidadFinanciera;
    private persona titular;


    public TarjetaCredito(String entidadBancaria, String nroTarjeta, double saldo, EntidadFinanciera entidadFinanciera, persona titular) {
        this.entidadBancaria = entidadBancaria;
        this.nroTarjeta = nroTarjeta;
        this.saldo = saldo;
        this.entidadFinanciera = entidadFinanciera;
        this.titular = titular;
    }

    public boolean haySaldoDisponible(double monto){
        return  saldo >= monto;
    }

    public void descontar(double monto){
        saldo -= monto;
    }

    public String nombreCompletoTitular(){
        return titular.nombreCompleto();
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" +
                "entidadBancaria='" + entidadBancaria + '\'' +
                ", nroTarjeta='" + nroTarjeta + '\'' +
                ", saldo=" + saldo +
                ", entidadFinanciera=" + entidadFinanciera +
                ", titular=" + titular +
                '}';
    }
}
