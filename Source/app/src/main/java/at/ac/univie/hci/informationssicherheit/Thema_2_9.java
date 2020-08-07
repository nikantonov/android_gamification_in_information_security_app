package at.ac.univie.hci.informationssicherheit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Thema_2_9 extends AppCompatActivity {

    public void onClick40(View v1) {
        final Intent intent = new Intent(Thema_2_9.this, Menü.class);
        intent.putExtra("nickname", Menü.nickname);

        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thema_2_9);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String word = getIntent().getExtras().getString("rank");

        TextView infoTextView = (TextView)findViewById(R.id.textView5);
        infoTextView.setText(word);

    }

}
