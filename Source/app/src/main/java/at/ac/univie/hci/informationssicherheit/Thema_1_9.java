package at.ac.univie.hci.informationssicherheit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Thema_1_9 extends AppCompatActivity {

    public void onClick27(View v1) {
        Intent intent = new Intent(Thema_1_9.this, Thema_1_10.class);
        EditText editText = findViewById(R.id.s);
        String s1 = editText.getText().toString();
        if(s1.length() > 0) {
            startActivity(intent);
        }else{
            Toast.makeText(Thema_1_9.this, "Sie haben nichts gennant", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thema_1_9);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        boolean i = getIntent().getExtras().getBoolean("bool");

        String word = "";

        if(i)
        {
            for(User u : MainActivity.users.getUsers()){
                if(u.getNickname().equals(Menü.nickname)){
                    u.setPunkten(u.getPunkten()+1);
                }
            }
            word = word+"RICHTIG!";
        }else
            word = word+"FALSCH!";

        TextView infoTextView2 = findViewById(R.id.textView9);
        infoTextView2.setText(word);


    }

}
