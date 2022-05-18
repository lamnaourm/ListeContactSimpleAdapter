package com.example.listecontactsimpleadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {


    ArrayList<Utilisateur> users = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        users.add(new Utilisateur(R.drawable.image1,"Nom 1","Prenom 1","email1@gmail.com","0909090909",new Date(100,3,19)));
        users.add(new Utilisateur(R.drawable.image2,"Nom 2","Prenom 2","email2@gmail.com","0776767",new Date(101,4,17)));
        users.add(new Utilisateur(R.drawable.image3,"Nom 3","Prenom 3","email3@gmail.com","565454",new Date(99,2,23)));
        users.add(new Utilisateur(R.drawable.image4,"Nom 4","Prenom 4","email4@gmail.com","232323",new Date(88,1,24)));
        users.add(new Utilisateur(R.drawable.image5,"Nom 5","Prenom 5","email5@gmail.com","32323",new Date(87,0,17)));
        users.add(new Utilisateur(R.drawable.image6,"Nom 6","Prenom 6","email6@gmail.com","323",new Date(102,9,14)));
        users.add(new Utilisateur(R.drawable.image7,"Nom 7","Prenom 7","email7@gmail.com","5334",new Date(103,11,4)));
        users.add(new Utilisateur(R.drawable.image8,"Nom 8","Prenom 7","email8@gmail.com","545454",new Date(89,10,13)));
    }
}