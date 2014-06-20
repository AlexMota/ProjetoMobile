package com.example.projetomobile;

import java.sql.SQLException;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

public class DatabaseHelper extends OrmLiteSqliteOpenHelper{
	
	private static final String DATABASE_NAME = "projmobile.db";
	private static final int DATABASE_VERSION = 1;
	
	private Dao<Mensagem, Integer> mensagemDao = null;
	private RuntimeExceptionDao<Mensagem, Integer> mensagemRuntimeDao = null;
	
	
	public DatabaseHelper (Context context){
		super(context, DATABASE_NAME, null, DATABASE_VERSION, R.raw.ormlite_config);
	}


	@Override
	public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
		
		try {
			TableUtils.createTable(connectionSource, Mensagem.class);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}


	@Override
	public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion,
			int newVersion){
		try {
			TableUtils.dropTable(connectionSource, Mensagem.class, true);
			onCreate(database, connectionSource);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public Dao<Mensagem, Integer> getMensagemDao(){
		if(mensagemDao == null){
			mensagemDao = getMensagemDao();
		}
		
		return mensagemDao;
	}
	
	public RuntimeExceptionDao<Mensagem, Integer> getMensagemRuntimeDao(){
		if(mensagemRuntimeDao == null){
			mensagemRuntimeDao = getMensagemRuntimeDao();
		}
		
		return mensagemRuntimeDao;
	}

}
