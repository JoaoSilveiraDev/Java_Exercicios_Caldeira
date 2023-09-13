import java.util.Scanner;
public class Exercicio001{
    public static void main(String []args){
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite o menor numero: ");
        int numeroMenor = prompt.nextInt();
        System.out.println("Digite o maior numero: ");
        int numeroMaior = prompt.nextInt();
        for(int i = numeroMenor; numeroMenor<=numeroMaior; numeroMenor++, i++){
            if(((((i % 2 == 0) && (i != 2))
            || ((i % 3 == 0) && (i != 3)))
            || (((i % 5 == 0) && (i != 5))
            || ((i % 7 == 0) && (i != 7)))) ) {
            }
             else if(i!=1) {
                System.out.println(i);
            }
        }
    }
}