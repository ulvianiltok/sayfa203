package com.ulvianil.uygulama10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Asker asker;
    public Tankci tankci;
    public Topcu topcu;
    String mesaj="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        asker=new Asker();
        tankci=new Tankci();
        topcu=new Topcu();
        TextView textViewMesaj=findViewById(R.id.textViewMesaj);
        Button buttonAsker=findViewById(R.id.buttonAsker);
        Button buttonTankci=findViewById(R.id.buttonTankci);
        Button buttonTopcu=findViewById(R.id.buttonTopcu);

        buttonAsker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mesaj=asker.atesEt();
                textViewMesaj.setText(mesaj);
            }
        });
        buttonTankci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mesaj=tankci.atesEt();
                textViewMesaj.setText(mesaj);
            }
        });
        buttonTopcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mesaj=topcu.atesEt();
                textViewMesaj.setText(mesaj);
            }
        });

    }
}