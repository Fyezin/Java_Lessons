import java.util.Scanner;
public class Refriferante{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int opcao;
        
        Refri acervo[]; // acervo agora é um conjunto (array) de Livros
        acervo = new Refri[3]; // meu acervo agora é um array de 3 posições de livros
        
        acervo[0] = new Refri("Coca-cola      ","8",2020,"Terror",1,2,false);
        acervo[1] = new Refri("Sprite         ","8",2020,"Terror Pesado",1,3,false);
        acervo[2] = new Refri("Fanta Laranja  ","9",2020,"Vish!!",1,4,false);
        acervo[3] = new Refri("Fanta Uva      ","10 ",2020,"Auto Ajuda",2,1, false);
        acervo[4] = new Refri("Guarana        ","5",2020,"Crescimento Pessoal", 2, 4, false);                         
 
        do{
            for (int pos=0; pos<acervo.length; pos++){
                if (!acervo[pos].isEmprestado()){
                   System.out.println(acervo[pos].imprimirInfo());
                }
            }
            System.out.println("Digite o codigo (0-4) do livro a emprestar!");
            opcao = teclado.nextInt();
            if (opcao >= acervo.length  || opcao < 0){
                System.out.println("Ow! Opcao invalida");
            }
            else{
                //Livro l = acervo[opcao];
                if (acervo[opcao].isEmprestado()){
                    System.out.println("Lamento, o livro "+acervo[opcao].getTitulo()+" esta emprestado!");
                }
                else{
                    acervo[opcao].emprestar();
                    System.out.println("Emprestimo realizado com sucesso!");
                }
            }
        } while (opcao != -1);


    

        
    }
}