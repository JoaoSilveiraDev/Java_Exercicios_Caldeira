public class Quadrado implements Desenhavel{
    public String nomeDaFigura = "Quadrado";
    @Override
    public void desenhar() {
        System.out.println("Vou desenhar um " + this.nomeDaFigura);
    }
}
