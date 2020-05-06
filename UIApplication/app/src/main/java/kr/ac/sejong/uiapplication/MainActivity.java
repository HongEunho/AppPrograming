package kr.ac.sejong.uiapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //MainActivity라는 레이아웃을 화면에 표시한다.
        setContentView(R.layout.activity_main);
    }
}
