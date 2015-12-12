package com.example.utilisateur.mydomotic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;

public class LED_activity extends AppCompatActivity {

    private Switch mySwitch;
    private ImageView lampe;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_led_activity);
        lampe = (ImageView) findViewById(R.id.ampoule);
        mySwitch = (Switch) findViewById(R.id.switch1);
        lampe.setImageResource(R.drawable.lampe_off);
        mySwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    lampe.setImageResource(R.drawable.lampe_on);
                } else {
                    lampe.setImageResource(R.drawable.lampe_off);
                }
            }
        });
    }
    public void return_t(View view){
        Intent intent1 = new Intent(this, MainActivity.class);
        intent1.putExtra("connection", true);
        startActivity(intent1);
    }
}
