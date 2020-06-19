import java.util.Scanner; 
 public class URI1038{ 
     public static void main(String args[]){ 
         Scanner teclado = new Scanner(System.in); 
 
 
         float Codigo, Quantidade, Valor; 
         Codigo = teclado.nextFloat(); 
         Quantidade = teclado.nextFloat(); 
         Valor = 0;

         if (Codigo ==1) {
             Valor = Quantidade * 4;   
             System.out.printf("Total: R$ %.2f\n",Valor);                
         }
         else {
             if (Codigo ==2){
                 Valor = Quantidade * 4.50f;
                 System.out.printf("Total: R$ %.2f\n",Valor);
             }
             else{
                 if (Codigo ==3){
                     Valor = Quantidade * 5;
                     System.out.printf("Total: R$ %.2f\n",Valor);
                 }
                 else{
                     if (Codigo ==4){
                         Valor = Quantidade * 2;
                         System.out.printf("Total: R$ %.2f\n",Valor);
                     }
                     else{
                         if (Codigo ==5){
                             Valor = Quantidade * 1.50f;
                             System.out.printf("Total: R$ %.2f\n",Valor);
                                                        
                         }
                     }
                 }
             }
         }
    

     }
 }
        


