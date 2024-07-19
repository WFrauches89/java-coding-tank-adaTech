package aula04;

import java.util.Arrays;
import java.util.Scanner;

public class NotasAluno {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Informe a quantidade de provas: ");
        int provas = Integer.parseInt(scn.nextLine());

        int[] arraysNotas = new int[provas];

        for(int i = 0; i < arraysNotas.length; i++){
            System.out.printf("Informe a nota da prova %s:",i+1);
            arraysNotas[i] = Integer.parseInt(scn.nextLine());
        }

//        A menor nota é: 50
//        A maior nota é: 90
//        A média das notas é: 71

        int maior = 0;
        int menor = 100;
        int notas = 0;


        for(int nota: arraysNotas){
            if(nota > maior){
                maior = nota;
            }
            if(nota < menor){
                menor = nota;
            }
             notas += nota;
        }

        double media = calcularMedia(notas, arraysNotas);;


        System.out.println(Arrays.toString(arraysNotas));
        System.out.printf("\nA menor nota é: %s\n",menor);
        System.out.printf("A maior nota é: %s\n",maior);
        System.out.printf("A média das notas é: %s\n",media);

    }
    private static double calcularMedia(int notas, int[] arraysNotas){

        double media = (double) notas / arraysNotas.length;
        return media;
    }

}
