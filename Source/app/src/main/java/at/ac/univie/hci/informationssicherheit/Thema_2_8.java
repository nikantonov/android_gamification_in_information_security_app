package at.ac.univie.hci.informationssicherheit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Thema_2_8 extends AppCompatActivity {
    String your_password,s = "Sie haben";
    int punkt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thema_2_8);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    public void onClick15(View v1) {
        EditText et = findViewById(R.id.password5);
        your_password = et.getText().toString();
        if(your_password.length() >= 6){
            for(User u : MainActivity.users.getUsers()){
                if(u.getNickname().equals(Menü.nickname)){
                    u.setPunkten(u.getPunkten()+1);
                    punkt = u.getPunkten();
                }
            }
            Intent intent = new Intent(Thema_2_8.this, Thema_2_9.class);
            s = s+" "+punkt+" Punkten insgesamt erreicht!";
            intent.putExtra("rank", s);
            startActivity(intent);
        }else{
            Toast.makeText(Thema_2_8.this, "Password is too small", Toast.LENGTH_LONG).show();
        }

    }

}
