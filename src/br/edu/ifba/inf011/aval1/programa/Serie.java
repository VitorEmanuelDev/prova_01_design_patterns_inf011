package br.edu.ifba.inf011.aval1.programa;

import br.edu.ifba.inf011.aval1.exercicio.ExercicioBase;
import br.edu.ifba.inf011.aval1.exercicio.Video;
import br.edu.ifba.inf011.aval1.exercicio.VideoFlyweightFactory;

public class Serie {

	private ExercicioBase exercicioBase;
	private int numeroRepeticoes;
	private int quantidade;
	boolean realizada;
	private Video video;
	private VideoFlyweightFactory factory;

	public Serie() {}

	public Serie(int numRepeticoes, int quantidade, ExercicioBase exercicioBase, VideoFlyweightFactory factory) {
		this.numeroRepeticoes = numRepeticoes;
		this.quantidade = quantidade;
		this.exercicioBase = exercicioBase;
		this.factory = factory;
	}

	public int getNumeroRepeticoes() {
		return numeroRepeticoes;
	}
	public void setNumeroRepeticoes(int numeroRepeticoes) {
		this.numeroRepeticoes = numeroRepeticoes;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public ExercicioBase getExercicio() {
		return exercicioBase;
	}
	public void setExercicio(ExercicioBase exercicioBase) {
		this.exercicioBase = exercicioBase;
	}

	public boolean isRealizada() {
		return realizada;
	}

	public void setRealizada() {
		this.realizada = true;
	}

	public void executar() {
		System.out.println("EXERCICIO: " + this.getExercicio().getNome());
		System.out.println("REPETICOES: " + this.getNumeroRepeticoes());
		System.out.println("SERIES: " + this.getQuantidade());
		System.out.println("\n");
		this.getExercicio().getTiposExercicios().forEach(tipo -> {
			try {
				video = factory.getVideo(tipo);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(video.getDescricao());

		});

	}

}
