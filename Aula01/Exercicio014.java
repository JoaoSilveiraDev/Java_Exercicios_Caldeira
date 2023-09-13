import java.util.Scanner;
public class Exercicio014{
    public static void main(String []args){
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite o numero do fatorial: ");
        int num = prompt.nextInt();
        int fator = num;

        for(int i = num - 1; i>0; i--){
            int resultado = fator * i;
            fator = resultado;
        }
        System.out.println(fator);
    }
}
