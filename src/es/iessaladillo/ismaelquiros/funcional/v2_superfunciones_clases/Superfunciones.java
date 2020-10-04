package es.iessaladillo.ismaelquiros.funcional.v2_superfunciones_clases;

import java.util.ArrayList;
import java.util.List;

import es.iessaladillo.ismaelquiros.funcional.v2_superfunciones_clases.interfaces.Predicado;

public class Superfunciones {

	public static List<Integer> filtrar(List<Integer> valores, Predicado predicado){
		List<Integer> resultado = new ArrayList<Integer>();
		for(Integer valor : valores) {
			if(predicado.test(valor)) {
				resultado.add(valor);
			}
		}
		return resultado;
	}
	
}
