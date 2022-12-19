package com.example.formulariodecadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btn_cadastrar;
    private EditText editNome;
    private EditText editIdade;
    private void IniciarComponentes() {
        btn_cadastrar = findViewById(R.id.btn_cadastrar);
        editNome = findViewById(R.id.editNome);
        editIdade = findViewById(R.id.editIdade);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Iniciando os componentes
        IniciarComponentes();

        // Adicionando evento de clique
        btn_cadastrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String idade = editIdade.getText().toString();
                String nome = editNome.getText().toString();
                Intent intent = new Intent(getApplicationContext(), Resultado.class);
                // Passando os dados
                intent.putExtra("nome", nome);
                intent.putExtra("idade", idade);
                startActivity(intent);
            }
        });

    }
}