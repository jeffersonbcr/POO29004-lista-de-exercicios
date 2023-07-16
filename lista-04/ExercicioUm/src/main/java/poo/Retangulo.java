package poo;

public class Retangulo {
    private int largura;
    private int altura;

    public Retangulo(){
        largura = 4;
        altura = 4;
    }
    public Retangulo(int largura, int altura){
        if(largura<=1 || altura <=1){
            this.largura = 4;
            this.altura = 4;
            System.out.println("Tamanho irregular, Retangulo criado com altura e largura de tamanho 4");
        }
        else{
            this.largura = largura;
            this.altura = altura;
        }
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        if(largura<=1){
            System.out.println("Tamanho irregular para a largura do retangulo, Redefinindo largura original de: " + getLargura());
        }
        else{
            this.largura = largura;
        }
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if(altura<=1){
            System.out.println("Tamanho irregular para a largura do retangulo, Redefinindo largura original de: " + getAltura());
        }
        else{
            this.altura = altura;
        }
    }
    public void desenharASCII(){
        int alt = 0;
        int larg = 0;
        StringBuilder cantos = new StringBuilder("+");
        StringBuilder meios = new StringBuilder("|");

        while(larg < getLargura()-2){
            cantos.append("-");
            meios.append(" ");
            larg++;
        }

        cantos.append("+");
        meios.append("|");

        System.out.println(cantos.toString());

        while(alt < getAltura()-2){
            System.out.println(meios.toString());
            alt++;
        }

        System.out.println(cantos.toString());
    }
    public void desenharUTF8(){
        int alt = 0;
        int larg = 0;
        StringBuilder cantoCima = new StringBuilder("\u250c");
        StringBuilder cantoBaixo = new StringBuilder("\u2514");
        StringBuilder meios = new StringBuilder("\u2502");

        while(larg < getLargura()-2){
            cantoCima.append("\u2500");
            cantoBaixo.append("\u2500");
            meios.append(" ");
            larg++;
        }

        cantoCima.append("\u2510");
        meios.append("\u2502");
        cantoBaixo.append("\u2518");

        System.out.println(cantoCima.toString());
        while(alt < getAltura()-2){
            System.out.println(meios.toString());
            alt++;
        }

        System.out.println(cantoBaixo.toString());
    }
}
