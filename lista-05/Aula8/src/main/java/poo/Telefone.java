package poo;

import java.util.*;

public class Telefone {
    private Map<String,String> dados;

    public Telefone() {
        this.dados = new HashMap<>();
    }
    public Boolean add(String r , String n){
        if(this.dados.containsKey(r)){
            return false;
        }
        String telefoneCompativel = "(\\(?\\d{2}\\)?\\s)?(\\d{4,5}\\-\\d{4})";
        if(n.matches(telefoneCompativel)){
            dados.put(r,n);
            return true;

        }
        return false;
    }

    public Boolean remove(String r){
        if(dados.containsKey(r)){
            this.dados.remove(r);
            return true;
        }
        else return false;
    }
    public Boolean update(String r, String n){
        String telefoneCompativel = "(\\(?\\d{2}\\)?\\s)?(\\d{4,5}\\-\\d{4})";
        if(this.dados.containsKey(r)){
            if(n.matches(telefoneCompativel)) {
                String dadoAntigo = this.dados.get(r);
                this.dados.replace(r, dadoAntigo, n);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "dados=" + dados +
                '}';
    }
}
