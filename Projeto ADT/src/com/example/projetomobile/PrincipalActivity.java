package com.example.projetomobile;



import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

import com.example.projetomobile.adapter.ConcorrenciaFragment;
import com.example.projetomobile.adapter.CustomTabListener;
import com.example.projetomobile.adapter.GeralFragment;
import com.example.projetomobile.adapter.IntegracaoFragment;
import com.example.projetomobile.adapter.MobileFragment;
import com.example.projetomobile.adapter.PersistenciaFragment;
import com.example.projetomobile.adapter.TabsPagerAdapter;
import com.example.projetomobile.adapter.WebFragment;

@SuppressLint("NewApi")
public class PrincipalActivity extends FragmentActivity implements
		ActionBar.TabListener {

	
	private ViewPager viewPager;
    private TabsPagerAdapter mAdapter;
    @SuppressLint("NewApi")
	private ActionBar actionBar;
    // Tab titles
    private String[] tabs = { "Geral", "Mobile", "Web", "Integração", "Persitencia", "Concorrencia" };
 
	
	@SuppressLint("NewApi")
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
 
        actionBar.setDisplayShowTitleEnabled(true);
 
        /** Creating ANDROID Tab */
        Tab tab = actionBar.newTab()
            .setText("Geral")
            .setTabListener(new CustomTabListener<GeralFragment>(this, "geral", GeralFragment.class));
             
        actionBar.addTab(tab);
        
        tab = actionBar.newTab()
        		.setText("Mobile")
        .setTabListener(new CustomTabListener<MobileFragment>(this, "mobile", MobileFragment.class));
        actionBar.addTab(tab);
 
        tab = actionBar.newTab()
        		.setText("Web")
        		.setTabListener(new CustomTabListener<WebFragment>(this, "web", WebFragment.class));
        actionBar.addTab(tab);
 
        tab = actionBar.newTab()
        		.setText("Integração")
        		.setTabListener(new CustomTabListener<IntegracaoFragment>(this, "integração", IntegracaoFragment.class));
        actionBar.addTab(tab);
 
        tab = actionBar.newTab()
        		.setText("Persistência")
        		.setTabListener(new CustomTabListener<PersistenciaFragment>(this, "persistência", PersistenciaFragment.class));
        actionBar.addTab(tab);
 
        tab = actionBar.newTab()
        		.setText("Concorrência")
        		.setTabListener(new CustomTabListener<ConcorrenciaFragment>(this, "concorrência", ConcorrenciaFragment.class));
        actionBar.addTab(tab);
         
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.principal, menu);
		return true;
	}
	
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.config) {
			
			Intent i = new Intent(this, ConfiguracoesActivity.class);
			startActivity(i);
			//Toast.makeText(getApplicationContext(), "As mensagens não lidas possuem o fundo cinza.", Toast.LENGTH_SHORT).show();
		}else if(id == R.id.novaDisciplina){
			Intent i = new Intent(this, NovaDisciplinaActivity.class);
			startActivity(i);
		}
		return super.onOptionsItemSelected(item);
	}

	
	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		viewPager.setCurrentItem(tab.getPosition());
		
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

	
	
}
