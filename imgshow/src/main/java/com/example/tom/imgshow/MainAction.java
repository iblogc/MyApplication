package com.example.tom.imgshow;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Tom on 2015/3/12.
 */
public class MainAction extends Activity {

    int[] imgs = new int[] {R.mipmap.a,R.mipmap.b,R.mipmap.d,R.mipmap.e,R.mipmap.f};
    int clickcount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
//        LinearLayout main = (LinearLayout) findViewById(R.id.root);
//        final ImageView img = new ImageView(this);
//        final DrawView draw = new DrawView(this);
//        img.setScaleType(ImageView.ScaleType.FIT_XY);
//        draw.setMinimumHeight(300);
//        draw.setMinimumWidth(500);
//        main.addView(draw);
//        main.addView(img);
////        main.addView(btn);
//        img.setImageResource(imgs[0]);
//        img.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                img.setImageResource(imgs[++clickcount % imgs.length]);
//            }
//        });

    }
}
