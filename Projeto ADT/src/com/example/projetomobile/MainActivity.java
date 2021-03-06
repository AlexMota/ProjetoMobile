package com.example.projetomobile;

import java.util.List;



import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import com.j256.ormlite.android.apptools.OrmLiteBaseActivity;
import com.j256.ormlite.dao.RuntimeExceptionDao;

public class MainActivity extends OrmLiteBaseActivity<DatabaseHelper> implements View.OnClickListener{
	
	DatabaseHelper dbhelper;
	Button btActivityLogin, btActivityEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btActivityLogin = (Button) findViewById(R.id.buttonActivityLogin);
        btActivityEntrar = (Button) findViewById(R.id.buttonActivityEntrar);
        btActivityLogin.setOnClickListener(this);
        btActivityEntrar.setOnClickListener(this);
			
			
        //doDataStuff();
    }
    
    
    /*
    private void doDataStuff(){
    	
    	
    	RuntimeExceptionDao<Mensagem, Integer> msgDao = getHelper().getMensagemRuntimeExceptionDao();
    	RuntimeExceptionDao<Usuario, Integer> usrDao = getHelper().getUsuarioRuntimeExceptionDao();
    	
    	//cria objeto
    	msgDao.create(new Mensagem("reitoria", "texto da mensagem da reitoria"));
    	msgDao.create(new Mensagem("biblioteca", "texto da mensagem da biblioteca"));
    	msgDao.create(new Mensagem("mobile", "texto da mensagem de mobile"));
    	
    	usrDao.create(new Usuario("usr1", "1234"));
    	
    	//busca
    	List<Mensagem> msgs = msgDao.queryForAll();
    	List<Usuario> usrs = usrDao.queryForAll();
    	Log.d("demo", msgs.toString());
    	Log.d("demo", usrs.toString());
    	
    	msgs = msgDao.queryForEq("remetente", "reitoria");
    	Log.d("demo", msgs.toString());
    	
    }

*/
    

    
    public void chamaActivityLogin(){
    	Intent intent = new Intent(this, LoginActivity.class);
    	startActivity(intent);
    }
    
    public void chamaActivityEntrar(){
    	
    	Intent intent = new Intent(this, EntrarActivity.class);
    	startActivity(intent);
    	
    }
	

	@Override
	public void onClick(View v) {
		
		switch(v.getId()){
		
		case R.id.buttonActivityLogin:
			
			chamaActivityLogin();
			
			break;
		
		case R.id.buttonActivityEntrar:
			chamaActivityEntrar();
			
			break;
		}
		
	}

    

    
    

}
