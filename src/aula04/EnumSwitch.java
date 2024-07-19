package aula04;

import java.util.Scanner;

public class EnumSwitch {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        DadosDTO dados = getDados(scn);
        calcular(dados.operacao(), dados.number1(), dados.number2());
    }

    private static DadosDTO getDados(Scanner scn) {

        System.out.println("Qual operação deseja realizar?\n Operações --> + - * /");
        OperacaoEnum operacao = OperacaoEnum.funcaoSinal(scn.nextLine());

        System.out.println("Operação selecionada: " + operacao +"\n");

        System.out.println("Digite primeiro número");
        int number1 = Integer.parseInt(scn.nextLine());

        System.out.println("Digite segundo número");
        int number2 = Integer.parseInt(scn.nextLine());

        return new DadosDTO(operacao, number1, number2);
    }

    private static void calcular(OperacaoEnum operacao, int number1, int number2) {
        switch (operacao) {
            case SOMAR:
                imprimirValor(somar(number1, number2));
                break;
            case SUBTRAIR:
                imprimirValor(subtrair(number1, number2));
                break;
            case MULTIPLICAR:
                imprimirValor(multiplicar(number1, number2));
                break;
            case DIVIDIR:
                if( number1 == 0 || number2 == 0){
                    imprimirValor(0);
                } else {
                    imprimirValor(dividir(number1, number2));
                }

                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
    }

    private static int dividir(int number1, int number2) {
        return number1 / number2;
    }

    private static int multiplicar(int number1, int number2) {
        return number1 * number2;
    }

    private static int subtrair(int number1, int number2) {
        return number1 - number2;
    }

    private static int somar(int number1, int number2) {
        return number1 + number2;
    }

    private static void imprimirValor(int valor) {
        System.out.println("Valor final: " + valor);
    }
}
