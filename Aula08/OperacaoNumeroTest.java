import org.example.OperacaoNumero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperacaoNumeroTest {
    @Test
    void somarNumeros(){
        OperacaoNumero calculadora = new OperacaoNumero();
        int soma = calculadora.somarNumeros(new int[]{10, 20, 30});
        Assertions.assertEquals(60, soma);
    }
    @Test
    void verificaPar(){
        OperacaoNumero calculadora = new OperacaoNumero();
        boolean retorno = calculadora.ehPar(4);
        boolean retornoDois = calculadora.ehPar(3);
        Assertions.assertEquals(true, retorno);
        Assertions.assertEquals(false, retornoDois);
    }
    @Test
    void verificaFatorial(){
        OperacaoNumero calculadora = new OperacaoNumero();
        int resultado = calculadora.calcularFatorial(5);
        Assertions.assertEquals(120, resultado);
    }
    @Test
    void verificaPalindromo(){
        OperacaoNumero calculadora = new OperacaoNumero();
        boolean resultado = calculadora.ehPalindromo("arara");
        boolean resultadoDois = calculadora.ehPalindromo("banana");
        Assertions.assertTrue(resultado);
        Assertions.assertFalse(resultadoDois);
    }
    @Test
    void verificaFibonacci(){
        OperacaoNumero calculadora = new OperacaoNumero();
        int resultado = calculadora.calcularFibonacci(11);
        Assertions.assertEquals(89, resultado);
    }
}
