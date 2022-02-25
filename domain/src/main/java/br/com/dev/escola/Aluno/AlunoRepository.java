package br.com.dev.escola.Aluno;

import java.util.List;

public interface AlunoRepository {

    void matricular(Aluno aluno);
    void excluir(Aluno aluno);
    List<Aluno> buscarTodos();
    Aluno buscarPorCPF(String cpf) throws Exception;

}
