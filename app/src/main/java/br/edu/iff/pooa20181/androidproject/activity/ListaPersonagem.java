package br.edu.iff.pooa20181.androidproject.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import br.edu.iff.pooa20181.androidproject.adapter.ClickRecyclerViewListener;
import br.edu.iff.pooa20181.androidproject.adapter.PersonagemAdapter;
import br.edu.iff.pooa20181.androidproject.model.Personagem;
import pooa20181.iff.edu.br.androidprojectpooa.R;

public class ListaPersonagem extends AppCompatActivity implements ClickRecyclerViewListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_personagem);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvPersonagens);
        recyclerView.setAdapter(new PersonagemAdapter(getPersonagens(), this, this));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }



    public List<Personagem> getPersonagens(){
        List<Personagem> personagens = new ArrayList<Personagem>();
        int i = 0;

        for(i=0;i<20;i++)
        {
            String iv = String.valueOf(i);
            Personagem personagem =  new Personagem(i, "nome" .concat(iv), "classe" .concat(iv), "raca" .concat(iv),i);
            personagens.add(personagem);
        }

        return personagens;
    }

    @Override
    public void onClick(Object object) {
        Personagem personagem = (Personagem) object;
        Intent intent = new Intent(ListaPersonagem.this, PersonagemDetalhe.class);
        intent.putExtra("nome", personagem.getNome());
        intent.putExtra("classe", personagem.getClasse());
        intent.putExtra("raca", personagem.getRaca());
        intent.putExtra("nivel", personagem.getNivel());
        startActivity(intent);
    }
}
