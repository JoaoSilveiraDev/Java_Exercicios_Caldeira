import org.example.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    void somarNumero(){
        Calculadora calculadora = new Calculadora();
        double soma = calculadora.getSoma(10, 20);
        Assertions.assertEquals(30, soma);
    }
    @Test
    void subtrairNumero(){
        Calculadora calculadora = new Calculadora();
        double subtracao = calculadora.getSubtracao(20, 10);
        Assertions.assertEquals(10, subtracao);
    }
    @Test
    void dividirNumero(){
        Calculadora calculadora = new Calculadora();
        double divisao = calculadora.getDivisao(10, 5);
        Assertions.assertEquals(2, divisao);
    }
    @Test
    void multiplicarNumero(){
        Calculadora calculadora = new Calculadora();
        double multiplicacao = calculadora.getMultiplicacao(10, 2);
        Assertions.assertEquals(20, multiplicacao);
    }
    @Test
    void raizNumero(){
        Calculadora calculadora = new Calculadora();
        double raiz = calculadora.getRadiciacao(49);
        Assertions.assertEquals(7, raiz);
    }
    @Test
    void potenciaNumero(){
        Calculadora calculadora = new Calculadora();
        double potencia = calculadora.getPotenciacao(10, 2);
        Assertions.assertEquals(100, potencia);
    }
}
