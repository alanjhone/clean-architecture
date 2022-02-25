package br.com.dev.escola.aluno;

import br.com.dev.escola.Aluno.Aluno;

public class MatricularAlunoDto {

    String nome;
    String cpf;
    String email;

    public MatricularAlunoDto(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public Aluno criarAluno() {
        return new Aluno(cpf, nome, email);
    }
}
