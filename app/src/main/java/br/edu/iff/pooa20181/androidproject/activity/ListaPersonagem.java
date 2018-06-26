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
import io.realm.Realm;
import pooa20181.iff.edu.br.androidprojectpooa.R;

public class ListaPersonagem extends AppCompatActivity implements ClickRecyclerViewListener{
    private Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_personagem);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        realm = Realm.getDefaultInstance();
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListaPersonagem.this, Personagem.class);
                intent.putExtra("id", 0);
                startActivity(intent);
            }
        });


    }
        public void onResume(){
            super.onResume();

            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvPersonagens);
            recyclerView.setAdapter(new PersonagemAdapter(getPersonagens(), this, this));

            recyclerView.setLayoutManager(new LinearLayoutManager(this));

        }



    public List<Personagem> getPersonagens(){

        return (List) realm.where(Personagem.class).findAll();
    }

    @Override
    public void onClick(Object object) {
        Personagem personagem = (Personagem) object;
        Intent intent = new Intent(ListaPersonagem.this, PersonagemDetalhe.class);
        intent.putExtra("id", personagem.getId());
        startActivity(intent);
    }

    public void finish()
    {
        super.finish();
        realm.close();
    }
}
