import java.util.Scanner;
public class URI1004{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int A, B, PROD;

        //System.out.println("Digite o raio");
        A = input.nextInt();
        B = input.nextInt();
        
        PROD = A * B;

        System.out.println("PROD = "+PROD);
    }
}