import java.util.Scanner; 
 public class URI1037{ 
     public static void main(String args[]){ 
         Scanner teclado = new Scanner(System.in); 
 
 
         float V, V1, V2, V3, V4, V5; 
         V = teclado.nextFloat(); 
         
 
         if ( V >=0 && V <=25 ){ 
             System.out.println("Intervalo [0,25]"); 
         } 
         else{   // ja sei que o Valor é > 25
             if (V > 25 && V <= 50 ){ 
                System.out.println("Intervalo (25,50]"); 
             } 
             else{   // ja sei que o Valor é > 50
                 if (V > 50 && V <= 75 ){ 
                    System.out.println("Intervalo (50,75]");  
                 } 
                 else{ // ja sei que o Valor é > 50
                     if (V > 75 && V <= 100 ){ 
                        System.out.println("Intervalo (75,100]");
                     }
                     else{ // ja sei que o Valor é > 100
                    
                         System.out.println("Fora do intervalo");
                        
                     }

                 } 
             } 
         } 
         
     } 
} 
