package br.edu.iff.pooa20181.androidproject.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import pooa20181.iff.edu.br.androidprojectpooa.R;

public class Principal extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private String[] activities = {"ListaPersonagem"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, activities);

                ListView listView = (ListView) findViewById(R.id.listaMenu);
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(this);

    }


    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        Intent intent = null;

                      try {
                          Class obj = Class.forName ("br.edu.iff.pooa20181.androidproject.activity."+activities[position]);
                               intent = new Intent(this, obj);

                      } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                        }

                        startActivity(intent);

    }
}
