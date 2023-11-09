package com.fabioaacarneiro.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Frases frases = new Frases();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortSomePhrase(View view) {
        TextView text = findViewById(R.id.textResult);
        text.setText(this.frases.sortPhrase());
    }

    public void showAllPhrases(View view) {

        String textoResultado = "";
        TextView text = findViewById(R.id.textResult);

        for (String phrase : this.frases.getAllPhrases()) {
            textoResultado += phrase + "\n\n";
        }

        text.setText(textoResultado);
    }

}