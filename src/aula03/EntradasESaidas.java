package aula03;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class EntradasESaidas {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o primeiro número");
            int a = Integer.parseInt(scn.nextLine());
            System.out.println("Digite o segundo número");
            int b = Integer.parseInt(scn.nextLine());
            System.out.println("Digite o terceiro número");
            int c = Integer.parseInt(scn.nextLine());

            int maior = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

            int menor = (a < b) ? (a < c ? a : c) : (b < c ? b : c);

            int medio = (a != maior && a != menor) ? a : (b != maior && b != menor) ? b : c;

//            int[] numeros = {a, b, c};
//            Arrays.sort(numeros);
//            imprimirOrdem(numeros[2], numeros[1], numeros[0]);
            imprimirOrdem(maior, medio, menor);

            System.out.println("Caso queira sair, digite -> 0 <- ou digite -> 1 <- para repetir");
            int valida = Integer.parseInt(scn.nextLine());
            if (valida == 0) break;
        }
        scn.close();
        System.out.println("Programa encerrado.");
    }

    private static void imprimirOrdem(int a, int b, int c) {
        System.out.println("1° = " + a + "\n2° = " + b + "\n3° = " + c);
    }
}
