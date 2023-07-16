public class Switch{
    private int velocidadeBps;
    private final String [][] PORTAS = new String [5][4];
    private int nEnderecosMac;

    public Switch(int velocidadeBps, int nEnderecosMac) {
        this.velocidadeBps = velocidadeBps;
        this.nEnderecosMac = nEnderecosMac;
    }
    public Switch(String[][]tabelaDeEndeMac) {
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                PORTAS[i][j] = tabelaDeEndeMac[i][j];
                nEnderecosMac++;
            }
        }
    }
    public int verficaPorta(int linha, int col){
        String adressMac = PORTAS[linha][col];
        if(adressMac.length() <= 0) {
            return 1;
        }
        else{
            return 0;
        }
    }
    public int getVelocidadeBps() {
        return velocidadeBps;
    }

    public void setVelocidadeBps(int velocidadeBps) {
        this.velocidadeBps = velocidadeBps;
    }

    public int getQntEnderecosMac() {
        return nEnderecosMac;
    }

    public void addEndMac(String endMac,int linha , int col){
       if(verficaPorta(linha,col) == 1) {
           PORTAS[linha][col] = endMac;
           nEnderecosMac++;
       }

    }
    public void removeEndMac(int linha,int col){
        if(verficaPorta(linha,col) == 0) {
            PORTAS[linha][col] = "";
            nEnderecosMac--;
        }
    }
    public void removeEndMac(){
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                PORTAS[i][j] = "";
                nEnderecosMac--;
            }
        }
    }
    public String procuraEndMac(int linha,int col){
        if(verficaPorta(linha,col) == 1) return PORTAS[linha][col];
        else return "";
    }
}
