package poo;

public class Bateria {
    private double porcentagem;
    private final double bateriaMim = 10;
    private final double bateriaMax = 100;
    private final double gastoMotor = 2.5;
    public Bateria() {
        this.porcentagem = 100;
    }

    public double getPorcentagem() {
        return porcentagem;
    }
    public Boolean utilizarBateriaParaMovimentar(String c1, String c2){
        boolean retorno = false;
        try {
            String [] vetC1 = c1.split(",");
            String [] vetC2 = c2.split(",");
            double custo = Math.sqrt(Math.pow(Double.parseDouble(vetC2[0])- Double.parseDouble(vetC1[0]),2)+Math.pow(Double.parseDouble(vetC2[1])- Double.parseDouble(vetC1[1]),2)+Math.pow(Double.parseDouble(vetC2[2])- Double.parseDouble(vetC1[2]),2));
            if(custo <= this.bateriaMim || custo >= bateriaMax){
                retorno = false;
            }
            else {
                this.porcentagem = porcentagem - custo;
                retorno = true;
            }
        } catch (Exception e){
            retorno = false;
        }
        return retorno;
    }
    public Boolean utilizarBateriaParaVelocidade(){
        boolean retorno= false;
        if(this.porcentagem - this.gastoMotor <= this.bateriaMim || this.porcentagem - this.gastoMotor >= bateriaMax){
            retorno = false;
        }
        else{
            this.porcentagem = this.porcentagem - this.gastoMotor;
            retorno = true;
        }
        return retorno;
    }

    @Override
    public String toString() {
        return "Bateria{" +
                "porcentagem=" + porcentagem +
                "%"+ '}';
    }

}
