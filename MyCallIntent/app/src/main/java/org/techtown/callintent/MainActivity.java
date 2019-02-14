package org.techtown.callintent;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText);


        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String receiver = editText.getText().toString();
                // intent가 시스템에 접근해서 Dial을 띄운 Action을 수행
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel : " + receiver));
                startActivity(intent);

                // 문자열을 이용하여 액티비티를 지정하고자 할 때
                Intent intent2 = new Intent();
                ComponentName name = new ComponentName("org.techtown.callinent", "org.techtown.callinent.ManuActivity");
                intent2.setComponent(name);
                startActivity(intent2);
            }
        });
    }
}
