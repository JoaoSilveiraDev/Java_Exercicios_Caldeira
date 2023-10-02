package Exercicio003;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio003{
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero inteiro: ");
        System.out.println("Digite o segundo numero inteiro: ");

        try{
            int numeroUm = scanner.nextInt();
            int numeroDois = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Um dos numeros nao eh um inteiro!");
        }


    }
}