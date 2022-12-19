package com.example.formulariodecadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {
    private TextView textNome;
    private TextView textIdade;
    private void IniciarComponentes() {
        textNome = findViewById(R.id.textNome);
        textIdade = findViewById(R.id.textIdade);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        // Iniciando os componentes
        IniciarComponentes();

        // Recuperando os dados enviados
        Intent intent = getIntent();
        String nome = intent.getStringExtra("nome");
        String idade = intent.getStringExtra("idade");
        textNome.setText(nome);
        textIdade.setText(idade);

    }
}