package br.edu.iff.pooa20181.androidproject.model;

public class Personagem {
    private int id;
    private String nome;
    private String classe;
    private String raca;
    private int nivel;



    public Personagem(){

    }

    public Personagem(int id, String nome, String  classe, String raca, int nivel)
    {
        this.id = id;
        this.nome = nome;
        this.classe = classe;
        this.raca = raca;
        this.nivel = nivel;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }


    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }




}
