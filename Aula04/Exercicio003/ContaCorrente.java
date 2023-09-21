public class ContaCorrente extends Conta implements Tributavel{
    public ContaCorrente(String nome, String CPF, int identificador, String banco, String tipoConta, boolean seguroVida) {
        super(nome, CPF, identificador, banco, tipoConta, seguroVida);
    }

    @Override
    public double calculaTributos() {
        System.out.println("Seu tributo foi de: " + (super.saldo * 0.01));
        double tributo = (super.saldo * 0.01);
        super.saldo -= super.saldo - (super.saldo*0.01);
        if(super.seguroVida == true){
            super.saldo -= 42;
            System.out.println("Voce foi descontado em 42 reais pelo seguro de vida!");
            return tributo + 42;
        }
        else{return tributo;}
    }
}

