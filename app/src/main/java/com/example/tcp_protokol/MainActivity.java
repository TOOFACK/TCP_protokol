package com.example.tcp_protokol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void Send(View view) {
        EditText passwordV = findViewById(R.id.password);
        EditText loginV = findViewById(R.id.login);
        String password = String.valueOf(passwordV.getText());
        String login = String.valueOf(loginV.getText());
        ConnectionTask connectionTask = new ConnectionTask();
        connectionTask.execute(password,login);
    }
}
