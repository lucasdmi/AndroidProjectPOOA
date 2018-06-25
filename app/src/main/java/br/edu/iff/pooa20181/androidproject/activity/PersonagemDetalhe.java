package br.edu.iff.pooa20181.androidproject.activity;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import pooa20181.iff.edu.br.androidprojectpooa.R;

public class PersonagemDetalhe extends AppCompatActivity {

    EditText edtNome, edtClasse, edtNivel, edtRaca, edtExperiencia,
            edtCarisma, edtSabedoria, edtForca, edtDestreza, edtConstituicao, edtArmadura, edtInteligencia;

    TextInputEditText textBG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personagem_detalhe);

        edtNome = (EditText)findViewById(R.id.edtNome);
        edtClasse = (EditText)findViewById(R.id.edtClasse);
        edtRaca = (EditText) findViewById(R.id.edtRaca);
        edtNivel = (EditText)findViewById(R.id.edtNivel);
        edtExperiencia = (EditText)findViewById(R.id.edtExperiencia);
        edtForca = (EditText)findViewById(R.id.edtForca);
        edtConstituicao = (EditText)findViewById(R.id.edtConstituicao);
        edtCarisma = (EditText)findViewById(R.id.edtCarisma);
        edtInteligencia = (EditText)findViewById(R.id.edtInteligencia);
        edtSabedoria = (EditText)findViewById(R.id.edtSabedoria);
        edtDestreza = (EditText)findViewById(R.id.edtDestreza);
        edtArmadura = (EditText)findViewById(R.id.edtArmadura);

        textBG = (TextInputEditText)findViewById(R.id.textBG);

        Intent intent = getIntent();
        edtNome.setText((String) intent.getSerializableExtra("nome"));
        edtClasse.setText((String) intent.getSerializableExtra("Classe"));
        edtRaca.setText((String) intent.getSerializableExtra("Raca"));
        edtNivel.setText((Integer) intent.getSerializableExtra("Nivel"));

    }
}
