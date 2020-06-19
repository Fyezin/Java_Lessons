import java.util.Scanner; 
    public class URI1060{ 
        public static void main(String args[]){ 
            Scanner teclado = new Scanner(System.in); 
            float num;
            int Qtd=0;

            for(int cont = 1; cont <=6; cont++){
                num = teclado.nextFloat();
                if (num >0){
                    Qtd = Qtd+1;
                }
            }   
            System.out.println(Qtd+" valores positivos");
                                
            
                            
    } 
 

} 
