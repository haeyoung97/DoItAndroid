package org.techtown.framelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    ImageView imageView2;

    int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView)findViewById(R.id.imageView); // Id를 이용하여 찾아 접근 하기 위함
        imageView2 = (ImageView)findViewById(R.id.imageView2); // Id를 이용하여 찾아 접근 하기 위함

    }

    public void onButton1Clicked(View v) {
        index += 1;
        if(index > 1){
            index = 0;
        }

        if(index == 0){
            imageView.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
        }else if(index ==1){
            imageView.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);
        }
    }
}
