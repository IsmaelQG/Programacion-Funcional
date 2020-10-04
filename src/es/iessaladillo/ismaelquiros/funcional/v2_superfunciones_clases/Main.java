package es.iessaladillo.ismaelquiros.funcional.v2_superfunciones_clases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.iessaladillo.ismaelquiros.funcional.v2_superfunciones_clases.clases.SoloPares;

public class Main {

	public static void main(String[] args) {

		new Main();
		
	}
	
	public Main() {
		//1.CREAR NÚMEROS ENTEROS
		List<Integer>numeros = crearLista();
		System.out.println(numeros);
		//2.QUEDARME CON PARES
		List<Integer>pares = Superfunciones.filtrar(numeros, new SoloPares());
		System.out.println(pares);
		//3.PASAR CADA NÚMERO AL CUADRADO
		List<Integer> cuadrados = elevarAlCuadrado(pares);
		System.out.println(cuadrados);
		//4.MOSTRAR CADA CUADRADO POR PANTALLA
		List<Integer> mostrados = mostrarLista(cuadrados);
		//5.OBTENER LA SUMA DE LOS CUADRADOS
		int total = sumarLista(mostrados);
		System.out.println("Suma de cuadrados: "+total);
	}
	
	private List<Integer> crearLista(){
		//return Arrays.asList(0,1,2,3,5,8,13,21,34,55,89,144);
		return List.of(0,1,2,3,5,8,13,21,34,55,89,144);
	}

	private List<Integer> filtrarPares(List<Integer> numeros){
		List<Integer> resultado = new ArrayList<>();
		//Se recorre la lista y se agrega a la lista resultado solo
		//los numeros de la lista que sean pares
		for(Integer numero : numeros) {
			if(numero % 2 == 0){
				resultado.add(numero);
			}
		}
		return resultado;
	}
	
	private List<Integer> elevarAlCuadrado(List<Integer> numeros) {
		List<Integer> resultado = new ArrayList<>();
		//Se recorre la lista y se agrega a la lista resultado
		//el cuadrado de los números originales
		for(Integer numero : numeros) {
			resultado.add(numero*numero);
		}
		return resultado;
	}
	
	private List<Integer> mostrarLista(List<Integer> numeros) {
		for(Integer numero : numeros) {
			System.out.println(numero);
		}
		return numeros;
	}
	
	private int sumarLista(List<Integer> numeros) {
		int total = 0;
		for(Integer numero : numeros) {
			total+=numero;
		}
		return total;
	}
	
}
