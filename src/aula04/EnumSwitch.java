package aula04;

import java.util.Scanner;

public class EnumSwitch {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Qual operação deseja realizar?");
        OperacaoEnum operacao = OperacaoEnum.funcaoSinal(scn.nextLine());

        System.out.println("Operação selecionada: " + operacao +"\n");


        System.out.println("Digite primeiro número");
        int number1 = Integer.parseInt(scn.nextLine());

        System.out.println("Digite segundo número");
        int number2 = Integer.parseInt(scn.nextLine());

        int valor;

        calcular(operacao, number1, number2);

    }

    private static void calcular(OperacaoEnum operacao, int number1, int number2) {
        int valor;
        switch (operacao) {
            case SOMAR:
                valor = number1 + number2;
                System.out.println("Valor final: " +valor);
                break;
            case SUBTRAIR:
                valor = number1 - number2;
                System.out.println("Valor final: " +valor);
                break;
            case MULTIPLICAR:
               valor = number1 * number2;
                System.out.println("Valor final: " +valor);
                break;
            case DIVIDIR:
                if( number1 == 0 || number2 == 0){
                    valor = 0;
                } else {
                    valor = number1 / number2;
                }
                System.out.println("Valor final: " +valor);
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
    }
}
