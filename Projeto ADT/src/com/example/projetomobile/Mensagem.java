package com.example.projetomobile;

import java.util.Calendar;
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
	String data;
	
	boolean foiLida;
	String assunto;
	

	public Mensagem(){
		
	}

	public Mensagem(String remetente, String assunto, String texto) {
		super();
		Calendar c = Calendar.getInstance();
		this.remetente = remetente;
		this.texto = texto;
		this.assunto = assunto;
		this.foiLida = false;
		this.data = c.get(Calendar.DAY_OF_MONTH)+"/"+c.get(Calendar.MONTH);
	}

	

	@Override
	public String toString() {
		return "Mensagem [id=" + id + ", remetente=" + remetente + ", texto="
				+ texto + ", data=" + data + ", foiLida=" + foiLida
				+ ", assunto=" + assunto + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRemetente() {
		return remetente;
	}

	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public boolean isFoiLida() {
		return foiLida;
	}

	public void setFoiLida(boolean foiLida) {
		this.foiLida = foiLida;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	
	

}
