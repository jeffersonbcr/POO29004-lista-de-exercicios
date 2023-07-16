package poo;

import java.util.ArrayList;

public class Camera {
    private ArrayList<String> fotos;
    String [] vetCoordenada;

    public Camera() {
        this.fotos = new ArrayList<>();
        this.vetCoordenada = new String[3];
    }
    public Boolean baterFoto(String coordenada){
        Boolean retorno;
        try{
            vetCoordenada = coordenada.split(",");
            try{
                for(int ct = 0 ; ct < 3 ; ct++) {
                    Double.parseDouble(this.vetCoordenada[ct]);
                    retorno = true;
                }
            } catch (Exception e){
                retorno = false;
            }
            fotos.add(coordenada);
            retorno = true;
        }
        catch (Exception e){
            retorno = false;
        }
        return retorno;
    }

    public int numeroDeFotos(){
        return fotos.size();
    }

    @Override
    public String toString() {
        return "Camera{" +
                "fotos em coordenadas=" + fotos +
                '}';
    }
}
