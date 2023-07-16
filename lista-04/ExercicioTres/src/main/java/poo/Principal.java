package poo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Soldado [] vetSoldados = new Soldado[10];
        Scanner teclado = new Scanner(System.in);
        int ct = 0,aux =0;
        while(ct == 0){
            System.out.println("Inicio do menu...");
            System.out.println("Digite 1 para criar um soldado...");
            System.out.println("Digite 2 para verificar total de soldados...");
            System.out.println("Digite 3 para movimentar um soldado...");
            System.out.println("Digite 4 para movimentar todos soldados...");
            System.out.println("Digite 5 para atacar com todos os soldados...");
            System.out.println("Digite 6 para finalizar aplicativo...");
            System.out.println("Fim do menu..");
            System.out.print("opcao: ");
            String opcao = teclado.nextLine();
            switch(opcao){
                case "1":
                    System.out.print("Digite o nome do soldado: ");
                    String nomeSoldado = teclado.nextLine();
                    System.out.print("Digite a posicao inicial do soldado: ");
                    String posInicial = teclado.nextLine();
                    Soldado soldado = new Soldado(Integer.parseInt(posInicial),nomeSoldado);
                    vetSoldados[aux] = soldado;
                    aux++;
                    break;
                case "2":
                    for(int cont =0 ; cont< Soldado.getTamanhoExercito() ; cont++){
                        System.out.println("Soldado: " + vetSoldados[ct].getNome() + " posicao no pelotao : " + cont);
                    }
                    System.out.println("Tamanho do exercito: " + Soldado.getTamanhoExercito());
                    break;
                case "3":
                    System.out.println("Digite a posicao do soldado em relacao a posicao que esta no pelotao de 0 a : " + Soldado.getTamanhoExercito());
                    int position = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Digite a distancia do deslocamento para movimentar o soldado...");
                    System.out.print("Distancia: ");
                    String distancia = teclado.nextLine();
                    if(distancia.isEmpty()){
                        vetSoldados[position].movimentar();
                    }
                    else {
                        vetSoldados[position].movimentar(Integer.parseInt(distancia));
                    }
                    break;
                case "4":
                    for(int cont =0 ; cont< Soldado.getTamanhoExercito() ; cont++){
                        System.out.println("Digite a distancia do deslocamento para movimentar o soldado: " + vetSoldados[cont].getNome());
                        System.out.print("Distancia: ");
                        String delta = teclado.nextLine();
                        if(delta.isEmpty()){
                            vetSoldados[cont].movimentar();
                        }
                        else {
                            vetSoldados[cont].movimentar(Integer.parseInt(delta));
                        }
                    }
                    break;
                case "5":
                    if(Soldado.getTamanhoExercito()>0) {
                        for (int cont = 0; cont < Soldado.getTamanhoExercito(); cont++) {
                            System.out.println("Digite a arma para soldado: " + vetSoldados[cont].getNome() + " atacar...");
                            System.out.print("arma: ");
                            String arma = teclado.nextLine();
                            if (arma.isEmpty()) {
                                vetSoldados[cont].atacar();
                            } else {
                                vetSoldados[cont].atacar(arma);
                            }
                        }
                    }
                    else {
                        System.out.println("Exercito nao foi criado ainda...");
                    }
                    break;
                case "6":
                    System.out.println("finalizando aplicativo");
                    ct = 1;
                    break;
                default:
                    System.out.println("Opcao invalida");

            }
        }
    }
}
