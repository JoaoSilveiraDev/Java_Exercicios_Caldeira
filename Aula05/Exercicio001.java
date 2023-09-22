import java.util.Scanner;
public class Exercicio001 {
    public static void main(String[]args){
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        double num1 = prompt.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double num2 = prompt.nextDouble();
        System.out.println("Digite o terceiro numero: ");
        double num3 = prompt.nextDouble();
        System.out.println("Digite o quarto numero: ");
        double num4 = prompt.nextDouble();
        System.out.println("Digite o quinto numero: ");
        double num5 = prompt.nextDouble();
        double array[] = {num1, num2, num3, num4, num5};
        double soma = 0;
        for(int i = 0; i<array.length; i++){
            soma += array[i];
        }
        System.out.println("A soma do array: " + soma);
        double media = soma/array.length;
        System.out.println("A media do array: " + media);
    }
}