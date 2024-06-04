package edu.silvio.tipodevariaveis;
//Tipos de dados:
//inteiros: byte; short; int; long
//int é o mais comumente usado
//fracionados: float; double
//Declaração de variáveis:
//A estrutura padrão para se declarar uma variável:
//<Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>
//Variáveis e Constantes:
public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //estude tipos primitivos
        //estude a classe String que representa texto na aplicação
        String meuNome = "Silvio Junior";
        int numero = 5;
        numero = 10;
        final double VALOR_DE_PI = 3.14;
        //VALOR_DE_PI = 10.75;
        System.out.println(meuNome);
        System.out.println(numero);
        System.out.print(VALOR_DE_PI);
/*short numeroCurto = 1;
int numeroNormal = numeroCurto;
short numeroCurto2 = (short) numeroNormal;
double salarioMinimo = 2500.33; - essa é a forma de representar um valor milhar
para os centavos colocamos o ponto(.) porque essa é a convenção americana    
double salarioMinimo2 = 2.500; - então 2.5 (dois ponto cinco) ou 2.500 (dois ponto quinhentos)   
*/
}
}
