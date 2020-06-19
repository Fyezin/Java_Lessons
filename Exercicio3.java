import java.util.Scanner;
public class Exercicio3{
    public static void main (String args []){
        Scanner teclado = new Scanner(System.in);

        float SM, KW, Custo, ValorPagar, Desconto10;

        //Entrada 
        System.out.println ("Digite o Salario Minimo");
        SM = teclado.nextFloat();
        System.out.println ("Digite o KW");
        KW = teclado.nextFloat();
        
        //Processamento
        Custo = (SM/7) / 100;
        ValorPagar = Custo * KW;
        Desconto10 = (ValorPagar - (ValorPagar * 0.10f));
        

        //Saida
        
        System.out.println ("O valor da conta ="+Custo);
        System.out.println (" O valor do KW e ="+ValorPagar);
        System.out.println ("O Valor com Desconto e ="+Desconto10);

    }
}