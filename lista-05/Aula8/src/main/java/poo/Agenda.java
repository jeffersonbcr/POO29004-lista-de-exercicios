package poo;
import java.util.*;
import java.time.LocalDate;

public class Agenda {
   private ArrayList<Pessoa> contatos;

   public Agenda() {
      this.contatos = new ArrayList<>();
   }
   public void addPessoa(Pessoa p){
      this.contatos.add(p);
   }
   public Boolean removePessoa(String n , String s){
      for(Pessoa pessoa : contatos){
         if(pessoa.getNome().equals(n) == true && pessoa.getSobreNome().equals(s) == true){
            contatos.remove(pessoa);
            return true;
         }
      }
      return false;
   }
   public Boolean addTelefone(String r , String n , int pindex){
      try{
         this.contatos.get(pindex);
         return contatos.get(pindex).addTelefone(r,n);
      }
      catch (Exception e){
         return false;
      }
   }
   public Boolean addEmail(String r , String e , int pindex){
      try{
        this.contatos.get(pindex);
         return contatos.get(pindex).addEmail(r,e);
      }
      catch (Exception d){
         return false;
      }
   }
   public Boolean updateTelefone(String r , String n , int pindex){
      try{
         this.contatos.get(pindex);
         return contatos.get(pindex).updateTelefone(r,n);
      }
      catch (Exception e){
         return false;
      }
   }
   public Boolean updateEmail(String r , String e , int pindex){

      try{
         this.contatos.get(pindex);
         return contatos.get(pindex).updateEmail(r,e);
      }
      catch (Exception d){
         return false;
      }
   }
   public Boolean removeTelefone(String r , int pindex){
      try{
         this.contatos.get(pindex);
         return contatos.get(pindex).removeTelefone(r);
      }
      catch (Exception e){
         return false;
      }
   }
   public Boolean removeEmail(String r , int pindex){

      try{
         this.contatos.get(pindex);
         return contatos.get(pindex).removeEmail(r);
      }
      catch (Exception e){
         return false;
      }
   }

   public int procuraPosicaoDoContato(String nome , String sobrenome){
      int ct = 0;
      for(Pessoa p : contatos){
         if(p.getNome().equals(nome) && p.getSobreNome().equals(sobrenome)){
            return ct;
         }
         ct++;
      }
      return -1;
   }
   public Pessoa getContato(int pindex){
      return contatos.get(pindex);
   }

   @Override
   public String toString() {
      return "Agenda{" +
              "contatos=" + contatos +
              '}';
   }
}
