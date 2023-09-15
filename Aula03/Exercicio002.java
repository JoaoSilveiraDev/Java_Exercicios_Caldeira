public class Circulo {
    private double raio;

    public Circulo(double raio){
        if(raio>0){
            this.raio = raio;
        }else{
            this.raio = 0;
            System.out.println("Use o metodo definirRaio para adicionar um novo raio, pois o raio adicionado foi nulo ou menor que zero.");
        }
    }
    public double areaCirculo(){
        if(this.raio>0){
            double area = Math.PI*(this.raio * this.raio);
            System.out.println("A area do circulo eh: " + area);
            return area;
        }else{
            System.out.println("Use o metodo definirRaio para adicionar um novo raio, pois o raio adicionado foi nulo ou menor que zero.");
            return 0.0;
        }
    }
    public double circunferencia(){
        if(this.raio>0){
            double circunferencia = 2 * Math.PI * this.raio;
            System.out.println("A circunferencia do circulo eh: " + circunferencia);
            return circunferencia;
        }else{
            System.out.println("Use o metodo definirRaio para adicionar um novo raio, pois o raio adicionado foi nulo ou menor que zero.");
            return 0.0;
        }
    }
    public void definirRaio(double raio){
        this.raio = raio;
        System.out.println("Raio atualizado");
    }
    public void informacoesCirculo(){
        System.out.println("A area do seu circulo eh: " + String.valueOf(areaCirculo()));
        System.out.println("A circunferencia do seu circulo eh: " + String.valueOf(circunferencia()));
        System.out.println("O raio do circulo eh: " + String.valueOf(this.raio));
    }
    public void circulosIguais(Circulo circulo){
        if(circulo.raio == this.raio){
            System.out.println("Voce possui dois circulos com a mesma area e circunferencia!");
        }else{
            System.out.println("Seus circulos sao diferentes!");
        }
    }
    public void calculaDiametro(){
        double diametro = 2 * this.raio;
        System.out.println("Seu diametro eh: " + diametro);
    }
    public void calculaAreaCirculosConcentricos(double raioUm, double raioDois){
        double areaUm = Math.PI*(raioUm*raioUm);
        double areaDois = Math.PI*(raioUm*raioDois);
        if(areaUm>areaDois){
            double areaSombreada = areaUm - areaDois;
            System.out.println("A area sombreada dos circulos concentricos eh: " + areaSombreada);
        }else if(areaUm<areaDois){
            double areaSombreada = areaDois - areaUm;
            System.out.println("A area sombreada dos circulos concentricos eh: " + areaSombreada);
        }else{
            System.out.println("Nao existe area sombreada, pois os circulos possuem os mesmos raios!");
        }
    }
    public void circuloCartesiano(double x, double y, double raio){
        System.out.println("O limite lateral esquerdo do circulo eh no ponto: " + (x - raio) + " do eixo X");
        System.out.println("O limite lateral direito do circulo eh no ponto: " + (x + raio) + " do eixo X");
        System.out.println("O limite superior do circulo eh no ponto: " + (y + raio) + " do eixo Y");
        System.out.println("O limite inferior do circulo eh no ponto: " + (y - raio) + " do eixo Y");
        System.out.println("Sua formula eh: x^(2)+y^(2)= " + String.valueOf(raio) + "^(2)");
    }
}
