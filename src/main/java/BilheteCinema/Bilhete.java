package BilheteCinema;

public abstract class Bilhete {
    protected Cliente cliente;

    protected float precoBilhe;

    public Bilhete(float precoBilhe) {
        this.precoBilhe = precoBilhe;
    }

    public  void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setPrecoBilhe(float precoBilhe){
        this.precoBilhe = precoBilhe;
    }

    public abstract float calcularPreco();
}
