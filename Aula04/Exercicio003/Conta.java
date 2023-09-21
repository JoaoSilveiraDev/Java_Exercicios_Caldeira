import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class Conta{
    Date data = new Date();
    private boolean finaliza;
    private String horaAtual = new SimpleDateFormat("HH:mm:ss").format(data);
    private String dataAtual = new SimpleDateFormat("dd/MM/yyyy").format(data);
    private int dataFormatada = Integer.parseInt((String.valueOf(dataAtual.charAt(0)))+(String.valueOf(dataAtual.charAt(1))));
    private int horaFormatada = Integer.parseInt((String.valueOf(horaAtual.charAt(0)))+(String.valueOf(horaAtual.charAt(1))));
    private String nome;
    private String CPF;
    private int identificadorConta;
    private String banco;
    private String endereco;
    protected double saldo;
    public String tipoConta;
    public boolean seguroVida;

    public Conta(String nome, String CPF, int identificador, String banco, String tipoConta, boolean seguroVida){
        this.seguroVida = seguroVida;
        this.tipoConta = tipoConta;
        this.finaliza = false;
        this.nome = nome;
        this.CPF = CPF;
        if(verificaCPF() == true){

        }else{
        }
        this.identificadorConta = identificador;
        this.banco = banco;
        this.saldo = 0;
        if(this.dataFormatada == 1){
            this.saldo -= this.saldo - (this.saldo * 0.005);
        }
    }
    public void saqueSaldo(double saque) {
        if(this.finaliza == false){
            if (this.saldo >= saque) {
                double saldoNovo = this.saldo - saque;
                this.saldo = saldoNovo;
                System.out.println("Transferencia feita com sucesso! Seu novo saldo: " + this.saldo);
            } else {
                System.out.println("Voce nao tem saldo suficiente!");
            }
        }else{
            System.out.println("Sistema bloqueado!");
        }

    }

    public void depositoConta(double deposito) {
        if(this.finaliza == false){
            this.saldo += deposito;
            System.out.println("Deposito feito com sucesso! Seu saldo atual: " + this.saldo);
        }else{
            System.out.println("Sistema bloqueado!");
        }
    }

    public void pixConta(double valor, Conta identificador, String hora) {
        if(this.finaliza == false){
            if (this.saldo > valor && this.horaAtual!=null) {
                identificador.saldo = valor;
                double saldoNovo = this.saldo - valor;
                this.saldo = saldoNovo;
                System.out.println("Pix feito com sucesso para a conta " + identificador + ". Seu saldo atual: " + this.saldo);
            }else{
                System.out.println("Voce nao tem saldo suficiente");
            }
        }else{
            System.out.println("Sistema bloqueado!");
        }

    }
    public void getSaldo(){
        if(this.finaliza == false){
            System.out.println("Seu saldo atual: " + this.saldo);
        }else{
            System.out.println("Sistema bloqueado!");
        }

    }
    public void getHoraAtual(){
        if(this.finaliza == false){
            System.out.println("A hora atual: " + this.horaAtual);
        }else{
            System.out.println("Sistema bloqueado!");
        }

    }
    public void getInformacoes() {
        if(this.finaliza == false){
            System.out.println("Nome do banco: " + this.banco);
            System.out.println("CPF do cliente: " + this.CPF);
            System.out.println("Saldo atual: " + this.saldo);
            System.out.println("Endereco do cliente: " + this.endereco);
            System.out.println("Hora atual: " + this.horaAtual);
            System.out.println("Numero da conta: " + this.identificadorConta);
            System.out.println("Nome do cliente: " + this.nome);
        }else{
            System.out.println("Sistema bloqueado!");
        }

    }
    public void transferencia(Conta identificador, double valor){
        if(this.finaliza == false){
            if(this.horaFormatada<06 && this.horaFormatada>19 && this.saldo>=valor){
                identificador.saldo = valor;
            }else if(this.horaFormatada>06 && this.horaFormatada<19){
                System.out.println("Voce excedeu o horario de transferencia!");
            }else if(this.saldo<valor){
                System.out.println("Voce nao tem saldo suficiente!");
            }
        }else{
            System.out.println("Sistema bloqueado!");
        }


    }
    public boolean verificaCPF(){
        if(this.finaliza == false){
            char[] array = this.CPF.toCharArray();
            if(array.length == 11){
                return true;
            }else{
                System.out.println("O CPF do cliente esta invalido!");
                return false;
            }
        }else{
            System.out.println("Sistema bloqueado!");
            return false;
        }

    }
    public void alterarEndereco(String endereco){
        if(this.finaliza == false){
            this.endereco = endereco;
            System.out.println("Endereco atualizado com sucesso!");
        }else{
            System.out.println("Sistema bloqueado!");
        }

    }
    public void taxaJuros(double taxa){
        if(this.finaliza == false){
            this.saldo += this.saldo * taxa;
        }else{
            System.out.println("Sistema bloqueado!");
        }

    }
    public void fecharConta(){
        this.finaliza = true;
    }
}