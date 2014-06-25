package com.example.projetomobile;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.os.Build;

public class ConfiguracoesActivity extends Activity implements View.OnClickListener{

	TextView tvConfig;
	CheckBox cbWeb;
	CheckBox cbMobile;
	CheckBox cbIntegracao;
	CheckBox cbPersistencia;
	CheckBox cbConcorrencia;
	Button btAplicar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_configuracoes);
		
		tvConfig = (TextView) findViewById(R.id.textViewConfig);
		cbWeb = (CheckBox) findViewById(R.id.checkBoxWeb);
		cbMobile = (CheckBox) findViewById(R.id.checkBoxMobile);
		cbIntegracao = (CheckBox) findViewById(R.id.checkBoxIntegracao);
		cbPersistencia = (CheckBox) findViewById(R.id.checkBoxPersistencia);
		cbConcorrencia = (CheckBox) findViewById(R.id.checkBoxConcorrencia);
		
		btAplicar = (Button) findViewById(R.id.buttonAplicarConfig);
		btAplicar.setOnClickListener(this);

		
	}
	
	
	public void chamaActivityLogin(){
		
		
		
    	Intent intent = new Intent(this, PrincipalActivity.class);
    	startActivity(intent);
    }
	

	public void onClick(View v) {
		
		switch(v.getId()){
		
		case R.id.buttonAplicarConfig:
			
			chamaActivityLogin();
			break;
		}
		
	}
	
	
	

	

	

}
