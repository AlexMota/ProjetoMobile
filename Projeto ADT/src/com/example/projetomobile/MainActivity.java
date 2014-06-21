package com.example.projetomobile;

import java.util.List;


import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.android.apptools.OrmLiteBaseActivity;
import com.j256.ormlite.dao.RuntimeExceptionDao;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class MainActivity extends OrmLiteBaseActivity<DatabaseHelper> {
	
	DatabaseHelper dbhelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        doDataStuff();
    }
    
    private void doDataStuff(){
    	
    	
    	RuntimeExceptionDao<Mensagem, Integer> msgDao = getHelper().getMensagemRuntimeExceptionDao();
    	
    	//cria objeto
    	msgDao.create(new Mensagem("reitoria", "texto da mensagem da reitoria"));
    	msgDao.create(new Mensagem("biblioteca", "texto da mensagem da biblioteca"));
    	msgDao.create(new Mensagem("mobile", "texto da mensagem de mobile"));
    	
    	//busca
    	List<Mensagem> msgs = msgDao.queryForAll();
    	Log.d("demo", msgs.toString());
    	
    	msgs = msgDao.queryForEq("remetente", "reitoria");
    	Log.d("demo", msgs.toString());
    	
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    

    
    

}
