package aula02;

import javax.naming.AuthenticationException;

public class RegistroNascimento {

    public static void main(String[] args) {

        PessoaFisica pessoaFisica01 = new PessoaFisica("João","123.456.789-01",0,"casado");

        System.out.println(pessoaFisica01);

    }

}
