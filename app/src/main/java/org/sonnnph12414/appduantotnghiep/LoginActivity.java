package org.sonnnph12414.appduantotnghiep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    EditText edt_Username, edt_Password;
    Button btn_Login;
    TextView tv_ForGetPass, tv_Signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        edt_Username = findViewById(R.id.edt_Username);
        edt_Password = findViewById(R.id.edt_Password);
        btn_Login = findViewById(R.id.btn_Login);
        tv_ForGetPass = findViewById(R.id.tv_forGetPass);
        tv_Signin = findViewById(R.id.tv_Signin);

    }


    public void Login(View view) {
        Intent login = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(login);
    }

    public void ForGetPass(View view) {
        Intent ForGetPass = new Intent(LoginActivity.this, ForGetPassActivity.class);
        startActivity(ForGetPass);
    }

    public void Signin(View view) {
        Intent Signin = new Intent(LoginActivity.this, SigninActivity.class);
        startActivity(Signin);
    }
}