package aula02;

public class PessoaFisica {

    private String nome;
    private String cpf;
    private Integer age;
    private String estadoCivil;

    public PessoaFisica(String nome, String cpf, Integer age, String estadoCivil) {
        this.nome = nome;
        this.cpf = cpf;
        this.age = age;
        this.estadoCivil = estadoCivil;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return  "Nome = " + nome + '\n' +
                "Cpf = " + cpf + '\n' +
                "Age = " + age + '\n' +
                "Estado Civil = " + estadoCivil;
    }
}

// deve ser ativo
// ativo == true &&