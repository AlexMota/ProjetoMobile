package com.example.projetomobile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MensagemSelecionadaActivity extends Activity {

	boolean lida;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mensagem_selecionada);

		TextView txtRemetente = (TextView) findViewById(R.id.fromMensSel);
		TextView txtAssunto = (TextView) findViewById(R.id.subjectMensSel);
		TextView txtDate = (TextView) findViewById(R.id.dateMensSel);
		TextView txtMessageText = (TextView) findViewById(R.id.message_textMensSel);
        
        Intent i = getIntent();
        
        String remetente = i.getStringExtra("remetente");
        String data = i.getStringExtra("data");
        String assunto = i.getStringExtra("assunto");
        String mensagem = i.getStringExtra("mensagem");
        lida = i.getBooleanExtra("lida", true);
        
        
        txtRemetente.setText(remetente);
        txtAssunto.setText(assunto);
        txtDate.setText(data);
        txtMessageText.setText(mensagem);
		
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mensagem_selecionada, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.mensLida) {
			lida = false;
			
			
		}
		return super.onOptionsItemSelected(item);
	}

	

}
