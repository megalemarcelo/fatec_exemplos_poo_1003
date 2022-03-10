import java.util.Scanner;
public class ifSimples{
    public static void main(String[] args) {
        //variável de referência: scanner
        Scanner leitor;
        //isso constrói um objeto do tipo Scanner
        //new é semelhante ao malloc da linguagem C
        //temos em funcionamento o Garbage Collector
        leitor = new Scanner (System.in);
        double nota;
        System.out.println("Digite a sua nota");
        nota = leitor.nextDouble();
        if (nota >= 6){
            System.out.println("Aprovado");
        }


        leitor.close();

    }
}