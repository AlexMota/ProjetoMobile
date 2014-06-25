package com.example.projetomobile.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.projetomobile.Mensagem;
import com.example.projetomobile.R;

public class MensagemAdapter extends BaseAdapter{

	private Context context;
	private List<Mensagem> mensagens;
	
	
	public MensagemAdapter(Context context, List<Mensagem> mensagens) {
		
		this.context = context;
		this.mensagens = mensagens;
		
	}

	@Override
	public int getCount() {
		return mensagens.size();
	}

	@Override
	public Object getItem(int pos) {
		// TODO Auto-generated method stub
		return mensagens.get(pos);
	}

	@Override
	public long getItemId(int pos) {
		// TODO Auto-generated method stub
		return mensagens.get(pos).getId();
	}

	@Override
	public View getView(int pos, View convertView, ViewGroup parent) {
		
		Mensagem m = mensagens.get(pos);
		
		View v = LayoutInflater.from(context).inflate(R.layout.linha, null);
		
		TextView tvFrom = (TextView) v.findViewById(R.id.from);  
		TextView tvSubject = (TextView) v.findViewById(R.id.subject);
		TextView tvDate = (TextView) v.findViewById(R.id.date);
		  
		tvFrom.setText(m.getRemetente());  
		tvSubject.setText(m.getAssunto());
		tvDate.setText(m.getData());
		  
		return v; 
		
		
		
		
	}

}
