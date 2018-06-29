package pooa20181.iff.edu.br.androidprojectpooa.activity;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



import io.realm.Realm;

import pooa20181.iff.edu.br.androidprojectpooa.R;
import pooa20181.iff.edu.br.androidprojectpooa.model.Personagem;

public class PersonagemDetalhe extends AppCompatActivity {

    EditText edtNome, edtClasse, edtNivel, edtRaca, edtExperiencia,
            edtCarisma, edtSabedoria, edtForca, edtDestreza, edtConstituicao, edtArmadura, edtInteligencia;

    TextInputEditText textBG;
    Button btnSalvar, btnAlterar, btnExcluir;

    int id;
    Personagem personagem;
    private Realm realm;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personagem_detalhe);


        edtNome = (EditText) findViewById(R.id.edtNome);
        edtClasse = (EditText) findViewById(R.id.edtClasse);
        edtRaca = (EditText) findViewById(R.id.edtRaca);
        edtNivel = (EditText) findViewById(R.id.edtNivel);
        edtExperiencia = (EditText) findViewById(R.id.edtExperiencia);
        edtForca = (EditText) findViewById(R.id.edtForca);
        edtConstituicao = (EditText) findViewById(R.id.edtConstituicao);
        edtCarisma = (EditText) findViewById(R.id.edtCarisma);
        edtInteligencia = (EditText) findViewById(R.id.edtInteligencia);
        edtSabedoria = (EditText) findViewById(R.id.edtSabedoria);
        edtDestreza = (EditText) findViewById(R.id.edtDestreza);
        edtArmadura = (EditText) findViewById(R.id.edtArmadura);
        textBG = (TextInputEditText) findViewById(R.id.textBG);

        btnSalvar = (Button) findViewById(R.id.btnSalvar);
        btnAlterar = (Button) findViewById(R.id.btnAlterar);
        btnExcluir = (Button) findViewById(R.id.btnExcluir);

        Intent intent = getIntent();
        id = (int) intent.getSerializableExtra("id");

        realm = Realm.getDefaultInstance();

        if (id != 0) {
            btnSalvar.setEnabled(false);
            btnSalvar.setClickable(false);
            btnSalvar.setVisibility(View.INVISIBLE);

            personagem = realm.where(Personagem.class).equalTo("id", id).findFirst();

            edtNome.setText(personagem.getNome());
            edtClasse.setText(personagem.getClasse());
            edtRaca.setText(personagem.getRaca());
            edtNivel.setText(personagem.getNivel());
            edtForca.setText(personagem.getForca());
            edtArmadura.setText(personagem.getArmadura());
            edtDestreza.setText(personagem.getDestreza());
            edtSabedoria.setText(personagem.getSabedoria());
            edtInteligencia.setText(personagem.getInteligencia());
            edtCarisma.setText(personagem.getCarisma());
            edtConstituicao.setText(personagem.getConstituicao());
            edtExperiencia.setText(personagem.getExperiencia());
            textBG.setText(personagem.getBackground());
        } else {
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
            btnAlterar.setClickable(false);
            btnExcluir.setClickable(false);
            btnAlterar.setVisibility(View.INVISIBLE);
            btnExcluir.setVisibility(View.INVISIBLE);

        }


        btnSalvar.setOnClickListener( new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                salvar();
            }
        });

        btnAlterar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alterar();
            }
        });

        btnExcluir.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                excluir();
            }
        });

    }

    public void salvar(){

        int proximoID = 1;
        if(realm.where(Personagem.class).max("id") != null)
        {
            proximoID = realm.where(Personagem.class).max("id").intValue()+1;
        }

        realm.beginTransaction();
        Personagem personagem = new Personagem();
        personagem.setId(proximoID);
        setarEgravar(personagem);


        realm.copyToRealm(personagem);
        realm.commitTransaction();
        realm.close();

        Toast.makeText(this,"Personagem Cadastrado", Toast.LENGTH_LONG).show();
        this.finish();

    }

    public void alterar(){
        realm.beginTransaction();

        setarEgravar(personagem);

        realm.copyFromRealm(personagem);

        realm.commitTransaction();
        realm.close();

        Toast.makeText(this,"Personagem Alterado", Toast.LENGTH_LONG).show();
        this.finish();
    }
    public void excluir()
    {
        realm.beginTransaction();
        personagem.deleteFromRealm();
        realm.commitTransaction();
        realm.close();

        Toast.makeText(this,"Personagem Excluido", Toast.LENGTH_LONG).show();
        this.finish();
    }

    public void setarEgravar(Personagem personagem)
    {
        Log.i("msg", "teste salvar");

        personagem.setNome(edtNome.getText().toString());
        personagem.setClasse(edtClasse.getText().toString());
        personagem.setRaca(edtRaca.getText().toString());
        personagem.setNivel(edtNivel.getText().toString());

        personagem.setForca(edtForca.getText().toString());
        personagem.setArmadura(edtArmadura.getText().toString());
        personagem.setDestreza(edtDestreza.getText().toString());
        personagem.setSabedoria(edtSabedoria.getText().toString());
        personagem.setInteligencia(edtInteligencia.getText().toString());
        personagem.setCarisma(edtCarisma.getText().toString());
        personagem.setConstituicao(edtConstituicao.getText().toString());
        personagem.setExperiencia(edtExperiencia.getText().toString());
        personagem.setBackground(textBG.getText().toString());


    }
}
