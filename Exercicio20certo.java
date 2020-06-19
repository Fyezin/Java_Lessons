import java.util.Scanner;
public class Exercicio20certo{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int sexo;
        float Altura;
        float pesoIdeal;

        sexo = teclado.NextInt();
        altura = teclado.NextFloat();

        if (sexo ==0){
            pesoIdeal = (72.7f * Altura) - 58.0f;

        }
        else{
            pesoIdeal = (62.1f * Altura) - 44.7f;

        }

        System.out.println("Seu peso ideal vale =" +pesoIdeal);



    }



}