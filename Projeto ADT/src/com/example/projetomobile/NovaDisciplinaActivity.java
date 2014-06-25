package com.example.projetomobile;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NovaDisciplinaActivity extends Activity {

	
	TextView tvPesquisar;
	EditText etPesquisar;
	Button btAddDisciplina;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_nova_disciplina);

		tvPesquisar = (TextView) findViewById(R.id.textViewPesquisar);
		etPesquisar = (EditText) findViewById(R.id.editTextPesquisar);
		btAddDisciplina = (Button) findViewById(R.id.buttonAddDisciplina);
		
		
		
	}

	

}
