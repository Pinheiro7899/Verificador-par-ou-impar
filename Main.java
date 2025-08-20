import java.util.Scanner;

public class Main {
    public static void main(String [] args) {

        Scanner imp = new Scanner(System.in);

        System.out.print("insira um numero inteiro: ");
        int numero = imp.nextInt();


        if (numero % 2 == 0) {
            System.out.println("O numero " + numero + "e PAR");
        }  else {
            System.out.println("O numero " + numero + " e IMPAR.");
        }

        imp.close();


    }
}