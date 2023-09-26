import java.util.LinkedList;
public class Livros {
    public LinkedList<String> titulo = new LinkedList<String>();
    public LinkedList<String> categoria = new LinkedList<String>();

    public void setLivro(String titulo, String categoria){
        this.titulo.add(titulo);
        this.categoria.add(categoria);
    }
    public void getLivros(){
        System.out.println(this.titulo);
    }
    public void getCategoria(){
        System.out.println(this.categoria);
    }
    public void getCategoria(String categoria){
        for(int i = 0; i<this.categoria.size(); i++){
            if(this.categoria.get(i) == categoria){
                System.out.println(this.titulo.get(i));
            }
        }
    }
    public void apagarPilha(){
        for(int i = 0; i<=this.titulo.size()+1; i++){
            this.titulo.removeLast();
            this.categoria.removeLast();
        }
    }
    public static void main(String[]args){
        Livros livro = new Livros();
        livro.setLivro("Vidas secas", "Drama");
        livro.setLivro("Percy jackson", "Aventura");
        livro.setLivro("Sao Bernardo", "Drama");
        livro.getLivros();
        livro.getCategoria("Drama");
        livro.apagarPilha();
        livro.getLivros();
        livro.getCategoria();
    }
}