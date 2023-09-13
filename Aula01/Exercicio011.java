import java.util.Scanner;
public class Exercicio011{
    public static void main(String []args){
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite a temperatura em celcius: ");
        double celcius = prompt.nextDouble();
        double fahrenheit = (celcius*(9/5) + 32);
        System.out.println("A temperatura em fahrenheit é " + fahrenheit);
    }
}
