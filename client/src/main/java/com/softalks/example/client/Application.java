package com.softalks.example.client;

import java.util.List;

import es.aeat.adts.pago.api.Pago;
import es.aeat.adts.pago.api.Pago.Pagador;
import es.aeat.adts.pago.api.Pago.Receptor;
import es.aeat.adts.persona.Persona;

public class Application {
	public static void main(String[] args) {
		Persona persona = Persona.byNif("33328560L");
		Receptor receptor = persona.adapt(Receptor.class);
	}
}