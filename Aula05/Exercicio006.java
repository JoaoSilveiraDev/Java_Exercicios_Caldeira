import java.util.ArrayList;
import java.util.LinkedList;
public class Exercicio006 {
    public ArrayList<String> nome = new ArrayList<String>();
    public LinkedList<Integer> assento = new LinkedList<Integer>();
    public ArrayList<String> CPF = new ArrayList<String>();
    public ArrayList<String> idaEvolta = new ArrayList<String>();

    public void setNome(String nome){
        this.nome.add(nome);
    }
    public void setAssento(int lugar){
        this.assento.add(lugar);
    }
    public void setCPF(String CPF){
        this.CPF.add(CPF);
    }
    public void setIdaEvolta(String ida, String volta){
        this.idaEvolta.add(ida.concat(" / "  + volta));
    }
    public void reservar(String nome, int lugar, String CPF, String ida, String volta){
            setNome(nome);
            setAssento(lugar);
            setCPF(CPF);
            setIdaEvolta(ida, volta);
    }
    public void cancelar(int posicao){
        this.nome.remove(posicao);
        this.assento.remove(posicao);
        this.CPF.remove(posicao);
        this.idaEvolta.remove(posicao);
    }
    public void exibirReservas(){
        System.out.println(this.nome);
        System.out.println(this.assento);
        System.out.println(this.CPF);
        System.out.println(this.idaEvolta);
    }
}
