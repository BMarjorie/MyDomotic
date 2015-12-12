package com.example.utilisateur.mydomotic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Alarme_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarme_);
        ImageView alarme = (ImageView) findViewById(R.id.alarme_rouge);
        alarme.setImageResource(R.drawable.alarme);
    }

    public void return_t(View view){
        Intent intent1 = new Intent(this, MainActivity.class);
        intent1.putExtra("connection",true);
        startActivity(intent1);
    }
}
