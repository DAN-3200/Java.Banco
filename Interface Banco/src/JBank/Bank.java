package JBank;
import InterFace.Tela;
import java.util.ArrayList;
import java.util.HashMap;


public class Bank {
   HashMap Map = new HashMap();// Conjunto em que cada elemento possui uma Key(chave)
   int i = 0;
   
   public void Conta(){
       this.i++;
   }
   
   public void Guardar(String nome, String email, String senha, int cre){
       ArrayList book = new ArrayList();
       
       // Adicionando os valores numa "Caixa"
       book.add(nome);
       book.add(email);
       book.add(senha);
       book.add(cre);
       
       //Colocando uma ID nessas "Caixas" e separando elas
       Map.put(i, book);
       
       System.out.println(Map);
       
       ArrayList N1 = (ArrayList) Map.get(i);
       System.out.println("Novo Usuario | "+"Email: " + N1.get(1) +" Senha: "+ N1.get(2));
       
      //Limpar os dados//
      nome = "";
      email = "";
      senha = "";
      cre = 0;
      
      //---------------//
 
   }
   
      public void Logar(String email, String senha){
        ArrayList N1;
        
          for(int c = 0; c <= Map.size(); c++){
          N1 = (ArrayList) Map.get(c + 1);
           
            if(email.equals(N1.get(1)) && senha.equals(N1.get(2))){
               Tela T = new Tela();
               T.setVisible(true);
            }
           
        }
    }
}      

