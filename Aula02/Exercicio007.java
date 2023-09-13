import java.util.Scanner;
public class Exercicio007 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int contador = 0;
        System.out.println("Bem vindo ao jogo dos Espartanos!");
        while (contador!=1) {
            System.out.println("Quantos soldados iremos enfrentar??");
            int palpite = prompt.nextInt();
            if (palpite < 300000) {
                System.out.println("UM POUCO MAIS!!!");
            } else if (palpite > 300000) {
                System.out.println("AI TU TE PASSOU MAGRAO!!!");
            } else if(palpite == 300000) {
                System.out.println("BINGO GUERREIRO!!!");
                contador = 1;
            }

        }
        System.out.println("Bora pra guerra!!!");
    }
}