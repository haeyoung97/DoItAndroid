package org.techtown.button;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class BitmapButton extends AppCompatButton {
    public BitmapButton(Context context) {
        super(context);

        init(context);
    }

    public BitmapButton(Context context, AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    private void init(Context context){
        setBackgroundResource(R.drawable.bitmap_button_normal);

        float textSize = getResources().getDimension(R.dimen.text_size);
        setTextSize(textSize); // Pixel 단위

        setTextColor(Color.WHITE);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();

        switch (action){
            case MotionEvent.ACTION_DOWN:
                setBackgroundResource(R.drawable.bitmap_button_clicked);
                break;
            case MotionEvent.ACTION_UP:
                setBackgroundResource(R.drawable.bitmap_button_normal);
                break;
        }

        invalidate();

        return true;

    }
}
