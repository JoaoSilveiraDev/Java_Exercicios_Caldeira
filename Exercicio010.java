import java.util.Scanner;
public class Exercicio010{
    public static void main(String []args){
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento: ");
        int ano = prompt.nextInt();
        int idade = 2023 - ano;
        System.out.println("Sua idade é: " + idade);
    }
}
