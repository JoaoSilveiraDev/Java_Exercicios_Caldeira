import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
public class Exercicio012{
    public static void main(String []args){
        Scanner prompt = new Scanner(System.in);
        int contador = 0;
        System.out.println("Digite uma palavra: ");
        String palavra = prompt.next();
        String[] palavraArray = palavra.split("(?!^)");
        System.out.println(Arrays.toString(palavraArray));
        for (String s : palavraArray) {
            if (Objects.equals(s, "a") || Objects.equals(s, "e") || Objects.equals(s, "i") || Objects.equals(s, "o") || Objects.equals(s, "u")) {
                contador = contador + 1;
            }
        }
        System.out.println(contador);
    }
}
