package poo;

import java.util.Arrays;

public class Drone {
    private Motor motor[];
    private Bateria bateria;
    private Camera camera;
    private Gps gps;

    public Drone() {
        this.motor = new Motor[4];
        this.bateria = new Bateria();
        this.camera = new Camera();
        this.gps = new Gps();
    }
    public Boolean setMotor(int pMotor,Double velocidade){
        Motor m = new Motor();
       if(m.setVelocidade(velocidade)){
           motor[pMotor] = m;
           bateria.utilizarBateriaParaVelocidade();
           return true;
       }
       return true;
    }
    public Boolean movimentarZ(String Z){
        if(gps.setCoordenadaAtualZ(Z)){
            return bateria.utilizarBateriaParaMovimentar(gps.getVetCoordenadaAtual(),"0,0,"+Z);

        }
        return false;
    }
    public Boolean movimentarX(String x){
        if(gps.setCoordenadaAtualX(x)){
            return bateria.utilizarBateriaParaMovimentar(gps.getVetCoordenadaAtual(),x+",0,0");
        }
        return false;
    }
    public Boolean movimentarY(String y){
        if(gps.setCoordenadaAtualY(y)){
            return bateria.utilizarBateriaParaMovimentar(gps.getVetCoordenadaAtual(),y+",0,0");
        }
        return false;
    }
    public String posicaoAtual(){
        return gps.getVetCoordenadaAtual();
    }
    public String nivelBateria(){
        return bateria.toString();
    }
    public Boolean movimentarAutomatico(String coordenada){
        return bateria.utilizarBateriaParaMovimentar(gps.getVetCoordenadaInicial(),coordenada);
    }
    public Boolean verificaBateria(){
        Boolean retorno = false;
        if(bateria.getPorcentagem() <= 10){
            gps.setCoordenadaAtual(gps.getVetCoordenadaInicial());
            return true;
        }
        return retorno;
    }
    public Boolean retornarBase(){
        return bateria.utilizarBateriaParaMovimentar(gps.getVetCoordenadaInicial(),gps.getVetCoordenadaAtual());

    }
    public Boolean baterFoto(String coordenada){
        if(gps.getVetCoordenadaAtual() ==coordenada){
            return true;
        }
        return false;
    }
    public String mostrarFotos(){
        return camera.toString();
    }
}
