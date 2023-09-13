import java.util.Scanner;
public class Exercicio007{
    public static void main(String []args){
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = prompt.nextInt();
        if(idade<16){
            System.out.println("Você ainda não pode votar!");
        } else if (idade>=16 && idade<18 || idade>=65) {
            System.out.println("Seu voto é falcultativo!");
        }else{
            System.out.println("Seu voto é obrigatório!");
        }
    }
}
