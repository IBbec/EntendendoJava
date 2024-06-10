//Demonstração de laço em java: laço for
// for(inicialização; condição; interação) instrução;
//INICIALIZAÇÃO: variável de controle de laço
//CONDIÇÃO: expressão booleana que testa a variável de controle de laço, determina se o laço irá interar ou encerrar.
//INTERAÇÃO: determina como a variável do laço é alterada sempre que o laço intera.

/* 
public class javaFor {
    public static void main(String[] args) {
        int contagem;
        for( contagem = 0; contagem < 5; contagem++)

        System.out.println("Essa contagem " + contagem);

    }

}
*/
//agora um laço dentro do outro

public class javaFor {

    public static void main(String[] args) {
        for(int i = 0; i <=10 ; i ++){
            for(int j = 0; j <=10 ; j ++){
                System.out.println(j * i);
            }// o resultado foi ex: 10x1, 10x2,10x3,10x4,10x5,10x6,10x7,10x8,10x9,10x10,com todos os numeros de 0-10
        }
           
    }
}