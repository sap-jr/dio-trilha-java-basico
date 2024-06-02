package edu.silvio.anatomiaclasses;
//Declarar uma variável em Java segue sempre
//a seguinte estrutura:
//Tipo NomeBemDefinido = Atribuição (opcional em alguns casos)
//Declarando método em Java:
//TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)
public class DeclarandoVariavelMetodo {
    public static void main(String[] args) {
    String primeiroNome = "Silvio"; //caracteres
    String segundoNome = "Junior"; //caracteres

    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
    
    System.out.print(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
