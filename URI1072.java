import java.util.Scanner; 
    public class URI1072{ 
        public static void main(String args[]){ 
            Scanner teclado = new Scanner(System.in); 
            int N = teclado.nextInt();
            int X;
            int IN = 0;
            int OUT = 0;

        for (int cont = 1; cont <= N; cont ++){
            X = teclado.nextInt();
            if(X >=10 && X <=20){
                IN ++;
            }
            else {
                OUT ++;
            }
        }
        System.out.println(IN+" in");
        System.out.println(OUT+" out");

            
        

                                           
                                           
            
                            
    } 
 

} 