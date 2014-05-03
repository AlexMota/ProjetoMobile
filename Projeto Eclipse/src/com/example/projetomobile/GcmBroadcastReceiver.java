package com.example.projetomobile;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;

public class GcmBroadcastReceiver extends WakefulBroadcastReceiver{

	@Override
	public void onReceive(Context arg0, Intent arg1) {
		
        ComponentName comp = new ComponentName(context.getPackageName(),
                GcmIntentService.class.getName());
        //Inicia o serviço, mantendo o dispositivo acordado enquanto está executando.
        startWakefulService(context, (intent.setComponent(comp)));
        setResultCode(Activity.RESULT_OK);
		
	}
	
	

}
