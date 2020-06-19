import java.util.Scanner; 
    public class URI1047{ 
        public static void main(String args[]){ 
            Scanner teclado = new Scanner(System.in); 
            int HI, MI, HF, MF, DurI, DurF, Dur, H, M;
            HI = teclado.nextInt();
            MI = teclado.nextInt();
            HF = teclado.nextInt();
            MF = teclado.nextInt();
            DurI = HI * 60 + MI;
            DurF = HF * 60 + MF;
            Dur = DurF - DurI;
            

            if (Dur > 0){
                H = Dur / 60;
                M = Dur %60;
                System.out.println("O JOGO DUROU "+H+" HORA(S) E "+M+" MINUTO(S)");
            }
            else if (Dur == 0){
                System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
            }
            else {
                Dur = Dur + 24 * 60;
                H = Dur / 60;
                M = Dur %60;
                System.out.println("O JOGO DUROU "+H+" HORA(S) E "+M+" MINUTO(S)");
                
            }
        

                                           
                                           
            
                            
    } 
 

} 