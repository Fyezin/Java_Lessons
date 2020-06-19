import java.util.Scanner;
public class Exercicio2a{
    public static void main (String args []){
        Scanner teclado = new Scanner(System.in);

        float lado, area;

        //Entrada (O valor do Lado do Quadrado)
        System.out.println("Digite o lado do Quadrado");
        lado = teclado.nextFloat();

        // Processamento (Calcular a Area)
        area = lado * lado;

        //Saida (Exibir o valor da area)
        System.out.println("O Valor da area = "+area); 



    }
}