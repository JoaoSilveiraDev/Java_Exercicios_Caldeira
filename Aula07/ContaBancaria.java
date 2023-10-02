package Exercicio006;

public class ContaBancaria {
    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }
    public double saldo;
    public void sacar(double valor) throws SaldoInsuficienteException {
        if(this.saldo<valor){
            throw new SaldoInsuficienteException();
        }else{this.saldo -= valor;
        System.out.println("OPERACAO FEITA COM SUCESSO!");
        }
    }
}
