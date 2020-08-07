package at.ac.univie.hci.informationssicherheit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    static UsersRepository users = new UsersRepository();

    public static UsersRepository getUsers() {
        return users;
    }

    /**
     * Here we proof the login nickname and password
     *
     */
    public void onClick1(View v1) {
        EditText EditText1 = findViewById(R.id.text1);
        EditText EditText2 = findViewById(R.id.text2);
        String s1 = EditText1.getText().toString();
        String s2 = EditText2.getText().toString();

        boolean proof1 = false;
        for(User u : users.getUsers()){
            if(u.getNickname().equals(s1)){
                if(u.getPassword().equals(s2)){
                    proof1 = true;
                }
            }
        }
        if(proof1 == true) {
            final Intent intent = new Intent(MainActivity.this, Menü.class);
            intent.putExtra("nickname", EditText1.getText().toString());

            //AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            //builder.setCancelable(false);
            //builder.setTitle("Tipp des Tages");
            // builder.setMessage("Die meisten Angestellten senden waehrend der Arbeit viele E-Mails. Beim Eingeben der Empfaengeradresse braucht man nur einen einzigen Fehler, zu machen, um sensible Daten an die falsche Person zu senden.");

            //builder.setNeutralButton("OK", new DialogInterface.OnClickListener() {
               // @Override
                //public void onClick(DialogInterface dialog, int which) {
                    startActivity(intent);
               // }
            //});

        }else{
            Toast.makeText(MainActivity.this, "False password or nickname", Toast.LENGTH_LONG).show();
        }
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
