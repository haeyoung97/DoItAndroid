package org.techtown.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    private static final String TAG = "MyService";

    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();

        Log.d(TAG, "onCreate() 호출됨.");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand() 호출됨.");

        if(intent == null){
            return Service.START_STICKY;
        }else{
            processCommand(intent);
        }

        return super.onStartCommand(intent, flags, startId);
    }

    private void processCommand(Intent intent){ // 서비스에서 받은 정보를 띄우는 메소드
        String command = intent.getStringExtra("command");
        String name = intent.getStringExtra("name");

        Log.d(TAG, "전달받은 데이터 : " + command + ", " + name);

        try{
            Thread.sleep(5000);
        }catch(Exception e){}

        // 서비스는 화면이 존재하지 않는다.
        // 이 때 flag를 이용하여 정보를 띄운다.
        Intent showIntent = new Intent(getApplicationContext(), MainActivity.class);
        showIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|
                            Intent.FLAG_ACTIVITY_SINGLE_TOP|
                            Intent.FLAG_ACTIVITY_CLEAR_TOP);
        showIntent.putExtra("command", "show");
        showIntent.putExtra("name", name + " from service.");
        startActivity(showIntent);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
