import java.util.Scanner;
public class Exercicio009{
    public static void main(String []args){
        Scanner prompt = new Scanner(System.in);
        System.out.println("///////////////////////////////////");
        System.out.println("1 - Gestante");
        System.out.println("2 - Idoso");
        System.out.println("3 - Deficiente");
        System.out.println("4 - N.D.A");
        System.out.println("///////////////////////////////////");
        System.out.println("Em qual alternativa você se encaixa? ");
        int alternativa = prompt.nextInt();

        if(alternativa<4){
            System.out.println("Você pertence a fila prioritária!");
        }else{
            System.out.println("Você pertence a fila comum!");
        }

    }
}
