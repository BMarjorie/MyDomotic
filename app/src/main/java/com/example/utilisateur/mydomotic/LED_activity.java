package com.example.utilisateur.mydomotic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LED_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_led_activity);
        ImageView lampe_on = (ImageView) findViewById(R.id.ampoule);
        lampe_on.setImageResource(R.drawable.lampe);}
      //  ImageView lampe_off = (ImageView) findViewById(R.id.ampoule);

    //public void onClick(View view) {
    //    switch (view.getId()){
  // if (sw==true)
  // { }
    

    public void return_t(View view){
        Intent intent1 = new Intent(this, MainActivity.class);
        intent1.putExtra("connection", true);
        startActivity(intent1);
    }



}
