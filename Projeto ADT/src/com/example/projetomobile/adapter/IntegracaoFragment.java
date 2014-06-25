package com.example.projetomobile.adapter;

import java.util.ArrayList;

import com.example.projetomobile.Mensagem;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class IntegracaoFragment extends ListFragment{
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
	 
	 ArrayList<Mensagem> mensagens = new ArrayList<Mensagem>();
	 
	 mensagens.add(new Mensagem("Integra��o1", "assunto1", "texto1"));
	 mensagens.add(new Mensagem("Integra��o2", "assunto2", "texto2"));
	 mensagens.add(new Mensagem("Integra��o3", "assunto3", "texto3"));
	 mensagens.add(new Mensagem("Integra��o4", "assunto4", "texto4"));
	 mensagens.add(new Mensagem("Integra��o5", "assunto5", "texto5"));
	 mensagens.add(new Mensagem("Integra��o6", "assunto6", "texto6"));
	 mensagens.add(new Mensagem("Integra��o7", "assunto7", "texto7"));
	 mensagens.add(new Mensagem("Integra��o8", "assunto8", "texto8"));
	 mensagens.add(new Mensagem("Integra��o9", "assunto9", "texto9"));
	 
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

}
