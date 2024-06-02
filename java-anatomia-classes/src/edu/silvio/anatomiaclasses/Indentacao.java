package edu.silvio.anatomiaclasses;
public class Indentacao {
    public static void main(String[] args) {
    int mediaFinal = 9;
    int mediaFinal2 = 6;
    //exemplo sem indentação
    if(mediaFinal<6)	
    System.out.println("REPROVADO"); 
    else if(mediaFinal==6)
    System.out.println("PROVA MINERVA"); 
    else
    System.out.println("APROVADO");
     		
//Exemplo com indentação   
    if (mediaFinal2 < 6)
        System.out.println("REPROVADO");
    else if (mediaFinal2 == 6)
        System.out.println("PROVA MINERVA");
    else
        System.out.println("APROVADO");
    }
}