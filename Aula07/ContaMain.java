package Exercicio006;

import java.util.Scanner;

public class ContaMain {
    public static void main(String []args) throws SaldoInsuficienteException {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria(1500);
        conta.sacar(1300);
    }
}
