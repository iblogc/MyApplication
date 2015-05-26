package com.example.korvi_000.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by Tom on 2015/3/12.
 */
public class PhotoSwitchActivity extends Activity {

    int[] imgs = new int[] {R.mipmap.a,R.mipmap.b,R.mipmap.d,R.mipmap.e,R.mipmap.f};
    int clickcount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photoswitch_main);
        LinearLayout main = (LinearLayout) findViewById(R.id.root);
        final ImageView img = new ImageView(this);
        img.setScaleType(ImageView.ScaleType.FIT_XY);
        main.addView(img);
        img.setImageResource(imgs[0]);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(imgs[++clickcount % imgs.length]);
            }
        });

    }
}
