package com.example.listecontactsimpleadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;

public class DetailUser extends AppCompatActivity {

    ImageView image;
    TextView tnom, tprenom, ttel, tmail, tdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_user);

        Utilisateur user = (Utilisateur)getIntent().getExtras().get("user");
        image = findViewById(R.id.dimage);
        tnom = findViewById(R.id.nom);
        tprenom = findViewById(R.id.prenom);
        ttel = findViewById(R.id.tel);
        tmail = findViewById(R.id.email);
        tdate = findViewById(R.id.date);

        image.setImageResource(user.getImage());
        tnom.setText("Nom : " + user.getNom());
        tprenom.setText("Prenom : " + user.getPrenom());
        ttel.setText("Tel : " + user.getTel());
        tmail.setText("Email  : " + user.getEmail());
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        tdate.setText("Date Naissance : " + f.format(user.getDatenaissance()));


    }
}