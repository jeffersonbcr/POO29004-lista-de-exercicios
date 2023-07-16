package poo;

public class RoboExplorador {
    private int posX;
    private int posy;
    private int maxX;
    private int maxY;
    private char front;

    public RoboExplorador(){
        this.posX = 0;
        this.posy = 0;
        this.maxX = 10;
        this.maxY = 10;
        this.front = 'N';
    }
    public RoboExplorador(int posicaoX,int posicaoY,int maximoX,int maximoY,char frente){
        if(frente == 'N'|| frente == 'S' || frente == 'L' || frente == 'O'){
            this.front = frente;
        }
        else{
            this.front = 'N';
        }
        if(posicaoX > maximoX || posicaoY > maximoY || maximoX != maximoY){
            System.out.println("Plano de exploracao irregular , Area criada com tamanho 10x10 e robo posicionado nas coordenadas (0,0)");
            this.posX = 0;
            this.posy = 0;
            this.maxX = 10;
            this.maxY = 10;
        }
        else{
            this.posX = posicaoX;
            this.posy = posicaoY;
            this.maxX = maximoX;
            this.maxY = maximoY;
        }
    }

    public int getPosX() {
        return posX;
    }

    public int getPosy() {
        return posy;
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMaxY() {
        return maxY;
    }

    public char getFront() {
        return front;
    }
    public void explorar(String plano){
        int ct= 0;
        char aux;
        while(ct<plano.length()){
            aux = plano.charAt(ct);
            char auxFrente = getFront();
            if(aux == 'E'){
                if(auxFrente == 'N'){
                    this.front = 'O';
                }
                if(auxFrente == 'O'){
                    this.front = 'S';
                }
                if(auxFrente == 'S'){
                    this.front = 'L';
                }
                if(auxFrente == 'L'){
                    this.front = 'N';
                }
            }
            else if (aux == 'D'){
                if(auxFrente == 'N'){
                    this.front = 'L';
                }
                if(auxFrente == 'O'){
                    this.front = 'N';
                }
                if(auxFrente == 'S'){
                    this.front = 'O';
                }
                if(auxFrente == 'L'){
                    this.front = 'S';
                }
            } else if (aux == 'M') {
                if(auxFrente == 'N'){
                    if(getPosy() == getMaxY()){
                        System.out.println("Posicao invalida no eixo Y");
                    }
                    else posy++;
                }
                if(auxFrente == 'O'){
                    if(getPosX() == getMaxX()){
                        System.out.println("Posicao invalida no eixo X");
                    }
                    else posX++;
                }
                if(auxFrente == 'S'){
                    if(getPosy() == 0){
                        System.out.println("Posicao invalida no eixo Y");
                    }
                    else posy--;
                }
                if(auxFrente == 'L'){
                    if(getPosX() == 0){
                        System.out.println("Posicao invalida no eixo X");
                    }
                    else posy--;
                }
            }
            else{
                System.out.println("Comando nao encontrado");
            }
            System.out.println("Posicao em x: " + this.getPosX());
            System.out.println("Posicao em y: " + this.getPosy());
            System.out.println("Frente do robo em direcao a : " + this.getFront());
            ct++;
        }

    }
}
