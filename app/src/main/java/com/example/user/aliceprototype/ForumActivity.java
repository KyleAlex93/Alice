package com.example.user.aliceprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class ForumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_forum);

        addSpinners();
    }

    private void addSpinners()
    {
        // Spinner element
        Spinner spnForumWelcome = (Spinner) findViewById(R.id.spnForumWelcome);
        // Spinner Drop down elements
        List<String> catWelcome = new ArrayList<String>();
        catWelcome.add("News");
        catWelcome.add("Rules & FAQ's");
        catWelcome.add("Help & Suggestions");
        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, catWelcome);
        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        spnForumWelcome.setAdapter(dataAdapter);

        Spinner spnForumGeneral = (Spinner) findViewById(R.id.spnForumGeneral);
        List<String> catGeneral = new ArrayList<String>();
        catGeneral.add("Introductions");
        catGeneral.add("General Discussion");
        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, catGeneral);
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnForumGeneral.setAdapter(dataAdapter1);

        Spinner spnForumDrug = (Spinner) findViewById(R.id.spnForumDrug);
        List<String> catDrug = new ArrayList<String>();
        catDrug.add("Marijuana");
        catDrug.add("Alcohol");
        catDrug.add("Others");
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, catDrug);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnForumDrug.setAdapter(dataAdapter2);
    }
}
