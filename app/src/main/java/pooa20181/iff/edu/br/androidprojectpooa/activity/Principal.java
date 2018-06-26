package pooa20181.iff.edu.br.androidprojectpooa.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;



import pooa20181.iff.edu.br.androidprojectpooa.R;


public class Principal extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private String[] activities = {"ListaPersonagem"};
    private String[] itemMenu = {"Personagem"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itemMenu);

                ListView listView = (ListView) findViewById(R.id.listaMenu);
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(this);

    }


    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

        Log.i("msg", "entrou");
        Intent intent = null;

                      try {
                          Class obj = Class.forName ("pooa20181.iff.edu.br.androidprojectpooa.activity." + activities[position]);


                      } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }

        Log.i("msg", "clique lista");
                    intent = new Intent(this, ListaPersonagem.class);
        Log.i("msg", "chamando 2 tela");
                        startActivity(intent);
        Log.i("msg", "olá");

    }
}
