package com.example.korvi_000.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.util.Random;

/**
 * Created by korvi_000 on 2015-06-17.
 */
public class LightView extends View {

    Paint p = new Paint();

    public LightView(Context context) {
        super(context);
    }

    public LightView(Context context, AttributeSet set) {
        super(context, set);
    }

    @Override
    public void onDraw(Canvas canvas){
        super.onDraw(canvas);
        Random rand = new Random();
        int color = Color.argb(255, rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
        Log.i("color1",String.valueOf(color));
        Log.i("color2", Integer.toString(color));
        Log.i("color3", color + "");
        p.setColor(color);
        canvas.drawCircle(500, 800, 400, p);
    }

}
