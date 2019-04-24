package com.example.esrapc.gyk_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button loginBtn;
    EditText nameEd, passwordEd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initialize();
    }

    private void initialize() {
        loginBtn = findViewById(R.id.loginbutton);
        nameEd = findViewById(R.id.name);
        passwordEd = findViewById(R.id.password);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nameEd.getText().toString().equals("senem") && passwordEd.getText().toString().equals("123")) {
                    Intent mainIntent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(mainIntent);
                }else
                    Toast.makeText(getApplicationContext(), "KullanıcıAdı veya Parola yanlış", Toast.LENGTH_LONG).show();
            }
        });
    }
}
