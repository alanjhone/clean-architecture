package br.com.dev.escola.indicacao;

import br.com.dev.escola.Aluno.Aluno;

public class EnviarEmailIndicacaoService implements EnviarEmailIndicacao {

    @Override
    public void enviarPara(Aluno indicado) {
        System.out.println(String.format("E-mail enviado para %s", indicado.getNome()));
    }

}
