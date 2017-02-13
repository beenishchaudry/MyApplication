package com.example.bchaudhr.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    String TAG = "MainActivity";
    TextView txtOk;
    String myString = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtOk = (TextView) findViewById(R.id.textView);

        if (getIntent() != null) {
            Intent mIntent = getIntent();
            Bundle mBundle = mIntent.getExtras();
            if(mBundle != null) {
                myString = mBundle.getString("name");
                txtOk.setText(myString);
            }

        }
        int i = 0;

        Log.d( TAG, "before the intent is fired");

        Log.d( TAG, "i at point is" + i);

        i = calculateSum(11,77);
      //  Intent intent = new Intent(this, SplashActivity.class);
    //    startActivity(intent);


        Button btnOk = (Button)findViewById(R.id.button);
        View.OnClickListener clickListener = new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent newIntent = new Intent(MainActivity.this, SplashActivity.class);
              startActivity(newIntent);
              finish();
          }
         };

        btnOk.setOnClickListener(clickListener);


        Button btnOk2 = (Button)findViewById(R.id.button2);
        View.OnClickListener clickListener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myString = "The Fighting Irish";
                txtOk.setText(myString);
            }
        };
        btnOk2.setOnClickListener(clickListener2);


        Log.d( TAG, "after intent is fired");

    }

    public void callText() {
        txtOk.setText("The Fighting Irish");

    }
    public int calculateSum(int x, int y) {

        int sum = 0;
        sum = x + y;
        return sum;
    }


}
