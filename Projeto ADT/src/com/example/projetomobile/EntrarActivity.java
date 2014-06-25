package com.example.projetomobile;

import com.example.projetomobile.adapter.CustomTabListener;
import com.example.projetomobile.adapter.GeralFragment;
import com.example.projetomobile.adapter.IntegracaoFragment;
import com.example.projetomobile.adapter.MobileFragment;
import com.example.projetomobile.adapter.PersistenciaFragment;
import com.example.projetomobile.adapter.TabsPagerAdapter;
import com.example.projetomobile.adapter.WebFragment;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.app.ActionBar.Tab;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

@SuppressLint("NewApi")
public class EntrarActivity extends FragmentActivity implements
ActionBar.TabListener {
	
	private ViewPager viewPager;
    private TabsPagerAdapter mAdapter;
    @SuppressLint("NewApi")
	private ActionBar actionBar;
    // Tab titles
    private String[] tabs = {"Geral"};

    @SuppressLint("NewApi")
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
 
        actionBar.setDisplayShowTitleEnabled(true);
 
        
        Tab tab = actionBar.newTab()
            .setText("Geral")
            .setTabListener(new CustomTabListener<GeralFragment>(this, "geral", GeralFragment.class));
             
        actionBar.addTab(tab);
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
