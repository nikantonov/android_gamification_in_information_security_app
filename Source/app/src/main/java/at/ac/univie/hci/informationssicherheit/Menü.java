package at.ac.univie.hci.informationssicherheit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Menü extends AppCompatActivity {

    static String nickname;

    public void onClick3(View v1) {
        Intent intent = new Intent(Menü.this, Glossar.class);
        startActivity(intent);
    }

    /**
     * Here we calculate the amount of coffee, that is possible to buy
     */
    public void onClick6(View v1){
        String result="";
        int how_many = 0;
        for(User u : MainActivity.users.getUsers()){
            if(u.getNickname().equals(nickname)){
                how_many = u.getPunkten() / 2;
            }
        }

        result = "                "+how_many + "\n"+"\n" + "Tasse(n) Kaffee haben Sie schon gesammelt! Gut gemacht! Kommen Sie in unsere Mensa und zeigen Sie diesen Bildschirm vor";

        Intent intent = new Intent(Menü.this, Coffee.class);
        intent.putExtra("anzahl", result);
        startActivity(intent);
    }

    /**
     * Here we calculate the rating
     */
    public void onClick4(View v1) {
        String result="";
        int size ;
        List<User> past = new ArrayList<>();
        User iterator = null;

        size = MainActivity.users.getUsers().size();
        for(User u : MainActivity.users.getUsers()){
            past.add(u);
        }
        System.out.println(MainActivity.users.getUsers().size());


        if(size != 0) {
            do {
                for (User u : past) {
                    if (iterator == null) {
                        iterator = u;
                    }

                    if (iterator.getPunkten() <= u.getPunkten()) {
                        iterator = u;
                    }
                }

                result = result + iterator.getVorname() + " " + iterator.getNachname() + " " + "Punkte: " + " " + iterator.getPunkten() + "\n";
                past.remove(iterator);

                iterator = null;
                size--;
            } while (size != 0);
        }

        Intent intent = new Intent(Menü.this, Rating.class);
        intent.putExtra("rating", result);
        startActivity(intent);
    }

    public void onClick5(View v1) {
        Intent intent = new Intent(Menü.this, Spielen.class);
        startActivity(intent);
    }

    public void onClick7(View v1) {
        Intent intent = new Intent(Menü.this, Einstellungen.class);
        startActivity(intent);
    }

    public void onClick8(View v1) {
        Intent intent = new Intent(Menü.this, Hilfe.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        nickname = getIntent().getExtras().getString("nickname");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

}
