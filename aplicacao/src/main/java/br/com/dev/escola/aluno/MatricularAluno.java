package br.com.dev.escola.aluno;

import br.com.dev.escola.Aluno.Aluno;
import br.com.dev.escola.Aluno.AlunoRepository;

import java.util.List;

public class MatricularAluno {

    private AlunoRepository repositorio;

    public MatricularAluno(AlunoRepository repositorio) {
        this.repositorio = repositorio;
    }

    public void matricular(MatricularAlunoDto dados) {
        Aluno aluno = dados.criarAluno();

        repositorio.matricular(aluno);
    }

    public List<Aluno> buscarAlunosMatricular() {
         return repositorio.buscarTodos();
    }
}
