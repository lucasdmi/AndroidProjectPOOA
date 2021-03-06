package pooa20181.iff.edu.br.androidprojectpooa.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;


import pooa20181.iff.edu.br.androidprojectpooa.R;
import pooa20181.iff.edu.br.androidprojectpooa.model.Personagem;


public class PersonagemAdapter extends RecyclerView.Adapter{
    private List<Personagem> personagens;
    private Context context;
    private static ClickRecyclerViewListener clickRecyclerViewListener;


    public PersonagemAdapter(List<Personagem> personagens, Context context, ClickRecyclerViewListener clickRecyclerViewListener)
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
    public void onBindViewHolder( RecyclerView.ViewHolder viewHolder, int position) {

        PersonagemViewHolder personagemHolder = (PersonagemViewHolder) viewHolder;

        Personagem personagem = this.personagens.get(position);

        personagemHolder.nomePersonagem.setText(personagem.getNome());
        personagemHolder.nivelPersonagem.setText(String.valueOf(personagem.getNivel()));
        personagemHolder.classePersonagem.setText(personagem.getClasse());
        personagemHolder.racaPersonagem.setText(personagem.getRaca());
        personagemHolder.backgroundPersonagem.setText(personagem.getBackground());

        personagemHolder.imagemPersonagem.setImageBitmap(BitmapFactory.decodeFile(personagem.getImgPath()));

        personagemHolder.nome.setText("Nome:");
        personagemHolder.classe.setText("Classe:");
        personagemHolder.raca.setText("Raça:");
        personagemHolder.nivel.setText("Nível:");




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
        private final TextView backgroundPersonagem;

        private final TextView nome, nivel, classe, raca, background;
        private final ImageView imagemPersonagem;




       public PersonagemViewHolder(View itemView) {
           super(itemView);
           nomePersonagem = (TextView) itemView.findViewById(R.id.tvNome);
           nivelPersonagem = (TextView) itemView.findViewById(R.id.tvNivel);
           classePersonagem = (TextView) itemView.findViewById(R.id.tvClasse);
           racaPersonagem = (TextView) itemView.findViewById(R.id.tvRaca);
           backgroundPersonagem = (TextView) itemView.findViewById(R.id.tvBackGround);
           imagemPersonagem = (ImageView) itemView.findViewById(R.id.ivPersonagem);

           nome = (TextView) itemView.findViewById(R.id.tNome);
           classe = (TextView) itemView.findViewById(R.id.tClasse);
           nivel = (TextView) itemView.findViewById(R.id.tNivel);
           raca = (TextView) itemView.findViewById(R.id.tRaca);
           background = (TextView) itemView.findViewById(R.id.tBG);



           itemView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                    clickRecyclerViewListener.onClick(personagens.get(getLayoutPosition()));
               }
           });


       }
   }
}
