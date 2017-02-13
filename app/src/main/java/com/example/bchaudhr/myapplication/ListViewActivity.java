package com.example.bchaudhr.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by bchaudhr on 2/6/2017.
 */

public class ListViewActivity extends Activity {

    String TAG = "ListViewActivity";

  //  ArrayList<Int> arrayList = new ArrayList<Int>();

    @Override
    public void onCreate(Bundle os) {
        super.onCreate(os);

        Log.d( TAG, "after intent is fired");
    }

}
