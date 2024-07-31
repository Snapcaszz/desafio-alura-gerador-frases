package br.com.alura.geradorFrases.Model.dto;

import br.com.alura.geradorFrases.Model.Frase;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class FraseDto {
    private String titulo;
    private String frase;
    private String personagem;
    private String poster;

    public FraseDto(){}

    public FraseDto(Frase frase){
        this.titulo = frase.getTitulo();
        this.frase = frase.getFrase();
        this.personagem = frase.getPersonagem();
        this.poster = frase.getPoster();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getPersonagem() {
        return personagem;
    }

    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
}
