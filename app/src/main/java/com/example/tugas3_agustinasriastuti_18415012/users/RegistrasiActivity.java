package com.example.tugas3_agustinasriastuti_18415012.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tugas3_agustinasriastuti_18415012.R;

public class RegistrasiActivity extends AppCompatActivity {

    Button kembalilogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        getSupportActionBar().hide();

        kembalilogin = (Button) findViewById(R.id.kembali_login);
        kembalilogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kembali = new Intent(RegistrasiActivity.this, LoginActivity.class);
                startActivity(kembali);
                finish();
            }
        });
    }
}
