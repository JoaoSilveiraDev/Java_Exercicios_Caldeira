import java.util.Scanner;
public class Exercicio002{
    public static void main(String []args){
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = prompt.nextInt();
        if(idade<18){
            System.out.println("Voce nao pode comprar o carro!");
        } else if (idade>=18) {
            System.out.println("Digite seu salario: ");
            double salario = prompt.nextDouble();
            if(salario<2000){
                System.out.println("Voce nao pode comprar o carro!");
            }else{
                System.out.println("Voce pode comprar o carro!");
            }
        }
    }
}