package CursoNelioAlves;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número: \n");
        int numero1 = in.nextInt();

        System.out.print("Digite outro número: \n");
        int numero2 = in.nextInt();

        int operacao = calc(numero1, numero2);

        showResult(operacao);

        in.close();

    }

    public static int calc(int num1, int num2) {

        Scanner ye = new Scanner(System.in);

        System.out.print("Digite uma operacao: \n1. Soma\n2. Subtracao\n3. multiplicacao\n4. divisao\nSua resposta: ");
        int resultado = ye.nextInt();

        switch (resultado) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Digite uma operacao valida. ");
                break;
        }
        ye.close();
        return resultado;

    }

    public static void showResult(int value) {
        System.out.printf("O resultado corresponde a %d.\n", value);
    }

}
