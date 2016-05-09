package com.example.korvi_000.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Tom on 2015/3/20.
 */
public class FunlistActivity extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.funlist);
        Button btn_logreg = (Button) findViewById(R.id.logreg);
        Button btn_calculator = (Button) findViewById(R.id.calculator);
        Button btn_photoswitch = (Button) findViewById(R.id.photoswitch);
        Button btn_dot = (Button) findViewById(R.id.dot);
        Button btn_mp = (Button) findViewById(R.id.mp);
        Button btn_diandeng = (Button) findViewById(R.id.diandeng);
        btn_logreg.setOnClickListener(this);
        btn_calculator.setOnClickListener(this);
        btn_photoswitch.setOnClickListener(this);
        btn_dot.setOnClickListener(this);
        btn_mp.setOnClickListener(this);
        btn_diandeng.setOnClickListener(this);
    }

    public void onClick(View v) {
        String tag = (String) v.getTag();
        if(tag == this.getString(R.string.loggin)){
            Intent intent = new Intent(FunlistActivity.this,LogginActivity.class);
            startActivity(intent);
        }else if(tag == this.getString(R.string.calculator)){
            Intent intent = new Intent(FunlistActivity.this,CalculatorActivity.class);
            startActivity(intent);
        }else if(tag == this.getString(R.string.photoswitch)){
            Intent intent = new Intent(FunlistActivity.this,PhotoSwitchActivity.class);
            startActivity(intent);
        }else if(tag == this.getString(R.string.dot)){
            Intent intent = new Intent(FunlistActivity.this,DotActivity.class);
            startActivity(intent);
        }else if(tag == this.getString(R.string.mp)){
            Intent intent = new Intent(FunlistActivity.this,MPAndroidChartActivity.class);
            startActivity(intent);
        }else if(tag == this.getString(R.string.light)){
            Intent intent = new Intent(FunlistActivity.this,LightActivity.class);
            startActivity(intent);
        }

    }

}
