import java.util.Scanner;
public class Exercicio4{
    public static void main (String args []){
        Scanner teclado = new Scanner(System.in);

        float SalarioLiquido, ValorHora, QuantidadeHoras, DescINSS, Salario, ValorDesc;

        //Entrada 
        System.out.println ("Digite o Valor da Hora");
        ValorHora = teclado.nextFloat();
        System.out.println ("Digite Quantidade Horas");
        QuantidadeHoras = teclado.nextFloat();
        System.out.println ("Insiria percentual de Desconto INSS");
        DescINSS = teclado.nextFloat();

        //Processamento
        Salario = (QuantidadeHoras * ValorHora);
        ValorDesc = Salario * 0.10f;
        SalarioLiquido = Salario - ValorDesc;
        
        

        //Saida
        
        System.out.println ("Seu Salario e ="+SalarioLiquido);
        

    }
}