package thinkblue.pj.service_with_rv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
int a[];
    String ar[];
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=new int[]{1,2,3,4};
        ar=new String[]{"a","b","c","d"};

        b=(Button)findViewById(R.id.button);

        final RecyclerView rv = (RecyclerView) findViewById(R.id.recycle);
        RecyclerView.Adapter adapt = new MyAdaptor(a,ar);
        rv.setAdapter(adapt);
        rv.setLayoutManager(new LinearLayoutManager(this));






        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "data", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getBaseContext(), MyService.class);
                i.putExtra("arr",a);
            //    i.putExtra("arr2",ar);
                startService(i);
stopService(i);

  }
        });




//        Intent i = new Intent(this, MyService.class);
//        i.putExtra("arr",a);
////        i.putExtra("data","myworld");
////        i.putExtra("data_int",1);
//        startService(i);
//        Toast.makeText(this, "in main", Toast.LENGTH_SHORT).show();
//        try {
//            Thread.sleep(5000);
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//
//        }
//        stopService(i);
    }
}
