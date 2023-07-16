package poo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Drone drone = new Drone();
        int opcao = 0;
        do {
            System.out.println("Menu drone...");
            System.out.println("Digite 1 para: Decolar drone...");
            System.out.println("Digite 2 para: Alterar altitude...");
            System.out.println("Digite 3 para: Mover para uma direcao...");
            System.out.println("Digite 4 para: Mostrar posicao atual...");
            System.out.println("Digite 5 para: Carregar plano de voo e iniciar decolagem automatica...");
            System.out.println("Digite 6 para: Verificar o nivel de bateria...");
            System.out.println("Digite 7 para: Retornar para base...");
            System.out.println("Digite 8 para: capturar uma foto em uma coordenada...");
            System.out.println("Digite 9 para: alterar a velocidade de um motor...");
            System.out.println("Digite 0 para: Sair do menu...");
            Scanner teclado = new Scanner(System.in);
            System.out.print("Opcao: ");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    for(int ct = 0 ; ct < 4;ct++){
                        System.out.print("Digite a velocidade do motor " + (ct + 1) + " : ");
                        double vel= teclado.nextDouble();
                        if(drone.setMotor(ct,vel)){
                            System.out.println("velocidade ao motor adicionada com sucesso...");
                        }else{
                            System.out.println("Formato invalido para velocidade do motor...");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Digite para qual direcao deseja ir...");
                    System.out.println("C para cima...");
                    System.out.println("B para baixo...");
                    String valorZ = teclado.next();
                    if(drone.verificaBateria()){
                        System.out.println("Drone sem bateria, nao pode realizar movimento");
                    }
                    else{
                        if(drone.movimentarZ(valorZ)){
                            System.out.println("Drone movimentado com sucesso");
                        }
                        else{
                            System.out.println("Erro no formato em relacao a coordenada");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite para qual direcao deseja ir...");
                    System.out.println("D para direta...");
                    System.out.println("F para frente...");
                    System.out.println("E para esquerda...");
                    System.out.println("T para tras...");
                    String direcao = teclado.next();
                    try{
                        Integer.parseInt(direcao);
                        System.out.println("Direcao invalida");
                    } catch (Exception e){
                        if (direcao.length() == 1) {
                            switch (direcao.toUpperCase()){
                                case "D":
                                    System.out.print("Digite o valor que deseja movimentar para direita: ");
                                    String valorD = teclado.next();
                                    if(drone.verificaBateria()){
                                        System.out.println("Drone sem bateria, nao pode realizar movimento");
                                    }
                                    else{
                                        if(drone.movimentarY(valorD)){
                                            System.out.println("Drone movimentado com sucesso");
                                        } else{
                                            System.out.println("Drone sem bateria suficiente para realizar movimento, ou formato invalido de coordenada");
                                        }
                                    }
                                    break;
                                case "F":
                                    System.out.print("Digite o valor que deseja movimentar para Frente: ");
                                    String valorF = teclado.next();
                                    if(drone.verificaBateria()){
                                        System.out.println("Drone sem bateria, nao pode realizar movimento");
                                    }
                                    else{
                                        if(drone.movimentarX(valorF)){
                                            System.out.println("Drone movimentado com sucesso");
                                        } else{
                                            System.out.println("Drone sem bateria suficiente para realizar movimento, ou formato invalido de coordenada");
                                        }
                                    }
                                    break;
                                case "E":
                                    System.out.print("Digite o valor que deseja movimentar para esquerda: ");
                                    String valorE = teclado.next();
                                    if(drone.verificaBateria()){
                                        System.out.println("Drone sem bateria , nao pode realizar movimento");
                                    }
                                    else{
                                        if(drone.movimentarY("-"+valorE)){
                                            System.out.println("Drone movimentado com sucesso");
                                        } else{
                                            System.out.println("Drone sem bateria suficiente para realizar movimento, ou formato invalido de coordenada");
                                        }
                                    }
                                case "T":
                                    System.out.print("Digite o valor que deseja para movimentar para tras: ");
                                    String valorT = teclado.next();
                                    if(drone.verificaBateria()){
                                        System.out.println("Drone sem bateria , nao pode realizar movimento");
                                    }
                                    else{
                                        if(drone.movimentarX("-"+valorT)){
                                            System.out.println("Drone movimentado com sucesso");
                                        } else{
                                            System.out.println("Drone sem bateria suficiente para realizar movimento, ou formato invalido de coordenada");
                                        }
                                    }
                                    break;
                                default:
                                    System.out.println("Opcao invalida");
                                    break;
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println(drone.posicaoAtual());
                    break;
                case 5:
                    System.out.print("Digite a coordenada que o drone deva ir: ");
                    String coo = teclado.next();
                    if(drone.verificaBateria()){
                        System.out.println("drone sem bateria para realizar movimento...");
                    }
                    else{
                        if(drone.movimentarAutomatico(coo)){
                            System.out.println("Drone foi movimentado com sucesso...");
                        }
                        else{
                            System.out.println("formato invalido da coordenada...");
                        }
                    }
                    break;
                case 6:
                    System.out.println(drone.nivelBateria());
                    break;
                case 7:
                    if(drone.retornarBase()){
                        System.out.println("Drone retornou para base com sucesso");
                    }else{
                        System.out.println("Drone sem bateria para retornar para base....");
                    }
                    break;
                case 8:
                    System.out.print("Digite a coordenada que deseja tirar a foto: ");
                    String coordenadaFoto = teclado.next();
                    if(drone.baterFoto(coordenadaFoto)){
                        System.out.println("Drone tirou uma foto com sucesso.");
                        System.out.println(drone.mostrarFotos());
                    }else{
                        System.out.println("Nao foi possivel tirar foto nesta coordenada, drone nao esta nela...");
                    }
                    break;
                case 9:
                    System.out.print("Digite o valor que deseja mudar a velocidade do motor: ");
                    Double vel = teclado.nextDouble();
                    System.out.print("Digite qual motor deseja mudar a velocidade: ");
                    String posMotor = teclado.next();
                    if(drone.verificaBateria()){
                        System.out.println("Drone sem bateria o suficiente para mudar a velocidade do motor...");
                    }else{
                        if(drone.setMotor(Integer.parseInt(posMotor),vel)){
                            System.out.println("Drone mudou a velocidade do motor com sucesso...");
                        }
                        else{
                            System.out.println("Formato invalido para a velocidade do motor ou nao respeita o limite...");
                        }
                    }
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;

            }
        }while(opcao!=0);
    }
}
