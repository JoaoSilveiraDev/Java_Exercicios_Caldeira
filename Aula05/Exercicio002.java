import java.util.Random;
import java.util.Scanner;
public class Exercicio002 {
  public static void main(String []main){
      double array[] = new double[10];
      Scanner prompt = new Scanner(System.in);
      for(int i = 0; i<array.length; i++){
          double numeroAleatorio = Math.random() * 50;
          array[i] = Math.round(numeroAleatorio);
          System.out.println(array[i]);
      }
      System.out.println("Digite o numero que voce deseja achar no array: ");
      double numero = prompt.nextDouble();
      boolean flag = false;
      for(int z = 0; z<array.length; z++){
          if(array[z] == numero){
              flag = true;
              break;
          }
      }
      if(flag == true){
          System.out.println("O numero digitado esta na lista");
      }else{
          System.out.println("O numero nao esta na lista");
      }
  }

}
