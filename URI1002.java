import java.util.Scanner;
public class URI1002{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        double pi, raio, raiox2, area;

        //System.out.println("Digite o raio");
        raio = input.nextDouble();
        pi = 3.14159;
        raiox2 = raio * raio;

        area = raiox2 * pi;

        System.out.printf("A=%.4f\n",area);
    }
}