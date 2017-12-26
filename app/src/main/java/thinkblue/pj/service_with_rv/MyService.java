package thinkblue.pj.service_with_rv;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

public class  MyService extends Service {


    public MyService() {

    }


    @Override
    public void onCreate() {
        Toast.makeText(this, "on Create", Toast.LENGTH_SHORT).show();


        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Toast.makeText(this, "on start", Toast.LENGTH_SHORT).show();
        Bundle b = intent.getExtras();
       for(int i=0;i<b.getIntArray("arr").length;i++)
       Toast.makeText(this,b.getIntArray("arr")[i]+"", Toast.LENGTH_SHORT).show();
//        String s = intent.getStringExtra("data");
//        int i = intent.getIntExtra("data_int",0);
//        Toast.makeText(this,s+"", Toast.LENGTH_SHORT).show();
//        Toast.makeText(this,i+"", Toast.LENGTH_SHORT).show();

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
