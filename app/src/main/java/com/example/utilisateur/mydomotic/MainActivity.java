package com.example.utilisateur.mydomotic;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    protected boolean conect=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent iin= getIntent();
        Bundle b = iin.getExtras();
        if(b!=null)
        {
            conect =(boolean) b.get("connection");
            }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button bouton_led = (Button) findViewById(R.id.LED);
        Button bouton_temperature = (Button) findViewById(R.id.Temperature);
        Button bouton_door = (Button) findViewById(R.id.Door);
        Button bouton_alarme = (Button) findViewById(R.id.alarme);
        Button bouton_connexion = (Button) findViewById(R.id.button_connexion);
        if (!conect){
            bouton_led.setVisibility(View.INVISIBLE);
            bouton_temperature.setVisibility(View.INVISIBLE);
            bouton_door.setVisibility(View.INVISIBLE);
            bouton_alarme.setVisibility(View.INVISIBLE);
        }
        if (conect) {
            bouton_connexion.setVisibility(View.INVISIBLE);}

            TextView date_t = (TextView) findViewById(R.id.date_t);
            TextView heure_t = (TextView) findViewById(R.id.heure);
            Calendar c = Calendar.getInstance();
            SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            SimpleDateFormat dh = new SimpleDateFormat("HH:mm");
            String formattedDate = df.format(c.getTime());
            String formattedheure = dh.format(c.getTime());
            date_t.setText(formattedDate);
            heure_t.setText(formattedheure);

    }

    public void on_off(View view){
        Intent intent = new Intent(this, LED_activity.class);
        startActivity(intent);
    }
    public void tempe(View view){
        Intent intent_tempe = new Intent(this, Temperature_Activity.class);
        startActivity(intent_tempe);
    }
    public void login(View view){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
    public void doo(View view){
        Intent intent_doo = new Intent(this, Door_Activity.class);
        startActivity(intent_doo);
    }

    public void al(View view){
        Intent intent_al = new Intent(this, Alarme_Activity.class);
        startActivity(intent_al);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
                Intent intent2   = new Intent(this, MainActivity.class);
                intent2.putExtra("connection",false);
                startActivity(intent2);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
