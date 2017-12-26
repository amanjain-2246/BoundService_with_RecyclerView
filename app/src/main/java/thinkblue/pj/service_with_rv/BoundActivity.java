package thinkblue.pj.service_with_rv;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class BoundActivity extends AppCompatActivity {
TextView t1,t2;
    Double a,a1;
    BoundedService boundedService;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bound_service);
        b=(Button)findViewById(R.id.button2);
        t1=(TextView)findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView3);
        final ServiceConnection myconnection=new ServiceConnection() {
            @Override
            public void onServiceConnected(ComponentName name, IBinder service) {
                BoundedService.LocalBinder mybinder=(BoundedService.LocalBinder)service;
                boundedService=mybinder.getMyService();
            }

            @Override
            public void onServiceDisconnected(ComponentName name) {

            }
        };
        bindService(new Intent(this,BoundedService.class),myconnection,BIND_AUTO_CREATE);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               a=Double.valueOf(t1.getText().toString());
               a1=Double.valueOf(t2.getText().toString());
            double res=boundedService.add(a,a1);
                Toast.makeText(getApplicationContext(), res+"", Toast.LENGTH_SHORT).show();
                unbindService(myconnection);
            }
        });
    }
}
