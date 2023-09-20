public class Quadrado extends FormaGeometrica{
    public double lado;
    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        double area = (this.lado * this.lado);
        System.out.println("A area do quadrado: " + area);
    }
}
