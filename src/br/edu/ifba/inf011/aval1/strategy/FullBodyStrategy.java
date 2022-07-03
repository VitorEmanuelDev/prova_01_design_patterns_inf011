package br.edu.ifba.inf011.aval1.strategy;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.inf011.aval1.programa.ProgramaEnum;
import br.edu.ifba.inf011.aval1.programa.Serie;

public class FullBodyStrategy implements ProgramaStrategy{

	@Override
	public List<Serie> executarListaSeriesDoDia(List<Serie> listaSeries) {
		LocalDateTime now = LocalDateTime.now();
		DayOfWeek day = now.getDayOfWeek();
		List<Serie> listaSeriesDia = new ArrayList<>();

		if(day.equals(DayOfWeek.MONDAY) || day.equals(DayOfWeek.WEDNESDAY) || day.equals(DayOfWeek.FRIDAY)){
			listaSeries.forEach(serie -> {
				listaSeriesDia.add(serie);
			});
		}
		return listaSeriesDia;
	}
}
