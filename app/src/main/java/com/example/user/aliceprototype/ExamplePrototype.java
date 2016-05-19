package com.example.user.aliceprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.example.user.aliceprototype.ForumSlider.ForumWelcome;
import com.example.user.aliceprototype.ForumSlider.MainForum;

public class ExamplePrototype extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_example_prototype);

        Button btnLogin = (Button)findViewById(R.id.btnlogin);

        btnLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ExamplePrototype.this, Login.class));
            }
        });

        Button btnRegister = (Button)findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ExamplePrototype.this, Register.class));
            }
        });

        Button btnForum = (Button)findViewById(R.id.btnForum);

        btnForum.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ExamplePrototype.this, MainForum.class));
            }
        });

        Button btnDashboard = (Button)findViewById(R.id.btnDash);

        btnDashboard.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ExamplePrototype.this, UserDash.class));
            }
        });

        Button btnProgram = (Button)findViewById(R.id.btnProgram);

        btnProgram.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ExamplePrototype.this, ProgramActivity.class));
            }
        });
    }
}
