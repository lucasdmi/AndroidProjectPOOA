package br.edu.iff.pooa20181.androidproject.model;

public class Personagem {
    private int id;
    private String nome;
    private String classe;
    private String raca;
    private int nivel;
    private int forca;
    private int destreza;
    private int constituicao;
    private int inteligencia;
    private int carisma;
    private int sabedoria;
    private int experiencia;
    private int armadura;
    private String background;




    public Personagem(){

    }
    public Personagem(int id, String nome, String classe, String raca, int nivel){
        this.id = id;
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.raca = raca;

    }

    public Personagem(int id, String nome, String  classe, String raca, int nivel, int forca, int destreza,
                      int constituicao, int inteligencia, int carisma, int sabedoria, int experiencia, int armadura, String background)
    {
        this.id = id;
        this.nome = nome;
        this.classe = classe;
        this.raca = raca;
        this.nivel = nivel;
        this.armadura = armadura;
        this.background = background;
        this.carisma = carisma;
        this.constituicao = constituicao;
        this.destreza = destreza;
        this.experiencia = experiencia;
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.sabedoria = sabedoria;

    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getConstituicao() {
        return constituicao;
    }

    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public int getSabedoria() {
        return sabedoria;
    }

    public void setSabedoria(int sabedoria) {
        this.sabedoria = sabedoria;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
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
