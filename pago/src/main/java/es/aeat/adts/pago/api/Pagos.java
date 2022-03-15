package es.aeat.adts.pago.api;

import java.util.List;

import es.aeat.adts.persona.PersonaAdapter;

public class Pagos {

	private Pagos() {
		// Hides implicit public constructor
	}
	
	public static List<Pago> withMinImporte(/* Dates interval */) {
		throw new IllegalStateException();
	}
	
	public static List<Pago> withMaxImporte() {
		throw new IllegalStateException();
	}
	
	public static class Persona extends PersonaAdapter {
	
		public List<Pago> getPagos() {
			throw new IllegalStateException();
		}
		
	}
	
}
