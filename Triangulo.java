public class Triangulo extends FormaGeometrica{
    public double ladoUm;
    public double ladoDois;
    public double ladoTres;
    public Triangulo(double ladoUm, double ladoDois, double ladoTres){
        this.ladoUm = ladoUm;
        this.ladoDois = ladoDois;
        this.ladoTres = ladoTres;
    }

    @Override
    public void calcularArea() {
        if(this.ladoUm == this.ladoDois
                && this.ladoUm == this.ladoTres
                && this.ladoDois == this.ladoTres){
            double area = (Math.sqrt(3)*(this.lado * this.lado))/4;
        }else if(this.ladoUm == this.ladoDois || this.ladoDois == this.ladoTres){
            
        }
    }
}
