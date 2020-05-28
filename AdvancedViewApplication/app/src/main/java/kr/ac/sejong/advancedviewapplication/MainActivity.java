package kr.ac.sejong.advancedviewapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView tv;
    private Button dateButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        tv = findViewById(R.id.tv);
        dateButton = findViewById(R.id.button2);
        registerForContextMenu(tv);

        DatePickerDialog picker = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                tv.setText(year+"-"+month+"-"+dayOfMonth);
            }
        }, 2000,10,10);
        picker.show();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //어떻게 잘 생성하는가?
                AlertDialog.Builder alertDiaglogBuilder = new AlertDialog.Builder(MainActivity.this);
                alertDiaglogBuilder.setMessage("결제하시겠습니까?");

                alertDiaglogBuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        tv.setText("YES");
                    }
                });
                alertDiaglogBuilder.setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        tv.setText("NO");
                    }
                });

                //잘 생성해서
                AlertDialog alertDialog = alertDiaglogBuilder.create();
                alertDialog.show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
        menu.add(0,1,0,"CAT");
        menu.add(0,2,0,"DOG");
        menu.add(0,3,0,"HUMAN");
        // mymenu.xml
        //MenuInflater inflater = getMenuInflater();
        //inflater.inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        // Toast message로 화면에 title을 출력한다.
        Toast.makeText(getApplicationContext(), item.getTitle()+String.valueOf(item.getItemId()), Toast.LENGTH_SHORT).show();

        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu,v,menuInfo);
        menu.setHeaderTitle("컨텍스트 메뉴");
        menu.add(0,1,0,"배경색: RED");
        menu.add(0,2,0,"배경색: GREEN");
        menu.add(0,3,0,"배경색: BLUE");
        //MenuInflater inflater = getMenuInflater();
        //inflater.inflate(R.menu.mymenu, menu);
    }

}
