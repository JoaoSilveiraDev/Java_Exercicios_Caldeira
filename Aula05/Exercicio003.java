import java.util.Arrays;
import java.util.ArrayList;

public class Tarefa {
    public ArrayList <String> descricao = new ArrayList<String>();
    public ArrayList <String> titulo = new ArrayList<String>();
    public ArrayList <String> data = new ArrayList<String>();

    public void adicionarTarefa(String descricao, String titulo, String data){
        this.descricao.add(descricao);
        this.titulo.add(titulo);
        this.data.add(data);
    }
    public void removerTarefa(int posicao){
        this.titulo.remove(posicao);
        this.descricao.remove(posicao);
        this.data.remove(posicao);
    }
    public ArrayList<String> getDescricao(){
        return this.descricao;
    }
    public ArrayList<String> getTitulo(){
        return this.titulo;
    }
    public ArrayList<String> getData(){
        return this.data;
    }
    public void getTarefas(){
        System.out.println((getTitulo()));
        System.out.println((getData()));
        System.out.println((getDescricao()));
    }
}