package com.example.projetomobile;

import java.util.List;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.j256.ormlite.android.apptools.OrmLiteBaseActivity;
import com.j256.ormlite.dao.RuntimeExceptionDao;

public class LoginActivity extends OrmLiteBaseActivity<DatabaseHelper> implements OnClickListener{
	
	
	Button btnOK;
	TextView txLogin;
	TextView txSenha;
	EditText etLogin;
	EditText etSenha;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		
		txLogin = (TextView) findViewById(R.id.textViewLogin);
		etLogin = (EditText) findViewById(R.id.editTextLogin);
		txSenha = (TextView) findViewById(R.id.textViewSenha);
		etSenha = (EditText) findViewById(R.id.editTextSenha);
		btnOK = (Button) findViewById(R.id.buttonOK);
		
		etLogin.setText("user1");
		etSenha.setText("1234");

		btnOK.setOnClickListener(this);
	}

	
	
	public boolean verificaLogin(){
		boolean cadastrado = false;
		RuntimeExceptionDao<Usuario, Integer> usrDao = getHelper().getUsuarioRuntimeExceptionDao();
		usrDao.create(new Usuario("user1", "1234"));
		List<Usuario> usrs = usrDao.queryForAll();
	
		//Log.d("demo", usrs.toString());
		
		for(Usuario u : usrs){
			//Log.d("demo", u.login);
			//Log.d("demo", etLogin.getText().toString());
			if(u.login.equals(etLogin.getText().toString()) && u.senha.equals(etSenha.getText().toString())){
				cadastrado = true;
			}
				
			
		}
		
		return cadastrado;
		
	}


	@Override
	public void onClick(View arg0) {
		if(verificaLogin()){
			//entra na proxima activity
			Intent intent = new Intent(this, PrincipalActivity.class);
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "Acesse 'Configurações' e 'Add Disciplina' no menu da barra de título.", Toast.LENGTH_SHORT).show();
		}else{
			Toast.makeText(getApplicationContext(), "Você não está cadastrado.", Toast.LENGTH_SHORT).show();
		}
		
	}

	

}
