import java.util.Scanner;
public class Exercicio005{
    public static void main(String[]args){
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite seu salário: ");
        double salario = prompt.nextDouble();
        System.out.println("Digite o salário mínimo atual: ");
        double salarioMinimo = prompt.nextDouble();
        double porcentagem = salario / salarioMinimo;
        String arredonda = String.format("%.2f", porcentagem);
        System.out.println("Você ganha " + arredonda + " salários mínimos.");
    }
}
