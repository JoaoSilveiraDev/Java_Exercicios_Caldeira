import java.util.Scanner;
public class DiaDaSemanaMain {
    public static void main(String []args){
        DiaDaSemana escolha = new DiaDaSemana();
        Scanner prompt = new Scanner(System.in);
        System.out.println("Qual o dia da semana?");
        String dia = prompt.nextLine().toUpperCase();
        escolha.selecionaDia(DiaDaSemana.diaSemana.valueOf(dia));

    }
}
