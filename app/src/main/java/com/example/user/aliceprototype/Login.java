package com.example.user.aliceprototype;
import android.app.AlertDialog;
import android.content.Context;
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
import android.widget.ProgressBar;

import com.example.user.aliceprototype.Database.ConnectionClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Login extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        final EditText password = (EditText) findViewById(R.id.txtPassword);
        password.setTypeface(Typeface.DEFAULT);
        password.setTransformationMethod(new PasswordTransformationMethod());
        password.setHintTextColor(getResources().getColor(R.color.colorText));

        final EditText username = (EditText) findViewById(R.id.txtUsername);
        username.setHintTextColor(getResources().getColor(R.color.colorText));

        final Context context = this;

        Button btn = (Button)findViewById(R.id.btnSignUp);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String connectionString =
                        "jdbc:sqlserver:/myalice.database.windows.net,1433;" +
                                "Data Source=myalice.database.windows.net;" +
                                "Initial Catalog=AliceDatabase;" +
                                "Persist Security Info=False;" +
                                "User ID='Alice';" +
                                "Password='BITSplease1234';" +
                                "Pooling=False;" +
                                "MultipleActiveResultSets=False;" +
                                "Encrypt=True;" +
                                "TrustServerCertificate=False;" +
                                "Connection Timeout=30;";

                Connection connection = null;
                Statement statement = null;
                ResultSet resultSet = null;

                try
                {
                    connection = DriverManager.getConnection(connectionString);

                    // Create and execute a SELECT SQL statement.
                    String selectSql = "SELECT * from Users WHERE Username = " + username.getText().toString() + " AND Password = " + password.getText().toString() + ";";
                    statement = connection.createStatement();
                    resultSet = statement.executeQuery(selectSql);

                    // Print results from select statement
                    if(resultSet.next())
                    {
                        startActivity(new Intent(Login.this, Register.class));
                    }
                    else
                    {
                        username.setText("");
                        password.setText("");

                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

                        // set title
                        alertDialogBuilder.setTitle("Warning")
                        .setMessage("Incorrect Username and Password")
                        .setCancelable(true);
                    }
                    /*while (resultSet.next())
                    {
                        System.out.println(resultSet.getString(2) + " "
                                + resultSet.getString(3));
                    }*/
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
                finally
                {
                    // Close the connections after the data has been handled.
                    if (resultSet != null) try { resultSet.close(); } catch(Exception e) {}
                    if (statement != null) try { statement.close(); } catch(Exception e) {}
                    if (connection != null) try { connection.close(); } catch(Exception e) {}
                }




            }
        });


    }



}
