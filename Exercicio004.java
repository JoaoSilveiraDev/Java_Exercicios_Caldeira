import java.util.Scanner;
public class Exercicio004{
    public static void main(String[]args){
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double num1 = prompt.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = prompt.nextDouble();
        System.out.println("Digite o terceiro número: ");
        double num3 = prompt.nextDouble();
        double lista[] = {num1,num2,num3};
        for(int n = 1; n< lista.length; n++){
            for(int i = 0; i< lista.length-1; i++){
                if(lista[i] > lista[i+1]){
                    double aux = lista[i];
                    lista[i] = lista[i+1];
                    lista[i+1] = aux;
                }
            }
        }
        System.out.println("O menor número digitado é: " + lista[0]);
        System.out.println("O maior número digitado è: " + lista[1]);
        System.out.println("A média aritmética dos números é: " + ((lista[0]+lista[1]+lista[2])/3));

    }
}
