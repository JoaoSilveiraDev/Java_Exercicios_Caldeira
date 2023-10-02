package Exercicio005;

import java.util.Scanner;

public class IdadeMain{
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        if(idade<0 || idade>150){
            throw new IdadeInvalidaException();
        }
    }
}
