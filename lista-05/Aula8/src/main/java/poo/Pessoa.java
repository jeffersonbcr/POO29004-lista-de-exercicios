package poo;


import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String sobreNome;
    private LocalDate dataNasc;
    private Telefone telefones;
    private Email emails;

    public Pessoa(String nome, String sobreNome, LocalDate dataNasc) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.dataNasc = dataNasc;
        this.telefones = new Telefone();
        this.emails = new Email();
    }
    public Boolean addTelefone(String r, String n){
        return this.telefones.add(r,n);
    }
    public Boolean addEmail(String r, String e){
        return this.emails.add(r,e);
    }
    public Boolean removeTelefone(String r){
        return this.telefones.remove(r);
    }
    public Boolean removeEmail(String r){
        return this.emails.remove(r);
    }
    public Boolean updateTelefone(String r, String n){
        return this.telefones.update(r,n);
    }
    public Boolean updateEmail(String r, String e){
        return this.emails.update(r,e);
    }

    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", dataNasc=" + dataNasc +
                ", telefones=" + telefones +
                ", emails=" + emails +
                '}';
    }
}
