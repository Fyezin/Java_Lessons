import java.util.Scanner; 
    public class URI1064{ 
        public static void main(String args[]){ 
            Scanner teclado = new Scanner(System.in); 
            float num, Soma = 0, Media = 0;
            int Qtd=0;
        

            for(int cont = 1; cont <=6; cont++){
                num = teclado.nextFloat();
                if (num >0){
                    Qtd = Qtd+1;
                    Soma = Soma + num;
                    
                }
                
            }   
            Media = Soma / Qtd;
            System.out.println(Qtd+" valores positivos");
            System.out.printf("%.1f\n",Media);
            
                                
            
                            
    } 
 

} 