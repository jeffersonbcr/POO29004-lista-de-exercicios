package poo;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String plano = "";
        String [] vetDados = new String[0];
        while(leitor.hasNext()){
            String dado = leitor.nextLine();
            if(dado.length() > 1){
                String [] vetAuxDados = dado.split(",");
                vetDados = vetAuxDados;
            }
            else {
                plano = plano + dado;
            }
        }
        RoboExplorador PathFinder = new RoboExplorador(Integer.parseInt(vetDados[1]),Integer.parseInt(vetDados[2]),Integer.parseInt(vetDados[0]),Integer.parseInt(vetDados[0]),vetDados[3].charAt(0));
        PathFinder.explorar(plano);
    }
}
