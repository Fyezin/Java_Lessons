// novo tipo de dado
public class Televisao{
    String  marca;
    int     tamanhoTela;
    int     canal;
    int     volume;
    boolean ligada;
    boolean mute;

    void ligar(){
        ligada = true;
        System.out.println("A TV "+marca+" esta ligada agora");
    }

    void desligar(){
        ligada = false;
        System.out.println("Agora a TV "+marca+" esta desligada");
    }

    void power(){
        ligada = !ligada;
        System.out.println("Status da TV "+marca+" : Ligada = "+ligada);
    }

    void avancarCanal(){
        if (ligada == true){
            canal++;
            if (canal >=99){
                canal = 99;
            }
            System.out.println("A TV "+marca+" esta no canal "+canal);
        }
        else{
            System.out.println("Por favor, antes ligue a TV "+marca);
        }
    }
    void voltarCanal(){
        if (ligada == true){
            canal--;
            if (canal <=1){
                canal = 1;
            }
            System.out.println("A TV "+marca+" esta no canal "+canal);
        }
        else{
            System.out.println("Por favor, antes ligue a TV "+marca);
        }
    void aumentarVolume(){
        if (ligada == true){
            volume++;
            if (volume <=10){
                volume = 10;
            }
            System.out.println("A TV "+marca+" esta no volume "+volume);
        }
        else{
            System.out.println("Por favor, antes ligue a TV "+marca);
    
        }
    }
}       