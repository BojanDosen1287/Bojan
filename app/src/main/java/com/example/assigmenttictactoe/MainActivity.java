package com.example.assigmenttictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playMethod(View view) {
        Intent intent = new Intent(this, Play.class);

        startActivity(intent);

    }

    public void aboutMethod(View view) {
        Intent intent = new Intent(this, About.class);
        startActivity(intent);

    }
}
