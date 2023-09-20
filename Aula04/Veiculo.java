public abstract class Veiculo {
    public String marca;
    public String modelo;
    public int ano;
    public double calcularCustoViagem(int distancia, String veiculo) {
        if (veiculo == "carro") {
            double custo = distancia * (0.20);
            System.out.println("O custo de viagem foi de: " + custo);
            return custo;
        } else {
            double custo = distancia * (0.15);
            System.out.println("O custo de viagem foi de: " + custo);
            return custo;
        }
    }
}