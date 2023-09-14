import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class Conta {
    Date data = new Date();
    public String horaAtual = new SimpleDateFormat("HH:mm:ss").format(data);
    public int horaFormatada = Integer.parseInt((String.valueOf(horaAtual.charAt(0)))+(String.valueOf(horaAtual.charAt(1))));
    public String nome;
    public String CPF;
    public int identificadorConta;
    public String banco;
    public String endereco;
    public double saldo;

    public Conta(String nome, String CPF, int identificador, String banco){
        this.nome = nome;
        this.CPF = CPF;
        this.identificadorConta = identificador;
        this.banco = banco;
        this.saldo = 0;
    }
    public void saqueSaldo(double saque) {
        if (this.saldo >= saque) {
            double saldoNovo = this.saldo - saque;
            this.saldo = saldoNovo;
        } else {
            System.out.println("Voce nao tem saldo suficiente!");
        }
    }

    public void depositoConta(double deposito) {
        this.saldo += deposito;
    }

    public void pixConta(double valor, String hora) {
        if (this.saldo > valor && this.horaAtual!=null) {
            double saldoNovo = this.saldo - valor;
            this.saldo = saldoNovo;
        }
    }
    public double getSaldo(){
        System.out.println(this.saldo);
        return this.saldo;
    }
    public String getHoraAtual(){
        System.out.println(this.horaAtual);
        return this.horaAtual;
    }
    public void getInformacoes() {
        System.out.println(this.banco);
        System.out.println(this.CPF);
        System.out.println(this.saldo);
        System.out.println(this.endereco);
        System.out.println(this.horaAtual);
        System.out.println(this.identificadorConta);
        System.out.println(this.nome);
    }
    public void transferencia(Conta identificador, double valor){
        if(this.horaFormatada<06 && this.horaFormatada>19 && this.saldo>=valor){
            identificador.saldo = valor;
        }else if(this.horaFormatada>06 && this.horaFormatada<19){
            System.out.println("Voce excedeu o horario de transferencia!");
        }else if(this.saldo<valor){
            System.out.println("Voce nao tem saldo suficiente!");
        }

    }
}
