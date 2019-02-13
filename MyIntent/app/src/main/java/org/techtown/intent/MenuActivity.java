package org.techtown.intent;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("name", "mike"); // 메인 화면으로 정보를 전달

                setResult(Activity.RESULT_OK, intent);

                finish(); // Menu 화면을 끝낸다.
                // 화면이 스택형식으로 구현되어 있다. -> 메인 화면이 밑에 깔려 있는 형식
            }
        });
    }
}
