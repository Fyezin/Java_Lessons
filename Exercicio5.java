import java.util.Scanner;
public class Exercicio5{
    public static void main(String args[]){
        Scanner input = new Scanner (System.in);

        float tempo, velocidade , distancia, consumo;

        System.out.println("Digite o tempo de Viagem");
        tempo = input.nextFloat();
        System.out.println("Digite a velocidade media");
        velocidade = input.nextFloat();

        distancia = tempo * velocidade;

        consumo = distancia / 12;

        System.out.printf("Voce percorreu %.3f km a uma velocidade de %.3f km/h e consumiu %.3f litros \n",distancia, velocidade, consumo);



    }


}