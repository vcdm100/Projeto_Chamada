package com.aula17.chamada.turma;

public record DadosListagemTurma(String id, String modulo) {
	public DadosListagemTurma(Turma turma) {
		this(turma.getId(), turma.getModulo());
	}
}
