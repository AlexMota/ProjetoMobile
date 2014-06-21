package com.example.projetomobile;

import java.io.IOException;
import java.sql.SQLException;

import com.j256.ormlite.android.apptools.OrmLiteConfigUtil;

public class DatabaseConfigUtil extends OrmLiteConfigUtil{
	
	private static final Class<?>[] classes = new Class[]{Mensagem.class, Usuario.class};

	public static void main(String[] args) {
		try {
			writeConfigFile("ormlite_config.txt", classes);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
