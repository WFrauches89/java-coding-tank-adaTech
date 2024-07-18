package aula03;

import java.awt.font.MultipleMaster;
import java.util.Scanner;

public class NewExercComTernario {

    public static void main(String[] args) {

//         idade < 18 Juvenil
//         idade > 18 && <= 40  Adulto
//         idade > 40 Master

        Scanner scn = new Scanner(System.in);
        System.out.println("Digite sua idade:");

        int idade = Integer.parseInt(scn.nextLine());

        String categoria = (idade < 18) ? "Juvenil" : idade > 40 ? "Master" : "Adulto";

        System.out.println(categoria);

        scn.close();

    }
}
