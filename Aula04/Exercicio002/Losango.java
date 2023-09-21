public class Losango extends FormaGeometrica{
    public double diagonalMaior;
    public double diagonalMenor;
    public Losango(double diagonalMaior, double diagonalMenor){
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public void calcularArea() {
        double area = (this.diagonalMaior * this.diagonalMenor)/2;
        System.out.println("A area do losango: " + area);
    }
}
