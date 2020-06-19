import java.util.Scanner;
public class Exercicio2d{
    public static void main (String args []){
        Scanner teclado = new Scanner(System.in);

        float diagonal1, diagonal2, area;

        //Entrada 
        System.out.println ("Digite a base do losango");
        diagonal1 = teclado.nextFloat();
        System.out.println ("Digite a altura do losango");
        diagonal2 = teclado.nextFloat();

        //Processamento
        area = (diagonal1 * diagonal2);




        System.out.println ("O valor da area ="+area);

    }
}