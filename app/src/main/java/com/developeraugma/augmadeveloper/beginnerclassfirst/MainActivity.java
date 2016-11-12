package com.developeraugma.augmadeveloper.beginnerclassfirst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.developeraugma.augmadeveloper.beginnerclassfirst.activity.MoveActivity;
import com.developeraugma.augmadeveloper.beginnerclassfirst.activity.NameActivity;

public class MainActivity extends AppCompatActivity {
private EditText edtName;
    private Button btnCek,btnPindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName=(EditText)findViewById(R.id.edt_name);
        btnCek=(Button) findViewById(R.id.cek);
        btnPindah=(Button)findViewById(R.id.btn_name);


        btnCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cekName= new Intent(MainActivity.this, NameActivity.class);
                cekName.putExtra("YourName",edtName.getText().toString());
                startActivity(cekName);
            }
        });
        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MoveActivity.class));
                finish();
            }
        });
    }
}
