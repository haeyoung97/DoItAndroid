package org.techtown.basicwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton radioButton = (RadioButton)findViewById(R.id.radioButton);
        //RadioButton radioButton2 = (RadioButton)findViewById(R.id.radioButton2);
        boolean checked = radioButton.isChecked();
    }


}
