import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class ManipulacaoStringsDatas {
    
    /*
    String nome = "Gabriel";
    System.out.println(nome.toUpperCase()); deixa maiusculo
    System.out.println(nome.toLowerCase()); deixa minusculo
    System.out.println(nome.lenght()); consulta quantos caracteres tem a string

    String nomeOutro = "Gabriel";
    System.out.println(nome.equalsIgnoreCase(nomeOutro)) ou apenas "equals" quando não ha diferenças a ser ignoradas
    */

// objetivo: escrever Olá {nome}. Hoje é {dia da semana}, Bom dia!
// ISO 8601 - LocalDate - para isso precisamos importar um novo pacote 
 public static void main(String[] args) {
    String nome = "joao Gabriel";
    LocalDate hoje = LocalDate.now();
    Locale brasil = new Locale ("pt","BR");
   
    //vamos traduzir de forma automatica
    System.out.print("Olá " + nome + ", hoje é " + hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil) + ", bom dia!");
    }
}
