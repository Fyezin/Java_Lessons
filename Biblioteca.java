// definição da classe pessoa
public class Biblioteca{
    // definição dos atributos "blindados"/encapsulados
    // estes atributos só tem acesso dentro da classe
    private  String titulo;
    private String autor;
    private String anopub;
    private String categoria;
    private String estante;      
    private String prateleira;
    private boolean emprestado;
    // método construtor para que eu, ao dar "new" num novo objeto,
    // seja obrigado a passar as 3 informações para ele nesta sequencia
    // nome, sobrenome, idade e sexo
    public Biblioteca(String titulo, String autor, String anopub, String categoria, String estante, String prateleira, boolean emprestado){
        this.titulo      = titulo;
        this.autor       = autor;
        this.anopub      = anopub;
        this.categoria   = categoria;
        this.estante     = estante;
        this.prateleira  = prateleira;
        this.emprestado  = emprestado;
    }

    // métodos GET e SET para cada atributo 
    // GET = método para consultar, ou seja, retorna o valor armazenado no atributo
    // SET = método para alterar/atribuir novo valor
    public void setTitulo(String titulo){
        this.titulo      = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setAnoPub(String anopub){
        this.anopub = anopub;
    }
    public String getAnoPub(){
        return this.anopub;
    }
    public void setCategoria(String anopub){
        this.anopub = anopub;
    }
    public String getCategoria(){
        return this.categoria;
    }
    public void setEstante(String estante){
        this.estante = estante;
    }
    public String getEstante(){
        return this.estante;
    }
    public void setPrateleira(String prateleira){
        this.prateleira = prateleira;
    }
    public String getPrateleira(){
        return this.prateleira;
    }
    public void setEmprestado(boolean emprestado){
        this.emprestado = emprestado;
    }
    public boolean getEmprestado(){
        return this.emprestado;
    }
        
    // um método que já retorna uma STRING compondo todas as infos da pessoa
    public String imprimir(){
        return "Titulo:"+titulo+" Autor: "+autor+" Ano Publicação:"+anopub+" Categoria:"+categoria+" Estante:"+estante+" Prateleira:"+prateleira+"Status"+emprestado;
    }

}