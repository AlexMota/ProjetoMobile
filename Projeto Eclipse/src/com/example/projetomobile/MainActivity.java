package com.example.projetomobile;

import java.util.concurrent.atomic.AtomicInteger;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.widget.TextView;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.gcm.GoogleCloudMessaging;

public class MainActivity extends Activity {

	private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;
	
	static final String TAG = "GCM Demo";
	
	
	TextView mDisplay;
    GoogleCloudMessaging gcm;
    AtomicInteger msgId = new AtomicInteger();
    Context context;

    String regid;
    
    

    private boolean checkPlayServices() {
        int resultCode = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this);
        if (resultCode != ConnectionResult.SUCCESS) {
            if (GooglePlayServicesUtil.isUserRecoverableError(resultCode)) {
                GooglePlayServicesUtil.getErrorDialog(resultCode, this,
                        PLAY_SERVICES_RESOLUTION_REQUEST).show();
            } else {
                Log.i(TAG, "Este dispositivo não é suportado!");
                finish();
            }
            return false;
        }
        return true;
    }
    
    private SharedPreferences getGcmPreferences(Context context) {
        // Guarda o ID de registro nas suas preferencias compartilhadas.
        return getSharedPreferences(MainActivity.class.getSimpleName(),
                Context.MODE_PRIVATE);
    }
	

	

}
