import java.util.Scanner;
public class URI1018{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int Valor = input.nextInt();
        int C100, C50, C20, C10, C5, C2, C1;
        int resto;


        C100 = Valor / 100;
        resto = Valor % 100;
        C50 = resto / 50;
        resto = resto % 50;
        C20 = resto / 20;
        resto = resto % 20;
        C10 = resto / 10;
        resto = resto % 10;
        C5 = resto / 5;
        resto = resto % 5;
        C2 = resto / 2;
        resto = resto % 2;
        C1 = resto / 1;
        resto = resto % 1;

        System.out.println(Valor);
        System.out.println(C100 + " nota(s) de R$ 100,00");
        System.out.println(C50 + " nota(s) de R$ 50,00");
        System.out.println(C20 + " nota(s) de R$ 20,00");
        System.out.println(C10 + " nota(s) de R$ 10,00");
        System.out.println(C5 + " nota(s) de R$ 5,00");
        System.out.println(C2 + " nota(s) de R$ 2,00");
        System.out.println(C1 + " nota(s) de R$ 1,00");

    }



}