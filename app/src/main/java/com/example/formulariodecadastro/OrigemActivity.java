package com.example.formulariodecadastro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class OrigemActivity extends AppCompatActivity {
    private Button btn_cadastrar;
    private EditText editNome;
    private EditText editIdade;
    private RadioGroup radioGroup;
    private void IniciarComponentes() {
        btn_cadastrar = findViewById(R.id.btn_cadastrar);
        editNome = findViewById(R.id.editNome);
        editIdade = findViewById(R.id.editIdade);
        radioGroup = findViewById(R.id.radioGroup);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_origem);
        // Ocultando a barra de ação
        getSupportActionBar().hide();

        // Iniciando os componentes
        IniciarComponentes();

        // Colocando o aplicativo atrás das barras do sistema
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);

        // Adicionando evento de clique
        btn_cadastrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String idade = editIdade.getText().toString();
                String nome = editNome.getText().toString();
                // Verificando qual RadioButton está selecionado
                int radioButtonId = radioGroup.getCheckedRadioButtonId();
                RadioButton radioButtonSelecionado = findViewById(radioButtonId);

                // Criando um novo objeto intent para a próxima atividade
                Intent intent = new Intent(getApplicationContext(), DestinoActivity.class);

                if (radioButtonSelecionado != null) {
                    // Pega o texto do RadioButton selecionado
                    String opcaoSelecionada = radioButtonSelecionado.getText().toString();

                    // O processo abaixo é o mesmo processo abaixo do if
                    intent.putExtra("chave_opcao", opcaoSelecionada);
                }
                // Adicionando os valores selecionados como dados extras no Intent
                intent.putExtra("nome", nome);
                intent.putExtra("idade", idade);

                // Inicia a próxima atividade
                startActivity(intent);
            }
        });

    }
}