package br.com.dev.escola.indicacao;

import br.com.dev.escola.aluno.Aluno;

import java.time.LocalDateTime;

public class Indicacao {

    private Aluno indicado;
    private Aluno indicante;
    private LocalDateTime dataIndicacao;

    public Indicacao(Aluno indicado, Aluno indicante, LocalDateTime dataIndicacao) {
        this.indicado = indicado;
        this.indicante = indicante;
        this.dataIndicacao = dataIndicacao;
    }
}
