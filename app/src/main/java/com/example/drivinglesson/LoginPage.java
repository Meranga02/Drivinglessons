package com.example.drivinglesson;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
    }

    public void resetpassword(View view) {
        Toast.makeText(LoginPage.this,"Reset your password", Toast.LENGTH_LONG).show();
    }

    public void register(View view) {
        Toast.makeText(LoginPage.this,"Please Register First", Toast.LENGTH_LONG).show();
    }
}