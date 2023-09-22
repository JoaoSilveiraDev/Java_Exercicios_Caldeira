import java.util.ArrayList;
public class Exercicio004 {
    public ArrayList<String> produto = new ArrayList<String>();

    public void adicionarCompra(String produto, String validade){
        this.produto.add(produto.concat(": "  + validade + " / "));
    }
    public void removerCompra(int posicao){
        this.produto.remove(posicao);
    }
    public void verLista(){
        System.out.println(this.produto);
    }

}
