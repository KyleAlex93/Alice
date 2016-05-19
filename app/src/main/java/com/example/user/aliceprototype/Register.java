package com.example.user.aliceprototype;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_register);

        EditText username = (EditText) findViewById(R.id.editText3);
        username.setHintTextColor(getResources().getColor(R.color.colorText));

        EditText ConfirmUsername = (EditText) findViewById(R.id.editText4);
        ConfirmUsername.setHintTextColor(getResources().getColor(R.color.colorText));

        EditText password = (EditText) findViewById(R.id.editText5);
        password.setTypeface(Typeface.DEFAULT);
        password.setTransformationMethod(new PasswordTransformationMethod());
        password.setHintTextColor(getResources().getColor(R.color.colorText));

        EditText passwordConfirm = (EditText) findViewById(R.id.editText6);
        passwordConfirm.setTypeface(Typeface.DEFAULT);
        passwordConfirm.setTransformationMethod(new PasswordTransformationMethod());
        passwordConfirm.setHintTextColor(getResources().getColor(R.color.colorText));

        Button btn = (Button)findViewById(R.id.btnLoginReg);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Register.this, Login.class));
            }
        });
    }


}
