package poo;

public class Soldado {
    private static int tamanhoExercito;
    private final int distanciaPadrao = 1;
    private final String armaPadrao = "fuzil";
    private int pos;
    private String nome;

    public Soldado(int posInicial, String nickName){
        this.pos = posInicial;
        this.nome = nickName;
        tamanhoExercito++;
    }

    public Soldado() {
        this.nome = "Bot Allu";
        this.pos = 0;
    }

    public static int getTamanhoExercito() {
        return tamanhoExercito;
    }

    public int getPos() {
        return pos;
    }

    public String getNome() {
        return nome;
    }

    public void movimentar(int distancia){
        System.out.println("Soldado " +  getNome() + " em movimento , senhor!");
        this.pos = this.pos + distancia;
        System.out.println("Posicao final do soldado: " + getNome() + " em " + getPos());
    }

    public void movimentar(){
        this.movimentar(distanciaPadrao);
    }

    public void atacar(String arma){
        if(tamanhoExercito<10) {
            System.out.println("Aguardando exercito ficar maior para atacar, exercito atual: " + getTamanhoExercito());
        }
        else{
            if(arma.toLowerCase() == "fuzil" || arma.toLowerCase() == "punho" || arma.toLowerCase() == "baioneta"){
                System.out.println("Soldado: " + getNome() + " atacando com " + arma);
            }
            else{
                System.out.println("Impossivel atacar com esta arma, entao eu " + getNome() + " vou atacar com fuzil");
            }
        }

    }
    public void atacar(){
        this.atacar("fuzil");
    }

}
