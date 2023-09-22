import java.util.ArrayList;
import java.util.LinkedList;
public class Exercicio005 {
    public ArrayList<String> nome = new ArrayList<String>();
    public LinkedList<Integer> numeroPaginas = new LinkedList<Integer>();

    public void setImpressao(String nome, int numPaginas){
        this.nome.add(nome);
        this.numeroPaginas.add(numPaginas);
    }
    public void imprimirFila(){
        for(int i = 0; i<this.nome.size(); i++){
            for(int z = 0; z<this.numeroPaginas.get(i); z++){
                System.out.println(this.nome.get(i));
            }
        }
    }
}
