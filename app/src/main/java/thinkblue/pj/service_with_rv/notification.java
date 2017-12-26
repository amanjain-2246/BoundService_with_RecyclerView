package thinkblue.pj.service_with_rv;


import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

public class notification extends AppCompatActivity {
Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        b1=(Button)findViewById(R.id.button4);
        b2=(Button)findViewById(R.id.button3);
        b3=(Button)findViewById(R.id.button5);
        b4=(Button)findViewById(R.id.button6);

    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            NotificationCompat.Builder builder=new NotificationCompat.Builder(getApplicationContext());

            builder.setContentText("context text");
            builder.setContentTitle("messsertrrrklkldfjjjjjjjjjjjjjjjjj");
            builder.setSmallIcon(R.mipmap.ic_launcher);
            Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher);
            builder.setLargeIcon(bitmap);
            builder.setTicker("ticker");
            builder.setAutoCancel(true);


            Notification notification=builder.build();
            NotificationManager manager=(NotificationManager)getApplicationContext().getSystemService(NOTIFICATION_SERVICE);
            manager.notify(43,notification);





        }
    });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationCompat.Builder builder=new NotificationCompat.Builder(getApplicationContext());
                NotificationCompat.BigPictureStyle bigPictureStyle=new NotificationCompat.BigPictureStyle(builder);
                builder.setContentText("context text");
                builder.setContentTitle("messsertrrrklkldfjjjjjjjjjjjjjjjjj");
                builder.setSmallIcon(R.mipmap.ic_launcher);
                Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher);
                //builder.setLargeIcon(bitmap);
                builder.setTicker("ticker");
                builder.setAutoCancel(true);

                bigPictureStyle.bigLargeIcon(bitmap);
                bigPictureStyle.bigPicture(bitmap);
                bigPictureStyle.setSummaryText("this is summary");
                bigPictureStyle.setBigContentTitle("big title");

                builder.setStyle(bigPictureStyle);

                Notification notification=builder.build();
                NotificationManager manager=(NotificationManager)getApplicationContext().getSystemService(NOTIFICATION_SERVICE);
                manager.notify(493,notification);
            }
        });
    b3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            NotificationCompat.Builder builder=new NotificationCompat.Builder(getApplicationContext());
            NotificationCompat.InboxStyle inboxStyle= new NotificationCompat.InboxStyle(builder);
            builder.setContentText("context text");
            builder.setContentTitle("messsertrrrklkldfjjjjjjjjjjjjjjjjj");
            builder.setSmallIcon(R.mipmap.ic_launcher);
            Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher);
            builder.setLargeIcon(bitmap);
            builder.setTicker("ticker");
            builder.setAutoCancel(true);

            inboxStyle.setBigContentTitle("big title");
            inboxStyle.setSummaryText("big summary text");
            inboxStyle.addLine("fdsdsfdasfffffffffffffffffas");
            builder.setStyle(inboxStyle);


            Notification notification=builder.build();
            NotificationManager manager=(NotificationManager)getApplicationContext().getSystemService(NOTIFICATION_SERVICE);
            manager.notify(453,notification);
        }
    });

b4.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        NotificationCompat.Builder builder=new NotificationCompat.Builder(getApplicationContext());
        NotificationCompat.MessagingStyle messagingStyle  =new NotificationCompat.MessagingStyle("hello");
        builder.setContentText("context text");
        builder.setContentTitle("messsertrrrklkldfjjjjjjjjjjjjjjjjj");
        builder.setSmallIcon(R.mipmap.ic_launcher);
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher);
        builder.setLargeIcon(bitmap);
        builder.setTicker("ticker");
        builder.setAutoCancel(true);
messagingStyle.getUserDisplayName();
        messagingStyle.addMessage("this is message",10,"a");
        messagingStyle.setConversationTitle("helooo this is title");

builder.setStyle(messagingStyle);
        Notification notification=builder.build();
        NotificationManager manager=(NotificationManager)getApplicationContext().getSystemService(NOTIFICATION_SERVICE);
        manager.notify(3,notification);

    }
});

    }




}
