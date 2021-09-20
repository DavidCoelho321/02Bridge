package BilheteCinema;

public class ClienteDesconto extends Bilhete{

    public ClienteDesconto(float precoBilhe) {
        super(precoBilhe);
    }

    public float calcularPreco() {
        return this.precoBilhe * (this.cliente.descontoBilhete());
    }
}
