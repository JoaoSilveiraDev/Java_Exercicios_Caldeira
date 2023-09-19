public class Retangulo extends FormaGeometrica{
    public double base;
    public double altura;
    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double area = this.base * this.altura;
        System.out.println("A area do retangulo: " + area);
    }
}
