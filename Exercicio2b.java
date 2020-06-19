import java.util.Scanner;
public class Exercicio2b{
    public static void main (String args []){
        Scanner teclado = new Scanner(System.in);

        float base, altura, area;

        //Entrada (O valor do Lado do Quadrado)
        System.out.println("Digite a base do Retangulo");
        base = teclado.nextFloat();
         System.out.println ("Digite a Altura");
         altura = teclado.nextFloat();

        // Processamento (Calcular a Area)
        area = base * altura;

        //Saida (Exibir o valor da area)
        System.out.println("O Valor da area = "+area); 



    }
}