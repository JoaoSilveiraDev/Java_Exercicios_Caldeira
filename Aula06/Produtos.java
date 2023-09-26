import java.util.LinkedHashMap;
import java.util.Map;

public class Produtos {
    public LinkedHashMap<String, Double> produto = new LinkedHashMap<String, Double>();

    public void setProduto(String nome, double preco){
        this.produto.put(nome, preco);
    }
    public void getProduto(){
        for(Map.Entry<String, Double> elemento : produto.entrySet()){
            System.out.println(elemento.getKey());
            System.out.println("Preco: " + elemento.getValue());
        }
    }
    public static void main(String[]args){
        Produtos produto = new Produtos();
        produto.setProduto("Banana", 2.90);
        produto.setProduto("Ameixa", 3.95);
        produto.setProduto("Carne", 25.90);
        produto.getProduto();
    }
}
