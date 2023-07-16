# Comandos git e linguagem de programação Java

# Linguagem de programação Java
```java
public static void main(String args[]){
    System.out.println("Digite um nome de usuario: ");
    Scanner teclado = new Scanner(System.in);
    String palavra = teclado.NextLine();
    System.out.println("Digite uma senha com 4 digitos: ");
    int numero = teclado.NextInt();
    System.out.println("Digite seu nome de usuario: ");
    teclado.nextLine();
    String usuario = teclado.NextLine();
    System.out.println("Digite sua senha: ");
    int senha = teclado.NextInt();
    if(palavra == usuario && numero == senha){
        System.out.println("Autenticacao de usuario confirmada, acesso liberado...");
    }
    else{
        System.out.println("Autenticacao de usuario negada...");
    }
}
```
## Estruturas de decisão
``` java
public static void main(String args[]){
    System.out.println("Gerando numero randomico...");
    Random randomico = new Ramdom();
    int numero = random.nextInt(100);
    System.out.println("Numero randomico gerado: " + numero);
    if(numero % 2 == 0){
        System.out.println("Numero randomico É par !");
    }
    else{
        System.out.println("Numero randomico É impar!");
    }
    System.out.println("Gerando outro numero randomico...");
    int numeroDois = random.nextInt(100);
    System.out.println("Numero randomico gerado: " + numeroDois);
    int operacao = random.nextInt(5);
    switch (operacao) {
        case 1:
            System.out.println("A soma dos numeros É: " + (numero + numeroDois));
            break;
        case 2:
            System.out.println("A subtracao dos numeros É: " + (numero - numeroDois));
            break;
        case 3:
            System.out.println("A multiplicacao dos numeros É: " + (numero * numeroDois));
            break;
        case 4:
            if (numeroDois != 0) {
                System.out.println("A divisao dos numeros É: " + (numero / numeroDois));
            }
            else{
                System.out.println("segundo numero randomico igual a zero, nao e possivel realizar a divisao");
            }
            break;
        default:
            System.out.println("Operação não encontrada");

        }
}
```
## Métodos da classe String
```java
    public static void main(String[] args) {
    String palavras = "Abacate:Tomate:Ervilha:amora";
        System.out.print("Conteudo da string: " + palavras);
        String [] vetorPalavras = palavras.split(":");
        System.out.print("Gerando vetor de palavras com a string..");
        for(int cont = 0; cont < vetorPalavras.length();cont++){
            System.out.print("Posicao do vetor [ " + cont + "]"+ " guarda a palavra: " + vetorPalavras[cont] + " e a palavra possui tamanho: " + vetorPalavras[cont].length());
        }
}
```
## Interação com o usuário
# Comandos git
## Fluxo de trabalho usando ramos
```shell
git checkout master
git merge decisao
git checkout master
git merge string
````

