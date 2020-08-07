package at.ac.univie.hci.informationssicherheit;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Thema_1_8 extends AppCompatActivity {

    public void onClick25(View v1) {
        Intent intent = new Intent(Thema_1_8.this, Thema_1_9.class);
        boolean i = true;
        intent.putExtra("bool", i);
        startActivity(intent);
    }

    public void onClick26(View v1) {
        Intent intent = new Intent(Thema_1_8.this, Thema_1_9.class);
        boolean i = false;
        intent.putExtra("bool", i);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thema_1_8);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

}
