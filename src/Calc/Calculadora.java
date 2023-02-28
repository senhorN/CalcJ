package Calc;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro valor...");
        a = scan.nextInt();

        System.out.println("Digite o segundo valor...");
        b = scan.nextInt();

        int somar = Somar(a, b);
        int subtrair = Subtrair(a, b);
        int multiplicar = Multiplicar(a, b);
        int dividir = Dividir(a, b);


        System.out.println("O resultado somado é:" + somar);
        System.out.println("O resultado subtraido é:" + subtrair);
        System.out.println("O resultado multiplicado é:" + multiplicar);
        System.out.println("O resultado divido é:" + dividir);

    }

    public static int Somar(int a, int b){

        return a + b;
    }
    public static int Subtrair(int a, int b){

        return a - b;
    }
    public static int Multiplicar(int a, int b){

        return a * b;
    }
    public static int Dividir(int a, int b){

        return a / b;
    }
}
