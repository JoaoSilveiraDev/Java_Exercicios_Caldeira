import com.sun.javafx.binding.StringFormatter;

import java.util.Scanner;
public class Exercicio013{
    public static void main(String []args){
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite quantos dolares você tem: ");
        double dolares = prompt.nextDouble();

        System.out.println("Digite a taxa de cambio atual da moeda desejada: ");
        double cambio = prompt.nextDouble();

        double convertido = dolares * cambio;

        String convertidoArredonda = String.format("%2f", convertido);

        System.out.println("O valor convetido é: " + convertidoArredonda + "!");
    }
}