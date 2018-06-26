package br.edu.iff.pooa20181.androidproject.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import br.edu.iff.pooa20181.androidproject.activity.ListaPersonagem;
import br.edu.iff.pooa20181.androidproject.model.Personagem;
import pooa20181.iff.edu.br.androidprojectpooa.R;

public class PersonagemAdapter extends RecyclerView.Adapter{
    private List<Personagem> personagens;
    private Context context;
    private static ClickRecyclerViewListener clickRecyclerViewListener;


    public PersonagemAdapter(List<Personagem> personagens, ListaPersonagem recyclerViewListener, ClickRecyclerViewListener clickRecyclerViewListener)
    {
            this.personagens = personagens;
            this.context = context;
            this.clickRecyclerViewListener = clickRecyclerViewListener;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(context).inflate(R.layout.item_personagem_cv, parent, false);
        PersonagemViewHolder personagemViewHolder = new PersonagemViewHolder(view);
        return personagemViewHolder;
    }



    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        PersonagemViewHolder personagemViewHolder = (PersonagemViewHolder) viewHolder;

        Personagem personagem = this.personagens.get(position);
        personagemViewHolder.nomePersonagem.setText(personagem.getNome());
        personagemViewHolder.nivelPersonagem.setText(personagem.getNivel());
        personagemViewHolder.classePersonagem.setText(personagem.getClasse());
        personagemViewHolder.racaPersonagem.setText(personagem.getRaca());
    }

    @Override
    public int getItemCount() {
        return personagens.size();
    }


    public class PersonagemViewHolder extends RecyclerView.ViewHolder{

        private final TextView nomePersonagem;
        private final TextView nivelPersonagem;
        private final TextView classePersonagem;
        private final TextView racaPersonagem;

       public PersonagemViewHolder(View itemView) {
           super(itemView);
           nomePersonagem = (TextView) itemView.findViewById(R.id.tvNome);
           nivelPersonagem = (TextView) itemView.findViewById(R.id.tvNivel);
           classePersonagem = (TextView) itemView.findViewById(R.id.tvClasse);
           racaPersonagem = (TextView) itemView.findViewById(R.id.tvRaca);

           itemView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                    clickRecyclerViewListener.onClick(personagens.get(getLayoutPosition()));
               }
           });


       }
   }




}
