import java.util.Scanner;

public class DiaDaSemana{
    enum diaSemana{
        SEGUNDA,
        TERCA,
        QUARTA,
        QUINTA,
        SEXTA,
        SABADO,
        DOMINGO

    }
    public void selecionaDia(diaSemana dia){
        if(dia.equals(diaSemana.SEGUNDA)){
            System.out.println("Boa segunda!");
        } else if (dia.equals(diaSemana.TERCA)) {
            System.out.println("Boa terca");
        } else if (dia.equals(diaSemana.QUARTA)) {
            System.out.println("Boa quarta");
        }else if(dia.equals(diaSemana.QUINTA)){
            System.out.println("Boa quinta");
        } else if (dia.equals(diaSemana.SEXTA)) {
            System.out.println("Boa sexta");
        } else if (dia.equals(diaSemana.SABADO)) {
            System.out.println("Bom sabado");
        } else if (dia.equals(diaSemana.DOMINGO)) {
            System.out.println("Bom domingo");
        }
    }
    public static void main(String []args){
        DiaDaSemana dia = new DiaDaSemana();
        String diaEscolhido = "";
        Scanner input = new Scanner(System.in);

        System.out.println("digite dia semana");
        diaEscolhido = input.nextLine().toUpperCase();
        dia.selecionaDia(diaSemana.valueOf(diaEscolhido));
    }
}