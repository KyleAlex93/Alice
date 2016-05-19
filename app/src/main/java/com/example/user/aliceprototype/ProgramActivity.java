package com.example.user.aliceprototype;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class ProgramActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_program2);

        ImageView iv1 = (ImageView)findViewById(R.id.step_one);
        ImageView iv2 = (ImageView)findViewById(R.id.step_two);
        ImageView iv3 = (ImageView)findViewById(R.id.step_three);
        ImageView iv4 = (ImageView)findViewById(R.id.step_four);
        ImageView iv5 = (ImageView)findViewById(R.id.step_five);
        ImageView iv6 = (ImageView)findViewById(R.id.step_six);
        ImageView iv7 = (ImageView)findViewById(R.id.step_seven);
        ImageView iv8 = (ImageView)findViewById(R.id.step_eight);
        ImageView iv9 = (ImageView)findViewById(R.id.step_nine);
        ImageView iv10 = (ImageView)findViewById(R.id.step_ten);
        ImageView iv11 = (ImageView)findViewById(R.id.step_eleven);
        ImageView iv12 = (ImageView)findViewById(R.id.step_twelve);

        iv1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(), TestActivity.class);
                i.putExtra("step","1");
                startActivity(i);
            }
        });
        iv2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(), TestActivity.class);
                i.putExtra("step","2");
                startActivity(i);
            }
        });
        iv3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(), TestActivity.class);
                i.putExtra("step","3");
                startActivity(i);
            }
        });
        iv4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(), TestActivity.class);
                i.putExtra("step","4");
                startActivity(i);
            }
        });
        iv5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(), TestActivity.class);
                i.putExtra("step","5");
                startActivity(i);
            }
        });
        iv6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(), TestActivity.class);
                i.putExtra("step","6");
                startActivity(i);
            }
        });
        iv7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(), TestActivity.class);
                i.putExtra("step","7");
                startActivity(i);
            }
        });
        iv8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(), TestActivity.class);
                i.putExtra("step","8");
                startActivity(i);
            }
        });
        iv9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(), TestActivity.class);
                i.putExtra("step","9");
                startActivity(i);
            }
        });
        iv10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(), TestActivity.class);
                i.putExtra("step","10");
                startActivity(i);
            }
        });
        iv12.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(), TestActivity.class);
                i.putExtra("step","12");
                startActivity(i);
            }
        });
        iv11.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(), TestActivity.class);
                i.putExtra("step","11");
                startActivity(i);
            }
        });
        iv12.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(), TestActivity.class);
                i.putExtra("step","12");
                startActivity(i);
                //startActivity(new Intent(ProgramActivity.this, TestActivity.class));
            }
        });
    }
}
