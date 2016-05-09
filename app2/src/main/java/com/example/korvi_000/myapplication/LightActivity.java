package com.example.korvi_000.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * Created by korvi_000 on 2015-06-17.
 */
public class LightActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.light);
    }

    public void btnDianDengOnClick(View v){
        Log.i("ev", "btn diandeng click");
        v.invalidate();
    }

}
