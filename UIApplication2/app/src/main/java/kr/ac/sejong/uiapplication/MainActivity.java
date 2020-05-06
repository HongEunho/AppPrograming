package kr.ac.sejong.uiapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private EditText editText;
    private EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       button = findViewById(R.id.button);
       textView = findViewById(R.id.textView);
       editText = findViewById(R.id.editText);
       editText2 = findViewById(R.id.editText2);

       editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
           @Override
           public void onFocusChange(View v, boolean hasFocus) {
               if (hasFocus)
                   textView.setText("포커스1");
               else
                   textView.setText("포커스1 사라짐");
           }
       });


    }
}
