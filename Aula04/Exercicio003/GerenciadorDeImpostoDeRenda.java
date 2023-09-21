public class GerenciadorDeImpostoDeRenda {
    ContaCorrente conta = new ContaCorrente("nome", "00000000000", 1234, "santander", "Corrente", true);
    ContaPoupanca contaP = new ContaPoupanca("joao", "00000000000", 1234, "santander", "poupanca", false);
    public double tributosTotais;

    public void CalculaTributos(){
        this.tributosTotais += conta.calculaTributos();
        this.tributosTotais += contaP.calculaTributos();
        System.out.println(tributosTotais);
    }
    public void adiciona(double tributo){
        this.tributosTotais += tributo;
    }
}
