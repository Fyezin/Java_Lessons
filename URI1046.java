import java.util.Scanner; 
    public class URI1046{ 
        public static void main(String args[]){ 
            Scanner teclado = new Scanner(System.in); 
            int HI, HF, DurI, DurF, Dur, H;
            HI = teclado.nextInt();
            HF = teclado.nextInt();
            Dur = HF - HI;
            

            if (Dur < 0){
                Dur = 24 + Dur;
                System.out.println("O JOGO DUROU "+Dur+" HORA(S)");
            }
            else if (Dur == 0){
                System.out.println("O JOGO DUROU 24 HORA(S)");
            }
            else if (Dur > 0){
                System.out.println("O JOGO DUROU "+Dur+" HORA(S)");
                
            }
        

                                           
                                           
            
                            
    } 
 

} 