public class Circulo extends FormaGeometrica {
    public double raio;
    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        double area = (this.raio * this.raio) * Math.PI;
        System.out.println("A area do seu circulo: " + area);
    }
}
