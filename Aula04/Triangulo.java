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
        }else if(this.ladoUm == this.ladoDois
                || this.ladoDois == this.ladoTres 
                || this.ladoUm == this.ladoTres){
                if(this.ladoUm == this.ladoDois){
                    double altura = (this.ladoUm * this.ladoUm) - ((this.ladoTres/2)*(this.ladoTres/2))
                    double area = (this.ladoTres * altura)/2;
                }if else(this.ladoDois == this.ladoTres){
                    double altura = (this.ladoDois * this.ladoDois) - ((this.ladoUm/2)*(this.ladoUm/2))
                    double area = (this.ladoUm * altura)/2;
                }if else(this.ladoUm == this.ladoTres){
                    double altura = (this.ladoUm * this.ladoUm) - ((this.ladoDois/2)*(this.ladoDois/2))
                    double area = (this.ladoDois * altura)/2;
        }
    }else if(this.ladoUm != this.ladoDois 
            && this.ladoUm != this.ladoTres 
            && this.ladoDois != this.ladoTres){
            if((this.ladoUm < this.ladoTres && this.ladoDois < this.ladoTres){
                    double area = (this.ladoUm * this.ladoDois)/2;
                }if else(this.ladoUm < this.ladoDois && this.ladoTres < this.ladoDois){
                    double area = (this.ladoUm * this.ladoTres)/2;
                }if else(this.ladoDois < this.ladoUm && this.ladoTres < this.ladoUm){
                    double area = (this.ladoDois * this.ladoTres)/2;
        }
    }
    
}
