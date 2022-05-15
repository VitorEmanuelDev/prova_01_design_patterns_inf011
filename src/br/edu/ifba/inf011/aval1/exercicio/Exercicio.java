package br.edu.ifba.inf011.aval1.exercicio;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import br.edu.ifba.inf011.aval1.equipamento.Equipamento;
import br.edu.ifba.inf011.aval1.equipamento.EquipamentoEnum;

public final class Exercicio {
	
	private String nome;
	private String grupoMuscular;
	private ExercicioEnum tipoExercicio;
	private Equipamento equipamento;
	
	/*List<String> gruposMuscularesList = Stream.of(GruposMuscularesEnum.values())
			.map(GruposMuscularesEnum::name)
			.collect(Collectors.toList());

	List<ExercicioEnum> tiposExerciciosList = Arrays.asList(ExercicioEnum.values()); */

	public Exercicio(Builder builder) {
		this.nome = builder.getNome();
		this.grupoMuscular = builder.getGrupoMuscular();
		this.tipoExercicio = builder.getTipoExercicio();
		this.equipamento = builder.getEquipamento();
	}

	public String getNome() {
		return nome;
	}

	public String getGrupoMuscular() {
		return grupoMuscular;
	}


	public ExercicioEnum getTipoExercicio() {
		return tipoExercicio;
	}


	public Equipamento getEquipamento() {
		return equipamento;
	}


}