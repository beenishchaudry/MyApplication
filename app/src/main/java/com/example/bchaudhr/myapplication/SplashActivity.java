package com.example.bchaudhr.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by bchaudhr on 2/6/2017.
 */

public class SplashActivity extends Activity {

    String TAG = "SplashActivity";

    @Override
    public void onCreate(Bundle os) {
        super.onCreate(os);
        setContentView(R.layout.activity_splash);


        Log.d( TAG, "after intent is fired");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent newIntent = new Intent(SplashActivity.this, MainActivity.class);
        Bundle mBundle = new Bundle();
        mBundle.putString("name", "Robert");
        newIntent.putExtras(mBundle);

        startActivity(newIntent);
        finish();
    }
}
