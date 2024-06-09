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
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDateTime;

public class ManipulacaoStringsDatas {
 public static void main(String[] args) {
    String nome = "joao Gabriel";
    LocalDate hoje = LocalDate.now();
    Locale brasil = new Locale ("pt","BR");
    System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
    @SuppressWarnings("unused")
    String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
    LocalDateTime horas = LocalDateTime.now();
    
    String saudacao;
    if(horas.getHour() >= 0 && horas.getHour() < 12) {
        saudacao = "bom dia!";
    } else if (horas.getHour() >= 12 && horas.getHour() < 18) {
        saudacao = "boa tarde!";
    } else if (horas.getHour() >= 18 && horas.getHour() < 24) {
        saudacao = "boa noite!";
    } else {
        saudacao = "";
    }

    System.out.printf("Olá %s, hoje é %s, %s Já são %s %n", nome, hoje, saudacao, horas);
    }
}
