package com.example.projetomobile.adapter;

import java.util.ArrayList;

import com.example.projetomobile.Mensagem;
import com.example.projetomobile.MensagemSelecionadaActivity;

import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class PersistenciaFragment extends ListFragment{
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
	 
	 ArrayList<Mensagem> mensagens = new ArrayList<Mensagem>();
	 
	 mensagens.add(new Mensagem("Persistencia1", "assunto1", "texto1"));
	 mensagens.add(new Mensagem("Persistencia2", "assunto2", "texto2"));
	 mensagens.add(new Mensagem("Persistencia3", "assunto3", "texto3"));
	 mensagens.add(new Mensagem("Persistencia4", "assunto4", "texto4"));
	 mensagens.add(new Mensagem("Persistencia5", "assunto5", "texto5"));
	 mensagens.add(new Mensagem("Persistencia6", "assunto6", "texto6"));
	 mensagens.add(new Mensagem("Persistencia7", "assunto7", "texto7"));
	 mensagens.add(new Mensagem("Persistencia8", "assunto8", "texto8"));
	 mensagens.add(new Mensagem("Persistencia9", "assunto9", "texto9"));
	 
	 MensagemAdapter adapter = new MensagemAdapter(getActivity().getBaseContext(), mensagens);
	 
        setListAdapter(adapter);
 
        return super.onCreateView(inflater, container, savedInstanceState);
	   
    }
 
 
 @Override
    public void onStart() {
        super.onStart();
 
        /** Setting the multiselect choice mode for the listview */
        getListView().setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
    }
 
 
 public void onListItemClick(ListView l, View v, int position, long id) {
		
		Mensagem m = (Mensagem) l.getItemAtPosition(position);
		Intent i = new Intent(getActivity().getBaseContext(), MensagemSelecionadaActivity.class);
		i.putExtra("remetente", m.getRemetente());
		i.putExtra("assunto", m.getAssunto());
		i.putExtra("mensagem", m.getTexto());
		i.putExtra("data", m.getData());
		i.putExtra("lida", true);
		
		startActivity(i);
	}

}
