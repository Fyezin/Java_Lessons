import java.util.Scanner;
public class Exercicio2c{
    public static void main (String args []){
        Scanner teclado = new Scanner(System.in);

        float base, altura, area;

        //Entrada 
        System.out.println ("Digite a base do triangulo");
        base = teclado.nextFloat();
        System.out.println ("Digite a altura do triangulo");
        altura = teclado.nextFloat();

        //Processamento
        area = (base * altura) /2;



        System.out.println ("O valor da area ="+area);
    }
}