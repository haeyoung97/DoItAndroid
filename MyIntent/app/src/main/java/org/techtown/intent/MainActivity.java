package org.techtown.intent;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 시스템이 화면을 컨트롤한다.
                // 시스템이 알아들을 수 있는 포멧 = intent
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                startActivityForResult(intent, 101); //응답을 받아야 할 때 어떤 화면에서 받은 것인지 알고자 할 때 사용
            }
        });
    }

    // menu 화면에서 전달 받은 정보를 받기 위한 메소드
    // startActivityForResult 의 응답을 받는 메소드
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 101){
            String name = data.getStringExtra("name");
            Toast.makeText(getApplicationContext(),"메뉴 화면으로부터 응답 : " + name, Toast.LENGTH_LONG).show();
        }

    }
}
