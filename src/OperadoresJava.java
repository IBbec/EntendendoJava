public class OperadoresJava {
//nessa parte, explicarei sobre os operadores
//temos aritiméticos, unários,relacionais
//vejamos a seguinte demonstração do uso da instrução condicional IF/ELSE (ESSA É UMA EXPRESSÃO BOOLEANA ENTÃO IRÁ NOS RETORNAR V ou F) em java;
//Esse (?:) chama-se operador ternário pois é formado de 3 termos
 
    /*
        public static void main(String[] args) {
        int a, b;
        a = 4;
        b = 12;

        String resultado = (a>b) ?"verdadeiro" : "falso";
        System.out.println(resultado);

    }
     */
//o operador usado nessa demonstração foi um relacional "maior que", e seu resultado deu (FALSO).



// IF/ELSE foi aplicado como "? x : y" essa é a forma mais simples de aplicar, mas tambem pode ser assim:
    /*
    
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
        DEU FALSO
    */
        
//existe também o uso do else if significando "se não" para designar uma cadeia de possibilidades.
// pudemos ver a mesma coisa escrita de formas diferentes
//Boolean resultado = verdadeiro ou falso
//TABELA VERDADE

//Operador && (and)
//true  && true = true
//true  && false = false
//false && true = false
//false && false = false

//Operador || (OR)
//true  || true = false
//true  || false =false
//false || true = false
//false || false = true 
 
//exemplo de código usando else if para uma cadeia de possibilidades
/* 
    public static void main(String[] args) {
        int nota = 20;
        // A>=80 B>=70 C>=60 D>=50 F>=0
        if(nota >= 80)
        System.out.println("A");
        else if(nota >= 70)
        System.out.println("B");
        else if(nota >= 60)
        System.out.println("C");
        else if(nota >= 50)
        System.out.println("D");
        else if(nota >= 0)
        System.out.println("E");
        else 
        System.out.println("nota inválida");
    }
} */
//agora precisarei criar uma variavel graduação e usar o switch case para poder dizer se o aluno foi aprovado 
//estruturas condicionais;;;

    
        public static void main(String[] args) {
            int nota = 80;
            String graduacao;

            // A>=80 B>=70 C>=60 D>=50 E>=0
            if (nota >= 80){
                graduacao = ("A");
            } else if (nota < 80 && nota >= 70){
                graduacao = ("B");
            } else if(nota < 70 && nota >= 60){
                graduacao = ("C");
            } else if(nota < 60 && nota >= 50){
                graduacao = ("D");
            } else if(nota < 50 && nota >= 0){
                graduacao = ("E");
            } else {
                graduacao = "";
            } 
            switch (graduacao){
                case "A":
                case "B":
                    System.out.println("Aluno aprovado,com sucesso!");
                    break;
                case "C":
                case "D":
                    System.out.println("Aluno aprovado.");
                    break;
                case "E":
                    System.out.println("Aluno reprovado.");
                    break;
                default:
                    System.out.println("Graduação inválida.");  
            } 
        }
    }