package aula04;

public enum OperacaoEnum {

    SOMAR("+"),
    SUBTRAIR("-"),
    MULTIPLICAR("*"),
    DIVIDIR("/");

    private String sinal;

    OperacaoEnum(String sinal) {
        this.sinal = sinal;
    }

    public String getSinal() {
        return sinal;
    }

    public static OperacaoEnum funcaoSinal(String simbolo) {
        for (OperacaoEnum operacao : OperacaoEnum.values()) {
            if (operacao.getSinal().equals(simbolo)) {
                return operacao;
            }
        }
        throw new IllegalArgumentException("Símbolo inválido: " + simbolo);
    }
}
