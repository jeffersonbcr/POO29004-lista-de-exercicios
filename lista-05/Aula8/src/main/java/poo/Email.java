package poo;
import java.util.*;
public class Email {
    private Map<String,String> dados;

    public Email() {
        this.dados = new HashMap<>();
    }
    public Boolean add(String r, String e){
        String emailValido = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
        if(e.matches(emailValido)){
            dados.put(r,e);
            return true;

        }
        else {
            return false;
        }
    }
    public Boolean remove(String r){
        if(dados.containsKey(r)){
            dados.remove(r);
            return true;
        }
        else return false;
    }
    public Boolean update(String r, String e){
        if(dados.containsKey(r)){
            String emailValido = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
            if(e.matches(emailValido)) {
                String dadoAntigo = dados.get(r);
                dados.replace(r, dadoAntigo, e);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Email{" +
                "dados=" + dados +
                '}';
    }
}
