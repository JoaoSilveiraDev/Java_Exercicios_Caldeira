import org.example.CalculadoraHipoteca;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraHipotecaTest {
    @Test
    void hipotecaResultado(){
        CalculadoraHipoteca calculadora = new CalculadoraHipoteca();
        double valor = calculadora.calculaHipoteca(1000, 10, 5);
        Assertions.assertEquals(833.3333333333334, valor);
    }
}
