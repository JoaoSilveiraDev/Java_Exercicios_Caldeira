package Exercicio005;

public class IdadeInvalidaException extends RuntimeException{
    @Override
    public String toString(){
        return "Voce digitou uma idade invalida!";
    }
}
