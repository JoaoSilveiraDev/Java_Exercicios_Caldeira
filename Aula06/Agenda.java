import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
public class Agenda {
    public TreeMap<String, Integer> nomeNumero = new TreeMap<String, Integer>();
    public TreeMap<String, String> nomeEndereco = new TreeMap<String, String>();

    public void setPessoa(String nome, Integer numero, String endereco){
        this.nomeNumero.put(nome, numero);
        this.nomeEndereco.put(nome, endereco);
    }
    public void getListaDeContatos(){
        System.out.println(this.nomeNumero);
        System.out.println(this.nomeEndereco);
    }
    public void getContatoPorLocalidade(String localidade){
        for(Map.Entry<String, String> elemento : nomeEndereco.entrySet()){
            if(elemento.getValue() == localidade){
                System.out.println(elemento.getKey());
                System.out.println(this.nomeNumero.get(elemento.getKey()));
           }
        }
    }
    public static void main(String[]args){
        Agenda agenda = new Agenda();
        agenda.setPessoa("joao", 1234546, "Centro-Sul");
        agenda.setPessoa("marina", 1234547, "Centro-Norte");
        agenda.setPessoa("augusto", 1234549, "Centro-Sul");
        agenda.getListaDeContatos();
        agenda.getContatoPorLocalidade("Centro-Sul");
    }
}
