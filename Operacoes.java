import java.util.Scanner;

public class Operacoes{
    public static void main(String [] args){
         //declaração de variaveis 
        double num1;
        double num2;
        double resultado;     
        Scanner leitor = new Scanner(System.in);  

        //entrada
        System.out.println("Digite o primeiro número :");
        num1 = leitor.nextDouble();

        System.out.println("Digite o segundo número :");
        num2 = leitor.nextDouble();

        //processamento
        resultado = num1 + num2;

        

        //saida


    }
}