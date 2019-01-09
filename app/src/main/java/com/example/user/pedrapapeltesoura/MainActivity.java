package com.example.user.pedrapapeltesoura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pedra(View view){
        this.selecionado("pedra");
    }

    public void papel(View view){
        this.selecionado("papel");
    }
    public void tesoura(View view){
        this.selecionado("tesoura");
    }

    public void selecionado(String escolhaUsuario){

    }

    public void optionApp(){

    }


}
