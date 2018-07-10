package com.dor.gilad.barter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by GILADSAG on 9/28/2017.
 */

public class new_profile extends View {

    Bitmap circle;
    int circle_height;
    int circle_width;
    int circle_height_orig;
    int circle_width_orig;

    public new_profile(Context context) {
        super(context);
        circle = BitmapFactory.decodeResource(getResources(),R.drawable.circle_profile);
        circle_height_orig = circle.getHeight();
        circle_width_orig = circle.getWidth();
        circle_height = circle.getHeight();
        circle_width = circle.getWidth();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(circle,(canvas.getWidth()/2)-(circle.getWidth()/2),(canvas.getHeight()/2)-(circle.getHeight()/2),null);
        if (circle_height > 20){
            circle_height -=100;
            circle_width -=100;
        }
        //invalidate();
    }
}
