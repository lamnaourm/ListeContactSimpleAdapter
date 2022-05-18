package com.example.listecontactsimpleadapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {


    ArrayList<Utilisateur> users = new ArrayList<>();
    ListView lst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        users.add(new Utilisateur(R.drawable.image1, "Nom 1", "Prenom 1", "email1@gmail.com", "0909090909", new Date(100, 3, 19)));
        users.add(new Utilisateur(R.drawable.image2, "Nom 2", "Prenom 2", "email2@gmail.com", "0776767", new Date(101, 4, 17)));
        users.add(new Utilisateur(R.drawable.image3, "Nom 3", "Prenom 3", "email3@gmail.com", "565454", new Date(99, 2, 23)));
        users.add(new Utilisateur(R.drawable.image4, "Nom 4", "Prenom 4", "email4@gmail.com", "232323", new Date(88, 1, 24)));
        users.add(new Utilisateur(R.drawable.image5, "Nom 5", "Prenom 5", "email5@gmail.com", "32323", new Date(87, 0, 17)));
        users.add(new Utilisateur(R.drawable.image6, "Nom 6", "Prenom 6", "email6@gmail.com", "323", new Date(102, 9, 14)));
        users.add(new Utilisateur(R.drawable.image7, "Nom 7", "Prenom 7", "email7@gmail.com", "5334", new Date(103, 11, 4)));
        users.add(new Utilisateur(R.drawable.image8, "Nom 8", "Prenom 7", "email8@gmail.com", "545454", new Date(89, 10, 13)));

        lst = findViewById(R.id.lst);

        ArrayList<HashMap<String, Object>> list_items = new ArrayList<>();

        for (Utilisateur u : users) {
            HashMap<String, Object> it = new HashMap<>();
            it.put("image", u.getImage());
            it.put("nom", u.getNom());
            it.put("prenom", u.getPrenom());
            list_items.add(it);
        }

        String[] from = {"nom", "image", "prenom"};
        int[] to = {R.id.nomUser, R.id.imageUser, R.id.prenomUser};

        SimpleAdapter ad = new SimpleAdapter(this, list_items, R.layout.user_item, from, to);
        lst.setAdapter(ad);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                Utilisateur u = users.get(pos);

                Intent i = new Intent(MainActivity.this,DetailUser.class);
                i.putExtra("user",u);
                startActivity(i);
            }
        });

    }
}