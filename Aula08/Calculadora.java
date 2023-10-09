package org.example;

public class Calculadora {

    public double getSoma(double numeroUm, double numeroDois){
        return numeroUm+numeroDois;
    }
    public double getSubtracao(double numeroUm, double numeroDois){
        return numeroUm - numeroDois;
    }
    public double getDivisao(double numeroUm, double numeroDois){
        return numeroUm/numeroDois;
    }
    public double getMultiplicacao(double numeroUm, double numeroDois){
        return numeroUm * numeroDois;
    }
    public double getRadiciacao(double numeroUm){
        return Math.sqrt(numeroUm);
    }
    public double getPotenciacao(double numeroUm, double numeroDois){
        return Math.pow(numeroUm, numeroDois);
    }

}