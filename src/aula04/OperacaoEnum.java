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

    public static OperacaoEnum funcaoSinal(String sinalRecebido) {
        for (OperacaoEnum operacao : OperacaoEnum.values()) {
            if (operacao.getSinal().equals(sinalRecebido)) {
                return operacao;
            }
        }
        throw new IllegalArgumentException("Símbolo inválido: " + sinalRecebido);
    }
}
