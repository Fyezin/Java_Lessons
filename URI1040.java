import java.util.Scanner;
public class URI1040{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        float N1, N2, N3, N4, Media, Exame;

        N1 = input.nextFloat();
        N2 = input.nextFloat();
        N3 = input.nextFloat();
        N4 = input.nextFloat();

        Media = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / 10;

        if(Media >= 7.0f){
            System.out.printf("Media: %.1f\n",Media);
            System.out.println("Aluno aprovado.");
        
        else{
            if (Media < 5.0f){
                System.out.println("Aluno reprovado.");
                
            }
            else{
                System.out.println("Aluno em exame.";
                Exame = input.nextFloat();
                System.out.printf("Nota do exame: %.1f\n",Exame);
                Media = (Exame + Media) /2;
                if (Media >=5){
                    System.out.println("Aluno aprovado.");
                    System.out.printf("Media final: %.1f\n",Media);
                }
                else{
                    System.out.println("Aluno reprovado.");
                    System.out.printf("Media final:%.1f\n",Media);
                }
            }

        
            
        }

    }    
    
}