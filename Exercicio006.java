import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Exercicio006{
    public static void main(String []args){
        Scanner prompt = new Scanner(System.in);
        int segundosTotais = 86400;
        System.out.println("Digite as horas: ");
        int Hora = prompt.nextInt();
        System.out.println("Digite os minutos: ");
        int Minutos = prompt.nextInt();
        System.out.println("Digite os segundos: ");
        int Segundos = prompt.nextInt();
        int segundosPassados = (Hora*3600) + (Minutos*60) + Segundos;
        System.out.println("Se passaram " + segundosPassados + " segundos desde a meia noite e ainda faltam " + (segundosTotais - segundosPassados) + " segundos para terminar o dia.");

    }
}
