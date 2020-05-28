package kr.ac.sejong.customlistviewapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        MyListViewAdapter adapter = new MyListViewAdapter();
        ArrayList<MyListViewItem> data = adapter.getData();
        data.add(new MyListViewItem(
                ContextCompat.getDrawable(this,R.drawable.ic_launcher_background),"Mario","@mario","1m","Hello"));
        data.add(new MyListViewItem(
                ContextCompat.getDrawable(this,R.drawable.ic_launcher_foreground),"Lousi","@lousi","2m","Thank you"));
        data.add(new MyListViewItem(
                ContextCompat.getDrawable(this,R.drawable.ic_launcher_foreground),"Yoshi","@yoshi","1h","Good Bye"));

        listView.setAdapter(adapter);
    }
}
