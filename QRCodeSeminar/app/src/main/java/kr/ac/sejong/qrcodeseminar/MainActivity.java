package kr.ac.sejong.qrcodeseminar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;
import com.journeyapps.barcodescanner.CaptureActivity;


public class MainActivity extends AppCompatActivity {

    private Button scanButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Activity activity = this;             //현재 액티비티를 activity라는 변수로 저장

        scanButton = findViewById(R.id.scanButton);
        scanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IntentIntegrator intentIntegrator = new IntentIntegrator(activity);
                intentIntegrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);
                intentIntegrator.setPrompt("Scan"); //실행될 때 표시할 문구
                intentIntegrator.setCameraId(0);
                intentIntegrator.setBeepEnabled(false); //바코드 인식 시 소리
                intentIntegrator.setBarcodeImageEnabled(false); //사진으로 저장
                intentIntegrator.setOrientationLocked(false); // 세로로 스캔하기 위해 화면전환을 잠궈줌
                intentIntegrator.initiateScan(); //스캔 시작
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode,resultCode,data); //스캔한 결과값
        if(result!=null) {
            String QRCode = result.getContents();
            if (QRCode == null)
                Toast.makeText(this, "Cancel Scanning", Toast.LENGTH_SHORT).show();
            else {
                Toast.makeText(this, QRCode, Toast.LENGTH_SHORT).show();
            }
        }
        else
            super.onActivityResult(requestCode, resultCode, data);
    }
}
