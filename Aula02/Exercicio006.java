import java.util.Arrays;
import java.util.Scanner;
public class Exercicio006{
    public static void main(String []args){
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String string = prompt.next();
        char[] array = string.toCharArray();
        int contador = 0;
        for(int z = 0; z<array.length; z++){
            contador += 1;
        }
        for(int i = contador - 1; i>=0; i--){
            System.out.println(array[i]);
        }
    }
}
