package org.example;

import java.util.*;

public class Lista {
    public static void main(String []args){
        Main lista1 = new Main("banana", 1.20, 5);
        Main lista2 = new Main("cenoura", 3.99, 15);
        Main lista3 = new Main("berinjela", 4.95, 9);
        Main lista4 = new Main("melancia", 2.99, 8);

        List<Main> lista = Arrays.asList(lista1,lista2,lista3, lista4);

        List<Double> precos = new ArrayList<Double>();
        lista.forEach(e -> precos.add(e.getValor()));
        double maior = Integer.MIN_VALUE;
        for (int i = 0; i < precos.size()-1; i++) {
            if (precos.get(i) > maior) {
                maior = precos.get(i);
            }
        }
        double soma = precos.stream().mapToDouble(Double::doubleValue).sum();
        List<String> novaLista = new ArrayList<String>();
        lista.stream().forEach(e -> {
            if(e.getQuantidade()>10){
                novaLista.add(e.getNome());
            }
        });
        System.out.println("O preço mais alto é: " + maior);
        System.out.println("A soma dos preços é: " + soma);
        System.out.println("Elemento que possui mais de 10 unidades: " + novaLista);

    }
}
