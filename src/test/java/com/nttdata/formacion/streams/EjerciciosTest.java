package com.nttdata.formacion.streams;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.nttdata.formacion.streams.ejercicios.EjerciciosStreams;
import com.nttdata.formacion.streams.ejercicios.Persona;

public class EjerciciosTest {
	
	private List<Persona> listaPersonas;
	
	@Before
	public void setUp() {
		listaPersonas = new ArrayList<>();
		listaPersonas.add(new Persona(20, "Hugo", "Hombre", 1.70f, "Arquitecto", 1500));
		listaPersonas.add(new Persona(31, "Julia", "Mujer", 1.74f, "Programador", 1500));
		listaPersonas.add(new Persona(24, "Lucas", "Hombre", 1.65f, "Arquitecto", 1500));
		listaPersonas.add(new Persona(35, "Martina", "Mujer", 1.72f, "Dise�ador", 1500));
		listaPersonas.add(new Persona(32, "Mateo", "Hombre", 1.86f, "Cientifico", 1500));
		listaPersonas.add(new Persona(28, "Leo", "Hombre", 1.90f, "Arquitecto", 1500));
		listaPersonas.add(new Persona(40, "Paula", "Mujer", 1.73f, "Dise�ador", 1500));
		listaPersonas.add(new Persona(27, "Daniel", "Hombre", 1.92f, "Arquitecto", 1500));
		listaPersonas.add(new Persona(42, "Emma", "Mujer", 1.68f, "Dise�ador", 1500));
		listaPersonas.add(new Persona(23, "Alba", "Mujer", 1.73f, "Cientifico", 1500));
		listaPersonas.add(new Persona(31, "Alejandro", "Hombre", 1.79f, "Programador", 1500));
		listaPersonas.add(new Persona(38, "Sara", "Mujer", 1.82f, "Arquitecto", 1500));
		listaPersonas.add(new Persona(31, "Pablo", "Hombre", 1.72f, "Cientifico", 1500));
		listaPersonas.add(new Persona(36, "Diego", "Hombre", 1.78f, "Arquitecto", 1500));
		listaPersonas.add(new Persona(40, "Claudia", "Mujer", 1.67f, "Programador", 1500));
	}
	
	
	/**
	 * Obtener todas las personas
	 */
	@Test
	public void Ejercicio1() {
		assertEquals(listaPersonas, EjerciciosStreams.obtenerPersonas(listaPersonas));
	}
	
	/**
	 * Obtener la persona mas joven
	 */
	@Test
	public void Ejercicio2() {
		assertEquals(listaPersonas.get(0), EjerciciosStreams.obtenerPersonaMasJoven(listaPersonas));
	}
	
	/**
	 * ImpObtenerrimir la media de edad
	 */
	@Test
	public void Ejercicio3() {
		assertEquals(31.8, EjerciciosStreams.obtenerMediaDeEdad(listaPersonas), 0.1);
	}
	
	/**
	 * Obtener todas las personas mayores de 30 a�os
	 */
	@Test
	public void Ejercicio4() {
		List<Persona> listaResultado = new ArrayList<>();
		listaResultado.add(listaPersonas.get(1));
		listaResultado.add(listaPersonas.get(3));
		listaResultado.add(listaPersonas.get(4));
		listaResultado.add(listaPersonas.get(6));
		listaResultado.add(listaPersonas.get(8));
		listaResultado.add(listaPersonas.get(10));
		listaResultado.add(listaPersonas.get(11));
		listaResultado.add(listaPersonas.get(12));
		listaResultado.add(listaPersonas.get(13));
		listaResultado.add(listaPersonas.get(14));
		
		assertArrayEquals(listaResultado.toArray(), EjerciciosStreams.obtenerPersonasMayoresDe30(listaPersonas).toArray());
	}
	
	/**
	 * Obtener todas las personas que sean mujeres con una altura mayor de 1.80 metros
	 */
	@Test
	public void Ejercicio5() {
		List<Persona> listaResultado = new ArrayList<>();
		listaResultado.add(listaPersonas.get(11));
		
		assertArrayEquals(listaResultado.toArray(), EjerciciosStreams.obtenerMujeresDeMasDe180(listaPersonas).toArray());
	}
	
	/**
	 * Obtener la lista de las distintas profesiones entre todas las personas
	 */
	@Test
	public void Ejercicio6() {
		List<String> listaResultado = new ArrayList<>();
		listaResultado.add("Arquitecto");
		listaResultado.add("Programador");
		listaResultado.add("Dise�ador");
		listaResultado.add("Cientifico");
		
		assertArrayEquals(listaResultado.toArray(), EjerciciosStreams.obtenerDistintasProfesiones(listaPersonas).toArray());
	}
	
	/**
	 * Obtener la lista de nombres de todas las personas separados por comas
	 */
	@Test
	public void Ejercicio7() {
		String resultado = "Hugo, Julia, Lucas, Martina, Mateo, Leo, Paula, Daniel, Emma, Alba, Alejandro, Sara, Pablo, Diego, Claudia";
		
		assertEquals(resultado, EjerciciosStreams.obtenerNombrePersonasConComas(listaPersonas));

	}
	
	/**
	 * Obtener el Cientifico mas viejo
	 */
	@Test
	public void Ejercicio8() {
		assertEquals(listaPersonas.get(4), EjerciciosStreams.obtenerCientificoMasViejo(listaPersonas));
	}
	
	
	/**
	 * Subir a 2500 el sueldo de las personas mayores de 40 a�os
	 */
	@Test
	public void Ejercicio9() {
		List<Persona> listaResultado = new ArrayList<>();
		listaResultado.add(new Persona(42, "Emma", "Mujer", 1.68f, "Dise�ador", 2500));
		
		assertArrayEquals(listaResultado.toArray(), EjerciciosStreams.subirSueldoPersonasMayores40(listaPersonas).toArray());

	}
}
