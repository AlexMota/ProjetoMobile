package com.example.projetomobile;

import com.j256.ormlite.field.DatabaseField;

public class Usuario {
	
	
	@DatabaseField(generatedId = true)
	int id;
	
	@DatabaseField
	String login;
	
	@DatabaseField
	String senha;
	
	
	public Usuario(){
		
	}

	public Usuario(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", login=" + login + ", senha=" + senha
				+ "]";
	}
	
	

}
