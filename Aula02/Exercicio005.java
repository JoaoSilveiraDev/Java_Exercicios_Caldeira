import java.util.Arrays;
import java.util.Scanner;
public class Exercicio005 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String string = prompt.next();
        char[] array = string.toCharArray();
        for (int i = 0; i < array.length / 2; i++) {
            System.out.println(array[i]);
        }
    }
}
