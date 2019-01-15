package com.example.user.pedrapapeltesoura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pedra(View view){

        this.selecionado("1");
        //pedra 1
    }

    public void papel(View view){
        this.selecionado("2");
        //papel 2
    }
    public void tesoura(View view){
        this.selecionado("3");
        //tesoura 3
    }

    public void selecionado(int  escolhaUsuario){
        //imageView do app
        ImageView app = (ImageView)findViewById(R.id.btn5);

        String options={"pedra","papel","tesoura"};
        //gerando a escolha aleatoria do app

        int n = new Random().nextInt(3);
        //escolha app
        String escolhaApp = options[n];

        Switch (escolhaApp){
            case "pedra":
                app.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                app.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                app.setImageResource(R.drawable.tesoura);
                break;
        }
    }




    public void optionApp(){

    }


}
