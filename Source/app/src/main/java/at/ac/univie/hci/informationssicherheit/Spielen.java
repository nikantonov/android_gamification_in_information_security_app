package at.ac.univie.hci.informationssicherheit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Spielen extends AppCompatActivity {

    public void onClick7(View v1) {
        Intent intent = new Intent(Spielen.this, Thema_2_1.class);
        startActivity(intent);
    }

    public void onClick17(View v1) {
        Intent intent = new Intent(Spielen.this, Thema_1_1.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spielen);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

}
