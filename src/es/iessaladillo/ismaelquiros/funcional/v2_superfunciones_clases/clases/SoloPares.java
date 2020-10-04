package es.iessaladillo.ismaelquiros.funcional.v2_superfunciones_clases.clases;

import es.iessaladillo.ismaelquiros.funcional.v2_superfunciones_clases.interfaces.Predicado;

public class SoloPares implements Predicado{

	@Override
	public boolean test(Integer valor) {
		return valor % 2 == 0;
	}

}
