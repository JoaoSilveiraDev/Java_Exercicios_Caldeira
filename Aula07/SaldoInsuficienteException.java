package Exercicio006;

public class SaldoInsuficienteException extends Exception{
    @Override
    public String toString() {
        return "SEU SALDO EH INSUFICIENTE PARA A OPERACAO DE SAQUE!";
    }
}
