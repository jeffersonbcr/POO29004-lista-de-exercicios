package poo;

import java.util.Arrays;

public class Gps {
    private String [] vetCoordenadaAtual;
    private String [] vetCoordenadaInicial;

    public Gps() {
        this.vetCoordenadaAtual = new String[3];
        this.vetCoordenadaInicial = new String[3];
    }

    public String getVetCoordenadaAtual() {
        return vetCoordenadaAtual[0]+","+vetCoordenadaAtual[1]+","+vetCoordenadaAtual[2];
    }

    public String getVetCoordenadaInicial() {
        return vetCoordenadaInicial[0]+","+vetCoordenadaAtual[1]+","+vetCoordenadaAtual[2];
    }

    public Boolean setCoordenadaAtual(String coordenadaAtual) {
        boolean retorno=false;
        try{
            this.vetCoordenadaAtual = coordenadaAtual.split(",");
            retorno = true;
        } catch (Exception e){
            retorno = false;
        }
        return retorno;
    }

    public Boolean setCoordenadaInicial(String coordenadaInicial) {
        boolean retorno=false;
        try{
            this.vetCoordenadaInicial = coordenadaInicial.split(",");
            try{
                for(int ct = 0 ; ct < 3 ; ct++) {
                    Double.parseDouble(this.vetCoordenadaInicial[ct]);
                    retorno = true;
                }
            } catch (Exception e){
                retorno = false;
            }
            retorno = true;
        } catch (Exception e){
            retorno = false;
        }
        return retorno;
    }
    public Boolean setCoordenadaAtualX(String x){
        Boolean retorno= false;
        try{
            double coordenadaZ = Double.parseDouble(x);
            vetCoordenadaAtual[0] = x;
            retorno = true;
        }  catch (Exception e){
            retorno = false;
        }
        return retorno;
    }
    public Boolean setCoordenadaAtualY(String y){
        Boolean retorno= false;
        try{
            double coordenadaY = Double.parseDouble(y);
            vetCoordenadaAtual[1] = y;
            retorno = true;
        }  catch (Exception e){
            retorno = false;
        }
        return retorno;
    }
    public Boolean setCoordenadaAtualZ(String z){
        Boolean retorno= false;
        try{
            double coordenadaZ = Double.parseDouble(z);
            vetCoordenadaAtual[2] = z;
            retorno = true;
        }  catch (Exception e){
            retorno = false;
        }
        return retorno;
    }

    @Override
    public String toString() {
        return "Gps{" +
                "vetCoordenadaAtual=" + Arrays.toString(vetCoordenadaAtual) +
                ", vetCoordenadaInicial=" + Arrays.toString(vetCoordenadaInicial) +
                '}';
    }
}
