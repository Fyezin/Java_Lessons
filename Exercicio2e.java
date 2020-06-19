import java.util.Scanner;
public class Exercicio2e{
    public static void main (String args []){
        Scanner teclado = new Scanner(System.in);

        float basemaior, basemenor, altura, area;

        //Entrada 
        System.out.println ("Digite a base do trapezio");
        basemaior = teclado.nextFloat();
        System.out.println ("Digite a altura do trapezio");
        basemenor = teclado.nextFloat();
        System.out.println ("Digite a altura do trapezio");
        altura = teclado.nextFloat();
        System.out.println ("Digite a altura do trapezio");
        area = teclado.nextFloat();

        //Processamento
        area = ((basemaior + basemenor)* altura) /2;




        System.out.println ("O valor da area ="+area);

    }
}