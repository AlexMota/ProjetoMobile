package com.example.projetomobile;

import java.util.Date;

import com.j256.ormlite.field.DatabaseField;

public class Mensagem {
	
	@DatabaseField(generatedId = true)
	int id;
	
	@DatabaseField
	String remetente;
	
	@DatabaseField
	String texto;
	
	@DatabaseField
	Date data;

	public Mensagem(String remetente, String texto) {
		super();
		this.remetente = remetente;
		this.texto = texto;
		this.data = new Date(System.currentTimeMillis());
	}

	@Override
	public String toString() {
		return "Mensagem [id=" + id + ", remetente=" + remetente + ", texto="
				+ texto + ", data=" + data + "]";
	}
	
	
	
	

}
