package thinkblue.pj.service_with_rv;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.widget.Toast;

public class BoundedService extends Service {
    public final IBinder mybinder=new BoundedService.LocalBinder();

    public class LocalBinder extends Binder{
        BoundedService getMyService()
        {
            return BoundedService.this;
        }
    }

    public BoundedService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
       return mybinder;
    }

    public double add(double a,double b)
    {
        return a+b;
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "kjhfkjjjjjjjjjjjjjjjjj", Toast.LENGTH_SHORT).show();
    }
}
