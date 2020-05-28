package kr.ac.sejong.adapterviewapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Data
        String[] data = {"A","B","C"};
        Integer[] data2 = {1,2,3};
        //String[] data = new String[3];


        //UI
        listView = findViewById(R.id.listView);

        //Data (Array) <-- Adapter --> UI
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, data);
        ArrayAdapter<Integer> adapter2 = new ArrayAdapter<Integer>(this,android.R.layout.simple_list_item_1,data2);
        listView.setAdapter(adapter2);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // view를 이용해 보자
                AppCompatTextView tv = (AppCompatTextView) view;
                Toast.makeText(MainActivity.this, tv.getText().toString(),Toast.LENGTH_SHORT).show();

                // listview
                //Object obj = parent.getItemAtPosition(position);
                //System.out.println(obj);
            }
        });
    }
}
