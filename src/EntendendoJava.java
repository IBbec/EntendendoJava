//public é um modificador de acesso e informa que a classe pode ser acessada por um código fora dela. Oposto dele é private.
//o nome da minha classe é "EntendendoJava" e o nome do arquivo deve ser o mesmo, como visto ao lado em "src".
public class EntendendoJava{
    //static é uma palavra chave e permite que main seja chamado antes que um objeto da classe tenha sido criado.
    //void apenas informa ao compilador que main não retorna um valor.
    //main é um método, a partir dele o programa será executado.

    /*qualquer informação que eu tenha que passar para um método, será recebida por um conjunto de VARIÁVEIS
     dentro dos parênteses que SEGUEM o nome de um método, essas variáveis são chamadas de PARÂMETROS */
    public static void main(String[] args) {
        //String[]args é um parâmetro que declara o parâmetro args,um array de objetos do tipo String.
        //Objetos do tipo String armazenam sequencias de caracteres.
        //ARRAY são conjuntos de objetos semelhantes.

        int var1;// essa instrução declara uma variável do TIPO inteiro, até 10 casas numéricas
        var1 = 1028;
        System.out.println("var1 contains " + var1);
       //consegui executar esse programa e o retorno foi "var1 contains 1028"
    
    }
}
