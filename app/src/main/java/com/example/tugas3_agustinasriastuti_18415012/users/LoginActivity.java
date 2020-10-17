package com.example.tugas3_agustinasriastuti_18415012.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tugas3_agustinasriastuti_18415012.R;

public class LoginActivity extends AppCompatActivity {

    Button masukregistrasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        masukregistrasi = (Button) findViewById(R.id.masuk_registrasi);
        masukregistrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masuk = new Intent(LoginActivity.this, RegistrasiActivity.class);
                startActivity(masuk);
                finish();
            }
        });
    }
}
