import java.util.Scanner;
public class URI1003{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int A, B, SOMA;

        //System.out.println("Digite o raio");
        A = input.nextInt();
        B = input.nextInt();
        
        SOMA = A + B;

        System.out.print("SOMA = "+SOMA);
    }
}