package com.example.formulariodecadastro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowCompat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DestinoActivity extends AppCompatActivity {
    private TextView textNome;
    private TextView textIdade;
    private TextView textViewOpcaoSelecionada;
    private void IniciarComponentes() {
        textNome = findViewById(R.id.textNome);
        textIdade = findViewById(R.id.textIdade);
        textViewOpcaoSelecionada = findViewById(R.id.textViewOpcaoSelecionada);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destino);
        // Ocultando a barra de ação
        getSupportActionBar().hide();

        // Iniciando os componentes
        IniciarComponentes();

        // Colocando o aplicativo atrás das barras do sistema
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);

        // Recuperando o Intent que iniciou essa atividade
        Intent intent = getIntent();

        // Recuperando os valores dos dados extras com as respectivas chaves
        String nome = intent.getStringExtra("nome");
        String idade = intent.getStringExtra("idade");
        String opcaoRecibida = intent.getStringExtra("chave_opcao");

        // Valores sendo apresentados em outros textView dessa atividade
        textNome.setText(nome);
        textIdade.setText(idade);
        textViewOpcaoSelecionada.setText(opcaoRecibida);

    }
}