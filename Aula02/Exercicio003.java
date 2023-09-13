import java.util.Scanner;
public class Exercicio003{
    public static void main(String []args){
        Scanner prompt = new Scanner(System.in);
        System.out.println("1 - Idoso");
        System.out.println("2 - Gestante");
        System.out.println("3 - Deficiente");
        System.out.println("4 - N.D.A");
        System.out.println("Digite o numero que voce se identifica: ");
        int alternativa = prompt.nextInt();
        if(alternativa!=4){
            System.out.println("Voce eh da fila prioritaria!");
        }else{
            System.out.println("Voce eh da fila normal!");
        }
    }
}
