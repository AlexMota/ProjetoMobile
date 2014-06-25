package com.example.projetomobile.adapter;

import java.util.ArrayList;

import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.projetomobile.Mensagem;
import com.example.projetomobile.MensagemSelecionadaActivity;
public class GeralFragment extends ListFragment {
	
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
		 
		 ArrayList<Mensagem> mensagens = new ArrayList<Mensagem>();
		 
		 mensagens.add(new Mensagem("reitoria", "nova media", "texto"));
		 mensagens.add(new Mensagem("biblioteca", "devolução", "texto"));
		 mensagens.add(new Mensagem("mensagem geral1", "assunto1", "texto"));
		 mensagens.add(new Mensagem("mensagem geral2", "nova media2", "texto"));
		 mensagens.add(new Mensagem("mesnagem geral3", "nova media3", "texto"));
		 
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
