import java.util.HashMap;
import java.util.Map;

public class Nomes {
    public HashMap<String,Integer> pessoa = new HashMap<String, Integer>();

    public void setPessoa(String nome, int idade){
        this.pessoa.put(nome, idade);
    }
    public void getPessoa(String nome){
        System.out.println("A pessoa com nome " + nome + " tem " + this.pessoa.get(nome) + " anos");
    }
    public void getPessoaTerceiraIdade(){
        for(Map.Entry<String, Integer> elemento : pessoa.entrySet()){
            if(elemento.getValue()>=65){
                System.out.println("Esta pessoa tem 65 anos ou mais: " + elemento.getKey());
            }
        }
    }
    public static void main(String []args){
        Nomes nome = new Nomes();
        nome.setPessoa("Luci", 67);
        nome.setPessoa("Joao", 20);
        nome.setPessoa("Eduardo", 16);
        nome.getPessoa("Joao");
        nome.getPessoaTerceiraIdade();
    }
}
