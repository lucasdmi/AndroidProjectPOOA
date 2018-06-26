package pooa20181.iff.edu.br.androidprojectpooa.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;



import java.util.List;

import pooa20181.iff.edu.br.androidprojectpooa.R;
import pooa20181.iff.edu.br.androidprojectpooa.adapter.ClickRecyclerViewListener;
import pooa20181.iff.edu.br.androidprojectpooa.adapter.PersonagemAdapter;
import pooa20181.iff.edu.br.androidprojectpooa.model.Personagem;
import io.realm.Realm;


public class ListaPersonagem extends AppCompatActivity implements ClickRecyclerViewListener {

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
                Intent intent = new Intent(ListaPersonagem.this, PersonagemDetalhe.class);
                intent.putExtra("id", 0);
                startActivity(intent);
            }
        });


    }
        protected void onResume(){
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
