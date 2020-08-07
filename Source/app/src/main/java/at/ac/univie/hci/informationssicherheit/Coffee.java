package at.ac.univie.hci.informationssicherheit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class Coffee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaffee);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        String word = getIntent().getExtras().getString("anzahl");

        TextView infoTextView2 = findViewById(R.id.coffeeview);
        infoTextView2.setText(word);
    }

}
