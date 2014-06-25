package com.example.projetomobile.adapter;

import java.util.ArrayList;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.projetomobile.Mensagem;

public class WebFragment extends ListFragment{
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
	 
	 ArrayList<Mensagem> mensagens = new ArrayList<Mensagem>();
	 
	 mensagens.add(new Mensagem("Web1", "assunto1", "texto1"));
	 mensagens.add(new Mensagem("Web2", "assunto2", "texto2"));
	 mensagens.add(new Mensagem("Web3", "assunto3", "texto3"));
	 mensagens.add(new Mensagem("Web4", "assunto4", "texto4"));
	 mensagens.add(new Mensagem("Web5", "assunto5", "texto5"));
	 mensagens.add(new Mensagem("Web6", "assunto6", "texto6"));
	 mensagens.add(new Mensagem("Web7", "assunto7", "texto7"));
	 mensagens.add(new Mensagem("Web8", "assunto8", "texto8"));
	 mensagens.add(new Mensagem("Web9", "assunto9", "texto9"));
	 
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
