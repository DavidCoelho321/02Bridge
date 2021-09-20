package BilheteCinema;

public class ClientePadrao extends Bilhete {

    public ClientePadrao(float precoBilhe) {
        super(precoBilhe);
    }

    public float calcularPreco() {
        return this.precoBilhe;
    }
}
