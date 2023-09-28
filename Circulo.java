public class Circulo implements Desenhavel{
    public String nomeDaFigura = "Circulo";
    @Override
    public void desenhar() {
        System.out.println("Vou desenhar um " + this.nomeDaFigura);
    }
}
