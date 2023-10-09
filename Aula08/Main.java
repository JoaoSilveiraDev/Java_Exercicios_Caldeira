package org.example;
import java.util.ArrayList;

public class Main {
    public String nome;
    public double valor;
    public int quantidade;
    public Main(String nome, double valor, int quantidade){
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }
    public String getNome(){
        return this.nome;
    }
    public double getValor(){
        return this.valor;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
}