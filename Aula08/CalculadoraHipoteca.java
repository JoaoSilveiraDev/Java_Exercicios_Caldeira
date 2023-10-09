package org.example;

public class CalculadoraHipoteca {
    public double calculaHipoteca(double valorEmprestimo, double taxaDeJurosAnuais, int prazoEmAnos){
        return (valorEmprestimo * (taxaDeJurosAnuais * prazoEmAnos)) / (prazoEmAnos * 12);
    }
}