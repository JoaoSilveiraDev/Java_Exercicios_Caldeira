import java.util.Scanner;
public class Principal{
    public static void main(String []args){
        Scanner prompt = new Scanner(System.in);
        int flag = 0;
        while(flag!=9) {
            System.out.println("1 - Círculo");
            System.out.println("2 - Losango");
            System.out.println("3 - Quadrado");
            System.out.println("4 - Retangulo");
            System.out.println("5 - Triangulo");
            System.out.println("9 - Encerrar");

            System.out.println("Qual forma você deseja calcular a área: ");
            int alternativa = prompt.nextInt();

            switch(alternativa){
                case 1:{
                    System.out.println("Digite o raio do circulo: ");
                    double raio = prompt.nextDouble();
                    Circulo circulo = new Circulo(raio);
                    circulo.calcularArea();
                    break;
                }
                case 2:{
                    System.out.println("Digite a diagonal maior do losango: ");
                    double diagonalMaior = prompt.nextDouble();
                    System.out.println("Digite a diagonal menor do losango: ");
                    double diagonalMenor = prompt.nextDouble();
                    Losango losango = new Losango(diagonalMaior, diagonalMenor);
                    losango.calcularArea();
                    break;
                }
                case 3:{
                    System.out.println("Digite o lado do quadrado: ");
                    double lado = prompt.nextDouble();
                    Quadrado quadrado = new Quadrado(lado);
                    quadrado.calcularArea();
                    break;
                }
                case 4:{
                    System.out.println("Digite a base do retangulo: ");
                    double base = prompt.nextDouble();
                    System.out.println("Digite a altura do retangulo: ");
                    double altura = prompt.nextDouble();
                    Retangulo retangulo = new Retangulo(base, altura);
                    retangulo.calcularArea();
                    break;
                }
                case 5:{
                    System.out.println("Digite o primero lado do triangulo: ");
                    double ladoUm = prompt.nextDouble();
                    System.out.println("Digite o segundo lado do triangulo: ");
                    double ladoDois = prompt.nextDouble();
                    System.out.println("Digite o terceiro lado do triangulo: ");
                    double ladoTres = prompt.nextDouble();
                    Triangulo triangulo = new Triangulo(ladoUm, ladoDois, ladoTres);
                    triangulo.calcularArea();
                    break;
                }
                case 9:{
                    flag = 9;
                    break;
                }
            }

        }
        System.out.println("Operação encerrada!");
        }

}
