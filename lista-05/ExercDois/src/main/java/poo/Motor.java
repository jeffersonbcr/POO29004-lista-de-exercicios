package poo;

public class Motor {
    private double velocidade;
    private final double velocidadeMax = 100;
    private final double velocidadeMim = 0;
    public Motor() {
        this.velocidade = 0;
    }

    public boolean setVelocidade(double velocidade) {
        if(getVelocidade() + velocidade <= this.velocidadeMax && getVelocidade()+velocidade >= this.velocidadeMim){
            this.velocidade = getVelocidade() + velocidade;
            return true;
        }
       else return false;

    }

    public double getVelocidade() {
        return velocidade;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "velocidade=" + velocidade +
                '}';
    }
}
