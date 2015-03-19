package com.example.korvi_000.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener {
    protected TextView div;
    protected TextView ediv;
    protected Button btn7;
    int num1;
    double num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        setContentView(R.layout.activity_main);
//        LinearLayout layout = new LinearLayout(this);
//        RelativeLayout layout = new RelativeLayout(this);
//        layout.removeAllViews();
//        设置Activity显示layout
//        super.setContentView(layout);
//        layout.setOrientation(RelativeLayout.VERTICAL);
//        创建一个TextView
//        final TextView show = new TextView(this);
//        show.setText("测试");
//        创建一个Button
//        Button btn = new Button(this);
//        btn.setWidth(3);
//        btn.setPadding(20,20,20,20);
//        btn.setText(R.string.ok);
//        btn.setWidth(2);
//        向窗口上添加TextView
//        layout.addView(btn);
//        layout.addView(show);


        setContentView(R.layout.activity_main);
        div = (TextView) findViewById(R.id.dispay);
        Button btn0 = (Button) findViewById(R.id.zero);
        Button btn1 = (Button) findViewById(R.id.one);
        Button btn2 = (Button) findViewById(R.id.two);
        Button btn3 = (Button) findViewById(R.id.three);
        Button btn4 = (Button) findViewById(R.id.four);
        Button btn5 = (Button) findViewById(R.id.five);
        Button btn6 = (Button) findViewById(R.id.six);
        btn7 = (Button) findViewById(R.id.seven);
        Button btn8 = (Button) findViewById(R.id.eight);
        Button btn9 = (Button) findViewById(R.id.night);
        Button addBtn = (Button) findViewById(R.id.add);
        Button cutBtn = (Button) findViewById(R.id.cut);
        Button multiplicationBtn = (Button) findViewById(R.id.multiplication);
        Button divisionBtn = (Button) findViewById(R.id.division);
        Button pointBtn = (Button) findViewById(R.id.point);
        Button equalBtn = (Button) findViewById(R.id.equal);
        Button cBtn = (Button) findViewById(R.id.c);
        Button deleteBtn = (Button) findViewById(R.id.delete);
        btn1.setOnClickListener(this);
        btn1.setTag(1);
        btn2.setOnClickListener(this);
        btn2.setTag(2);
        btn3.setOnClickListener(this);
        btn3.setTag(3);
        btn4.setOnClickListener(this);
        btn4.setTag(4);
        btn5.setOnClickListener(this);
        btn5.setTag(5);
        btn6.setOnClickListener(this);
        btn6.setTag(6);
        btn7.setClickable(false);
        btn7.setOnClickListener(this);
        btn7.setTag(7);
        btn8.setOnClickListener(this);
        btn8.setTag(8);
        btn8.setClickable(false);
        btn9.setOnClickListener(this);
        btn9.setClickable(false);
        btn9.setTag(9);
        addBtn.setOnClickListener(this);
        addBtn.setTag(1001);
        cutBtn.setOnClickListener(this);
        cutBtn.setTag(1002);
        multiplicationBtn.setOnClickListener(this);
        multiplicationBtn.setTag(1003);
        divisionBtn.setOnClickListener(this);
        divisionBtn.setTag(1004);
        pointBtn.setOnClickListener(this);
        pointBtn.setTag(1005);
        equalBtn.setOnClickListener(this);
        equalBtn.setTag(1006);
        cBtn.setOnClickListener(this);
        cBtn.setTag(1007);
        deleteBtn.setOnClickListener(this);
        deleteBtn.setTag(1008);


    }

    public void onClick(View v) {
        int tag = (int) v.getTag();
        if (tag >= 0 && tag <= 9) {
            div.append(String.valueOf(tag));
        }else if(tag==1001){
//            num1 = tag;
            div.append(String.valueOf("+"));
        }else if(tag==1002){
//            num1 = tag;
            div.append(String.valueOf("-"));
        }else if(tag==1003){
//            num1 = tag;
            div.append(String.valueOf("*"));
        }else if(tag==1004){
//            num1 = tag;
            div.append(String.valueOf("/"));
        }else if(tag==1005){
//            num1 = tag;
            div.append(String.valueOf("."));
        }else if(tag==1006){

        }else if(tag==1007){
            div.setText("");
        }else if(tag==1008){
//            Log.i("text", div.getText().toString());
            String s = div.getText().toString();
            if(s.length()>0){
                div.setText(s.substring(0,s.length()-1));
            }
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
