package com.example.drivinglesson;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class LoginPage extends AppCompatActivity {

    private Button dateButton, RegisterBtn;
    private FirebaseAuth auth;
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        //firebase hooks
        auth = FirebaseAuth.getInstance();
        firebaseDatabase = FirebaseDatabase.getInstance();
    }

    public void resetpassword(View view) {
        Toast.makeText(LoginPage.this,"Reset your password", Toast.LENGTH_LONG).show();
    }

    public void register(View view) {
        Toast.makeText(LoginPage.this,"Please Register First", Toast.LENGTH_LONG).show();
    }
}