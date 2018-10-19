package Model;

import java.io.Serializable;

/**
 *
 * @author Victor
 */
public class Musica implements Serializable{
    private int id;
    private String nome;
    private int ano;
    private String letra;
    private String artista;

    public Musica(int id, String nome, String artista,int ano, String letra) {
        this.id = id;
        this.nome = nome;
        this.ano = ano;
        this.letra = letra;
        this.artista = artista;
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
