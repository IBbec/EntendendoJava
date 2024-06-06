public class OperadoresJava {
    //nessa parte, explicarei sobre os operadores
    //temos aritiméticos, unários,relacionais
//vejamos a seguinte demonstração do uso da instrução condicional IF/ELSE (ESSA É UMA EXPRESSÃO BOOLEANA ENTÃO IRÁ NOS RETORNAR V ou F) em java;


    /*public static void main(String[] args) {
        int a, b;
        a = 4;
        b = 12;

        String resultado = (a>b) ?"verdadeiro" : "falso";
        System.out.println(resultado);

//o operador usado nessa demonstração foi um relacional "maior que", e seu resultado deu (FALSO).
    } */



// IF/ELSE foi aplicado como "? x : y" essa é a forma mais simples de aplicar, mas tambem pode ser assim:
    public static void main(String[] args){
        int a, b;
        a = 4;
        b = 12;
        String resultado = "";
        if (a>b) {
            resultado = "verdadeiro";
            
        } else {
            resultado = "falso";
        }
        System.out.println(resultado);
    }
    // pudemos ver a mesma coisa escrita de formas diferentes
}
