package at.ac.univie.hci.informationssicherheit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Thema_2_7 extends AppCompatActivity {
    String your_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thema_2_7);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    public void onClick14(View v1) {
        EditText et = findViewById(R.id.password3);
        your_password = et.getText().toString();
        if(your_password.length() >= 15){
            for(User u : MainActivity.users.getUsers()){
                if(u.getNickname().equals(Menü.nickname)){
                    u.setPunkten(u.getPunkten()+1);
                }
            }
            Intent intent = new Intent(Thema_2_7.this, Thema_2_8.class);
            startActivity(intent);
        }else{
            Toast.makeText(Thema_2_7.this, "Password is too small", Toast.LENGTH_LONG).show();
        }

    }

}
