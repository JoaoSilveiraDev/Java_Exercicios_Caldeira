package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Exercicio001Main{
    public static void main(String []args){
        ArrayList<String> lista = new ArrayList<String>();

        lista.add("hoje");
        lista.add("hoje");
        lista.add("hoje");
        lista.add("hoje");
        lista.add("estou");
        lista.add("joao");
        lista.add("joao");
        lista.add("hoje");
        lista.add("joao");
        lista.add("estou");

        System.out.println("O número de palavras na lista é: " + lista.stream().count());
        System.out.println("A palavra mais longa é: " + lista.stream().max(Comparator.comparingInt(String::length)));

        Collections.sort(lista);
        for (int i = 0; i < lista.size()-1; i++) {
            int count = Collections.frequency(lista, lista.get(i));
            System.out.println(lista.get(i) + " apareceu " + count + " vezes.");
        }
    }
}