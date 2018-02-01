package com.example.user.kpkfpb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText bil1, bil2, hasil;
    Button btnKpk, btnFbp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bil1 = (EditText) findViewById(R.id.bil1);
        bil2 = (EditText) findViewById(R.id.bil2);
        hasil = (EditText) findViewById(R.id.hasil);
        btnFbp = (Button) findViewById(R.id.bntFpb);
        btnKpk = (Button) findViewById(R.id.bntKpk);



        btnFbp.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                int d = 0;
                int a = Integer.parseInt(bil1.getText().toString());
                int b = Integer.parseInt(bil2.getText().toString());
                d = a % b;
                while (d != 0) {
                    a = b;
                    b = d;
                    d = a % b;
                }
                hasil.setText("" + b);
            }
        });

        btnKpk.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                int c = 0;
                int a = Integer.parseInt(bil1.getText().toString());
                int b = Integer.parseInt(bil2.getText().toString());
                for(int x = 1; x <= b; x++) {
                    c = (c + a);
                    if (c % b == 0) {
                        hasil.setText("" + c);
                        break;
                    }
                }
            }
        });
    }
}
