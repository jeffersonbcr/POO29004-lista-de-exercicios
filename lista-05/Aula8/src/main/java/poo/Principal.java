package poo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Principal {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        int opcao = 0;
        do{
            System.out.println("Menu da Agenda...");
            System.out.println("Digite 1 para: Ver todos os contatos da agenda...");
            System.out.println("Digite 2 para: Adicionar contato a agenda...");
            System.out.println("Digite 3 para: Remover contato da agenda...");
            System.out.println("Digite 4 para: Atualizar dados de um contato da agenda...");
            System.out.println("Digite 5 para: Ver dados de um contato da agenda...");
            System.out.println("Digite 0 para: fechar a agenda...");
            System.out.print("Opcao do menu: ");
            Scanner teclado = new Scanner(System.in);

            opcao = teclado.nextInt();
            switch (opcao){
                case 1:
                    System.out.println(agenda.toString());
                    break;
                case 2:
                    String nome = null,sobrenome = null, option = null;
                    System.out.print("Digite o nome do contato: ");
                    try {
                         nome = teclado.next();
                        System.out.println("nome digitado: " + nome);
                    }catch (Exception e){
                        System.out.println("nome esta no formato invalido");
                    }
                    System.out.print("Digite o sobrenome do contato: ");
                    try {
                        sobrenome = teclado.next();
                        System.out.println("sobrenomenome digitado: " + sobrenome);
                    } catch (Exception e){
                        System.out.println("sobrenome esta no formato invalido");
                    }
                    int correto = 0;
                    LocalDate datNasc = null;
                    do{
                    System.out.print("Digite a data de nascimento da pessoa no formato (dd/mm/aaaa): ");
                    String data = teclado.next();
                    DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    try{
                        datNasc = LocalDate.parse(data,formatoData);
                        correto=1;
                    }
                    catch (Exception e){
                        System.out.println("Data nao esta no formato correto");
                    }
                    }while(correto != 0);

                    Pessoa pessoa = new Pessoa(nome,sobrenome,datNasc);
                    System.out.print("Deseja adicionar o telefone do novo contato? digite, s para sim ou n para nao: ");
                    option = teclado.next();
                    if(option.toLowerCase().equals("s")){
                        System.out.print("Digite o rotulo do telefone: ");
                        String rotulo = teclado.next();
                        System.out.print("Digite o telefone no formato igual ao exemplo : (48) 3266-8794 ou (48) 99830-8607: ");
                        String numero = teclado.next();
                        if(pessoa.addTelefone(rotulo,numero)){
                            System.out.println("Telefone adicionado ao contato...");
                        }else{
                            System.out.println("Nao foi possivel adicionar o telefone ao contato, sendo ele invalido ou ja existente");
                        }
                    }
                    else if(option.toLowerCase().equals("n")){
                        System.out.println("Contato sem telefone adicionado...");
                    }
                    else{
                        System.out.println("Opcao invalida...");
                    }
                    option = null;
                    System.out.print("Deseja adicionar o email do novo contato? digite, s para sim ou n para nao: ");
                    option = teclado.next();
                    if(option.toLowerCase().equals("s")){
                        System.out.print("Digite o rotulo do email: ");
                        String rotulo = teclado.next();
                        System.out.print("Digite o email no formato igual ao exemplo : exemplo@email.com");
                        String email = teclado.next();
                        if(pessoa.addEmail(rotulo,email)){
                            System.out.println("Email adicionado ao contato...");
                        }else{
                            System.out.println("Nao foi possivel adicionar o email ao contato, sendo ele invalido ou ja existente");
                        }
                    }
                    else if(option.toLowerCase().equals("n")){
                        System.out.println("Contato sem email adicionado...");
                    }
                    else{
                        System.out.println("Opcao invalida...");
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome do contato para remover da agenda: ");
                    String nr = teclado.next();
                    System.out.print("Digite o sobrenome do contato para remover da agenda: ");
                    String snr = teclado.next();
                    if(agenda.removePessoa(nr,snr)){
                        System.out.println("contato removido com sucesso");
                    }
                    else{
                        System.out.println("contato nao existe");
                    }

                    break;
                case 4:
                    System.out.print("Digite o nome do contato para editar da agenda: ");
                    String ne = teclado.next();
                    System.out.print("Digite o sobrenome do contato para editar da agenda: ");
                    String sne = teclado.next();
                    int index = agenda.procuraPosicaoDoContato(ne,sne);
                    if(index == -1){
                        System.out.println("contato inexistente");
                    } else{
                        System.out.print("Digite telefone para opcoes de telefone ou email para opcoes de email");
                        String opt = teclado.next();
                        if(opt.toLowerCase().matches("telefone")){
                            System.out.println("Digite 1 para : editar algum telefone do contato...");
                            System.out.println("Digite 2 para : remover algum telefone do contato...");
                            System.out.println("Digite 3 para : adicionar algum telefone ao contato...");
                            int opcion = 0;
                            switch (opcion){
                                case 1:
                                    System.out.print("Digite o rotulo do telefone a ser editado: ");
                                    String re = teclado.next();
                                    System.out.print("Digite o novo numero do rotulo: ");
                                    String nn = teclado.next();
                                    if(agenda.updateTelefone(re,nn,index)){
                                        System.out.println("Telefone atualizado com sucesso...");
                                    }else{
                                        System.out.println("Rotulo inexisnte");
                                    }
                                    break;
                                case 2:
                                    System.out.print("Digite o rotulo do telefone a ser excluido: ");
                                    String rr = teclado.next();
                                    if(agenda.removeTelefone(rr,index)){
                                        System.out.println("Telefone do contato removido com sucesso...");
                                    }else{
                                        System.out.println("Rotulo inexisnte");
                                    }
                                    break;
                                case 3:
                                    System.out.print("Digite o nome do rotulo do telefone a ser adicionado: ");
                                    String rn = teclado.next();
                                    System.out.print("Digite o numero do telefone a ser adicionado");
                                    String n = teclado.next();
                                    if(agenda.addTelefone(rn,n,index)){
                                        System.out.println("telefone adicionado com sucesso");
                                    }else{
                                        System.out.println("Nao foi possivel adicionar telefone, telefone com formato invalido");
                                    }
                                    break;
                                default:
                                    System.out.println("Opcao invalida");
                                    break;
                            }
                        }
                        else if(opt.toLowerCase().matches("email")){
                            System.out.println("Digite 1 para : editar algum email do contato...");
                            System.out.println("Digite 2 para : remover algum email do contato...");
                            System.out.println("Digite 3 para : adicionar algum email ao contato...");
                            int optionEmail = 0;
                            switch (optionEmail){
                                case 1:
                                    System.out.print("Digite o rotulo do email a ser editado: ");
                                    String re = teclado.next();
                                    System.out.print("Digite o novo email do rotulo: ");
                                    String nn = teclado.next();
                                    if(agenda.updateEmail(re,nn,index)){
                                        System.out.println("Email atualizado com sucesso...");
                                    }else{
                                        System.out.println("Rotulo inexisnte");
                                    }
                                    break;
                                case 2:
                                    System.out.print("Digite o rotulo do email a ser excluido: ");
                                    String rr = teclado.next();
                                    if(agenda.removeEmail(rr,index)){
                                        System.out.println("Email do contato removido com sucesso...");
                                    }else{
                                        System.out.println("Rotulo inexisnte");
                                    }
                                    break;
                                case 3:
                                    System.out.print("Digite o nome do rotulo do email a ser adicionado: ");
                                    String rn = teclado.next();
                                    System.out.print("Digite o email a ser adicionado");
                                    String n = teclado.next();
                                    if(agenda.addEmail(rn,n,index)){
                                        System.out.println("email adicionado com sucesso");
                                    }else{
                                        System.out.println("Nao foi possivel adicionar email, email com formato invalido");
                                    }
                                    break;
                                default:
                                    System.out.println("Opcao invalida");
                                    break;
                            }

                        }
                        else{
                            System.out.println("Opcao invalida");
                        }
                    }
                    break;
                case 5:
                    System.out.print("Digite o nome do contato para ver seus dados: ");
                    String name = teclado.next();
                    System.out.print("DIgite o sobrenome do contato para ver seus dados: ");
                    String sobrename = teclado.next();
                    int posicaoContato = agenda.procuraPosicaoDoContato(name,sobrename);
                    if(posicaoContato == -1){
                        System.out.println("Contato inexistente...");
                    }else{
                        Pessoa contato = agenda.getContato(posicaoContato);
                        System.out.println(contato.toString());
                    }
                    break;
                default:
                    System.out.println("Opcao invalida...");
                    break;
            }
        } while(opcao!=0);

    }
}
