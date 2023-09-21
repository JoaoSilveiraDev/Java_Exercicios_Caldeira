public class TestaTributavel {
    public static void main(String []args){
ContaCorrente conta = new ContaCorrente("joao", "00000000000", 1234, "Nasca", "Corrente", true);
conta.depositoConta(1000);
conta.calculaTributos();
ContaPoupanca contaP = new ContaPoupanca("joao", "00000000000", 1234, "santander", "poupanca", false);
contaP.depositoConta(5450.34);
contaP.calculaTributos();
    }
}
