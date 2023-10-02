package Exercicio004;
import java.util.Scanner;

public class Calculadora implements Calculavel{
    enum Operacao{
        SUBTRAIR,
        SOMAR,
        MULTIPLICAR,
        DIVIDIR;
    }


    @Override
    public void subtrair(double numeroUm, double numeroDois) {
        double subtracao = numeroUm - numeroDois;
        System.out.println(subtracao);

    }

    @Override
    public void somar(double numeroUm, double numeroDois) {
        double soma = numeroUm + numeroDois;
        System.out.println(soma);

    }

    @Override
    public void multiplicar(double numeroUm, double numeroDois) {
        double multiplicacao = numeroUm * numeroDois;
        System.out.println(multiplicacao);

    }

    @Override
    public void dividir(double numeroUm, double numeroDois) {
        try{
            double divisao = numeroUm / numeroDois;
        }catch (ArithmeticException e){
            System.out.println("ERRO: Voce tentou dividir um numero por zero!");
        }finally {
            if(numeroDois != 0){
                double divisao = (numeroUm / numeroDois);
                System.out.println(divisao);
            }else{
                System.out.println("Operacao invalida, voce tentou dividir por zero!");
            }
        }

    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        System.out.println("Qual operacao voce deseja fazer: ");
        System.out.println("SUBTRAIR");
        System.out.println("SOMAR");
        System.out.println("MULTIPLICAR");
        System.out.println("DIVIDIR");
        try{
            String opera = scanner.next().toUpperCase();
            if(Operacao.valueOf(opera) == Operacao.SUBTRAIR){
                System.out.println("Digite o primeiro numero: ");
                int primeiroNumero = scanner.nextInt();
                System.out.println("Digite o segundo numero: ");
                int segundoNumero = scanner.nextInt();
                calculadora.subtrair(primeiroNumero, segundoNumero);
            }
            if(Operacao.valueOf(opera) == Operacao.SOMAR){
                System.out.println("Digite o primeiro numero: ");
                int primeiroNumero = scanner.nextInt();
                System.out.println("Digite o segundo numero: ");
                int segundoNumero = scanner.nextInt();
                calculadora.somar(primeiroNumero, segundoNumero);
            }
            if(Operacao.valueOf(opera) == Operacao.MULTIPLICAR){
                System.out.println("Digite o primeiro numero: ");
                int primeiroNumero = scanner.nextInt();
                System.out.println("Digite o segundo numero: ");
                int segundoNumero = scanner.nextInt();
                calculadora.multiplicar(primeiroNumero, segundoNumero);
            }
            if(Operacao.valueOf(opera) == Operacao.DIVIDIR){
                System.out.println("Digite o primeiro numero: ");
                int primeiroNumero = scanner.nextInt();
                System.out.println("Digite o segundo numero: ");
                int segundoNumero = scanner.nextInt();
                calculadora.dividir(primeiroNumero, segundoNumero);
            }
        }catch (Exception e){
            System.out.println("Voce digitou a operacao de forma erronea!");
        }


    }
}
