package com.example.user.aliceprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_test);

        Intent intent = getIntent();

        String step = intent.getStringExtra("step");
        CircleImageView imageView = (CircleImageView)findViewById(R.id.step);
        TextView textView = (TextView)findViewById(R.id.txtStep);

        switch(step)
        {
            case "1":
                imageView.setImageResource(R.drawable.one);
                textView.setText("Step 1 Test");
            case "2":
                imageView.setImageResource(R.drawable.two);
                textView.setText("Step 2 Test");
            case "3":
                imageView.setImageResource(R.drawable.three);
                textView.setText("Step 3 Test");
            case "4":
                imageView.setImageResource(R.drawable.four);
                textView.setText("Step 4 Test");
            case "5":
                imageView.setImageResource(R.drawable.five);
                textView.setText("Step 5 Test");
            case "6":
                imageView.setImageResource(R.drawable.six);
                textView.setText("Step 6 Test");
            case "7":
                imageView.setImageResource(R.drawable.seven);
                textView.setText("Step 7 Test");
            case "8":
                imageView.setImageResource(R.drawable.eight);
                textView.setText("Step 8 Test");
            case "9":
                imageView.setImageResource(R.drawable.nine);
                textView.setText("Step 9 Test");
            case "10":
                imageView.setImageResource(R.drawable.ten);
                textView.setText("Step 10 Test");
            case "11":
                imageView.setImageResource(R.drawable.eleven);
                textView.setText("Step 11 Test");
            case "12":
                imageView.setImageResource(R.drawable.twelve);
                textView.setText("Step 12 Test");
        }
    }

}
