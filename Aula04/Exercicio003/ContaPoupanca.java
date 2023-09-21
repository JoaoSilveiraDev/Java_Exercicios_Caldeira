public class ContaPoupanca extends Conta implements Tributavel{
    public ContaPoupanca(String nome, String CPF, int identificador, String banco, String tipoConta, boolean seguroVida){
        super(nome, CPF, identificador, banco, tipoConta, seguroVida);
    }

    @Override
    public double calculaTributos() {
        System.out.println("Seu tributo foi de: " + (super.saldo * 0.01));
        if(super.seguroVida == true){
            System.out.println("Voce foi descontado em 42 reais pelo seguro de vida!");
            super.saldo -= 42;
            return 42;
        }
        return 0;
    }
}
