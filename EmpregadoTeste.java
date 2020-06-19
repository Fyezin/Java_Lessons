public class EmpregadoTeste{
    public static void main(String args[]){
        // apenas declarei as referencias
        Empregado e1;

        // aqui vou criar os objetos
        e1 = new Empregado("Jedi","Estag", 1000);
        
        System.out.println(e1.imprimir());
        e1.aumentarSalario (15);
        System.out.println(e1.imprimir());

    }
}