package com.example.patrick.broadcastenvia;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity implements OnClickListener {

    Button btnSendBroadcast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSendBroadcast = (Button) findViewById(R.id.btnSendBroadcast);

        //Passa a referencia para podermos imprimir nesta interface o resultado.
        MyApplication myApplication = (MyApplication) this.getApplicationContext();
        myApplication.mainActivity = this;

        btnSendBroadcast.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {

        Intent intnet = new Intent("com.example.patrick.USER_ACTION");
        sendBroadcast(intnet);

    }

}
