package com.nttdata.formacion.streams.ejercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EjerciciosStreams {
	
	public static List<Persona> obtenerPersonas(List<Persona> listaPersonas) {
		//Obtener todas las personas
		return new ArrayList<>(listaPersonas);
	}
	
	public static Persona obtenerPersonaMasJoven(List<Persona> listaPersonas) {
		//Obtener la persona mas joven
		return listaPersonas.stream()
				.min(Comparator.comparingInt(Persona::getEdad)).orElse(null);
	}
	
	public static double obtenerMediaDeEdad(List<Persona> listaPersonas) {
		//Obtener la media de edad
		return listaPersonas.stream().mapToInt(Persona::getEdad).average().orElse(0);
	}
	
	public static List<Persona> obtenerPersonasMayoresDe30(List<Persona> listaPersonas) {
		//Obtener la media de edad
		return listaPersonas.stream()
				.filter(persona -> persona.getEdad()>30)
				.collect(Collectors.toList());
	}
	
	public static List<Persona> obtenerMujeresDeMasDe180(List<Persona> listaPersonas) {
		//Obtener todas las personas que sean mujeres con una altura mayor de 1.80 metros
		return listaPersonas.stream()
				.filter(persona -> persona.getGenero().equals("Mujer") && persona.getAltura() > 1.80f)
				.collect(Collectors.toList());
	}
	
	public static List<String> obtenerDistintasProfesiones(List<Persona> listaPersonas) {
		//Obtener la lista de las distintas profesiones entre todas las personas
		return listaPersonas.stream()
				.map(Persona::getProfesion)
				.distinct()
				.collect(Collectors.toList());
	}
	
	public static String obtenerNombrePersonasConComas(List<Persona> listaPersonas) {
		//Obtener la lista de nombres de todas las personas separados por comas

		return listaPersonas.stream()
				.map(Persona::getNombre)
				.collect(Collectors.joining(", "));
	}

	public static Persona obtenerCientificoMasViejo(List<Persona> listaPersonas) {
		//Obtener el Cientifico mas viejo
		return listaPersonas.stream()
				.filter(persona -> persona.getProfesion().equals("Cientifico"))
				.max(Comparator.comparingInt(Persona::getEdad))
				.orElse(null);
	}
	
	public static List<Persona> subirSueldoPersonasMayores40(List<Persona> listaPersonas) {
		//Subir a 2500 el sueldo de las personas mayores de 40 años
		return listaPersonas.stream()
				.filter(persona -> persona.getEdad() > 40)
				.map(persona -> {
					persona.setSueldo(2500);
					return persona;
				})
				.collect(Collectors.toList());
	}
}
