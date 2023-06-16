package pe.edu.idat.dsw1soapJ19;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Semana;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class CountryRepository {
    private static final Map<String, Semana> semana = new HashMap<>();

	@PostConstruct
	public void initData() {
		Semana lunes = new Semana();
		lunes.setName("Lunes");
	
		lunes.setIngles("Monday");
		semana.put(lunes.getName(), lunes);

		Semana martes = new Semana();
		martes.setName("Martes");

		martes.setIngles("Tuesday");
		semana.put(martes.getName(), martes);

		
		Semana miercoles = new Semana();
		miercoles.setName("Miercoles");

		miercoles.setIngles("Wednesday");
		semana.put(miercoles.getName(), miercoles);

		Semana jueves = new Semana();
		jueves.setName("Jueves");

		jueves.setIngles("Thursday");
		semana.put(jueves.getName(), jueves);

		Semana viernes = new Semana();
		viernes.setName("Viernes");

		viernes.setIngles("Friday");
		semana.put(viernes.getName(), viernes);

		Semana sabad = new Semana();
		sabad.setName("Sabado");
	
		sabad.setIngles("Saturday");
		semana.put(sabad.getName(), sabad);

		Semana domingo = new Semana();
		domingo.setName("Domingo");
	
		domingo.setIngles("Sunday");
		semana.put(domingo.getName(), domingo);


		
	}

	public Semana findSemana(String name) {
		Assert.notNull(name, "Nombre de semana");
		return semana.get(name);
	}
    
}
