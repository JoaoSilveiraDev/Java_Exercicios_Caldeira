import java.util.Scanner;
public class Exercicio008{
    public static void main(String []args){
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = prompt.nextInt();
        if(idade>=18){
            System.out.println("Digite seu salário: ");
            double salario = prompt.nextDouble();
            if(salario>=2000){
                System.out.println("Você pode comprar um carro!");
            }else{
                System.out.println("Você não tem renda suficiente!");
            }
        }else{
            System.out.println("Você não tem idade suficiente para comprar!");
        }
    }
}
