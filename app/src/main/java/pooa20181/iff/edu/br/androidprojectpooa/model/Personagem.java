package pooa20181.iff.edu.br.androidprojectpooa.model;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Personagem extends RealmObject implements Serializable{

    @PrimaryKey
    private int id;
    private String nome;
    private String classe;
    private String raca;
    private String nivel;
    private String forca;
    private String destreza;
    private String constituicao;
    private String inteligencia;
    private String carisma;
    private String sabedoria;
    private String experiencia;
    private String armadura;
    private String background;

    private String imgPath;

    public Personagem(){
    }


    public Personagem(int id, String nome, String classe, String raca, String nivel, String imgPath){

        this.id = id;
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.raca = raca;
        this.imgPath = imgPath;

    }

    public Personagem(int id, String nome, String  classe, String raca, String nivel, String forca, String destreza,
                      String constituicao, String inteligencia, String carisma, String sabedoria, String experiencia, String armadura, String background, String imgPath)
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
        this.imgPath = imgPath;

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

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getForca() {
        return forca;
    }

    public void setForca(String forca) {
        this.forca = forca;
    }

    public String getDestreza() {
        return destreza;
    }

    public void setDestreza(String destreza) {
        this.destreza = destreza;
    }

    public String getConstituicao() {
        return constituicao;
    }

    public void setConstituicao(String constituicao) {
        this.constituicao = constituicao;
    }

    public String getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(String inteligencia) {
        this.inteligencia = inteligencia;
    }

    public String getCarisma() {
        return carisma;
    }

    public void setCarisma(String carisma) {
        this.carisma = carisma;
    }

    public String getSabedoria() {
        return sabedoria;
    }

    public void setSabedoria(String sabedoria) {
        this.sabedoria = sabedoria;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getArmadura() {
        return armadura;
    }

    public void setArmadura(String armadura) {
        this.armadura = armadura;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }



}
