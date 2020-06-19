import java.util.Scanner; 
    public class URI1066{ 
        public static void main(String args[]){ 
            Scanner teclado = new Scanner(System.in); 
            float num, Soma = 0, Media = 0;
            int Positivo = 0, Negativo = 0, Par = 0, Impar = 0;
            int Qtd=0;
            
        

            for(int cont = 1; cont <=5; cont++){//Leia 5 valores Inteiros
                num = teclado.nextInt();
                if (num >0){
                    Positivo = Positivo+1;
                    }
                if (num <0){
                    Negativo = Negativo+1;}
                if (num % 2 == 0)
                {
                    Par = Par+1;}
                if (num % 2 != 0)
                {
                    Impar = Impar+1;
                   }
                
            }   
            System.out.println(Par+" valor(es) par(es)");
            System.out.println(Impar+" valor(es) impar(es)");
            System.out.println(Positivo+" valor(es) positivo(s)");
            System.out.println(Negativo+" valor(es) negativo(s)");
                      
                                           
            
                            
    } 
 

} 