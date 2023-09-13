import java.util.Scanner;
public class Exercicio004{
    public static void main(String[]args){
        Scanner prompt = new Scanner(System.in);
        int alternativa = 0;
        while(alternativa!=9){
            System.out.println("Digite o primero numero: ");
            int primeiroNumero = prompt.nextInt();
            System.out.println("Digite o segundo numero: ");
            int segundoNumero = prompt.nextInt();
            System.out.println("1 - Soma");
            System.out.println("2 - Subtracao");
            System.out.println("3 - Divisao");
            System.out.println("4 - Multiplicacao");
            System.out.println("9 - Sair");
            System.out.println("Digite a operacao desejada: ");
            int operacao = prompt.nextInt();
            switch(operacao){
                case 1:{ int soma = primeiroNumero + segundoNumero; System.out.println(soma);break;}
                case 2:{ int subtracao = primeiroNumero - segundoNumero; System.out.println(subtracao);break;}
                case 3:{ int divisao = primeiroNumero / segundoNumero; System.out.println(divisao);break;}
                case 4:{ int multiplicacao = primeiroNumero * segundoNumero; System.out.println(multiplicacao);break;}
                case 9:{ alternativa = 9;break;}
            }
        }
        System.out.println("Operacao finalizada!");
    }
}
