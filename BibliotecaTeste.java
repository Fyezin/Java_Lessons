import java.util.Scanner;
public class BibliotecaTeste{
    public static void main(String args[]){
        // apenas declarei as referencias
        Biblioteca l1, l2, l3, l4, l5;

        // aqui vou criar os objetos
        l1 = new Biblioteca("Jedi Java","Isidrão", "2020", "Tecnologia", "10", "5", false);
        l2 = new Biblioteca("Manual do Churrasco","Augusto D.", "2008", "Gastronomia", "2", "2", false);
        l3 = new Biblioteca("D&D","Barnabé", "2000", "Jogos", "6", "3", true);
        l4 = new Biblioteca("Drinks","Zé Cachaça", "2018", "Gastronomia", "5", "10", false);
        l5 = new Biblioteca("Drink Water","Zé Gotinha", "2013", "Saúde", "1", "4", true);
        
        System.out.println (l1.imprimir());
        System.out.println (l2.imprimir());
        System.out.println (l3.imprimir());
        System.out.println (l4.imprimir());
        System.out.println (l5.imprimir());
        
        l4.setEmprestado(true);
        System.out.println (l4.imprimir());

    }
}