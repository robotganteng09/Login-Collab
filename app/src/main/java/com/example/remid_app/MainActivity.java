package com.example.remid_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText emailText,passworText;
    Button btnmasuk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        emailText = findViewById(R.id.emailEditText);
        passworText = findViewById(R.id.emailEditText);
        btnmasuk = findViewById(R.id.loginButton);

        btnmasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailText.getText().toString().trim();
                String password = passworText.getText().toString().trim();

                // Tampilkan password (atau bisa diganti dengan logika login asli)


                if (email.equals("arsya") && password.equals("123456")) {
                    // Login berhasil
                    Intent intent = new Intent(MainActivity.this, Home1.class);
                    startActivity(intent);
                    finish();
                } else {
                    // Login gagal
                    Toast.makeText(MainActivity.this, "Email atau password salah", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}