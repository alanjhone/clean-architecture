package br.com.dev.escola.aluno;

import br.com.dev.escola.Aluno.Aluno;
import br.com.dev.escola.Aluno.AlunoRepository;

import java.util.ArrayList;
import java.util.List;

public class AlunoRepositoryEmMemoria implements AlunoRepository {

    List<Aluno> matriculados = new ArrayList<>();

    @Override
    public void matricular(Aluno aluno) {
        matriculados.add(aluno);
    }

    @Override
    public void excluir(Aluno aluno) {

    }

    @Override
    public List<Aluno> buscarTodos() {
        return matriculados;
    }

    @Override
    public Aluno buscarPorCPF(String cpf) throws Exception {
        return matriculados.stream().filter( aluno -> aluno.getCpf().equals(cpf))
                .findFirst()
                .orElseThrow(() -> new Exception("Aluno não encontrado"));
    }
}
