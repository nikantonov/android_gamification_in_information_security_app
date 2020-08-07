package at.ac.univie.hci.informationssicherheit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Thema_1_10 extends AppCompatActivity {

    public void onClick36(View v1) {
        int punkt = 0;
        String s = "Sie haben";
            for(User u : MainActivity.users.getUsers()){
                if(u.getNickname().equals(Menü.nickname)){
                    u.setPunkten(u.getPunkten()+1);
                    punkt = u.getPunkten();
                }
            }
            Intent intent = new Intent(Thema_1_10.this, Thema_1_11.class);
            s = s+" "+punkt+" Punkten insgesamt erreicht!";
            intent.putExtra("rank", s);
            startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thema_1_10);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

}
