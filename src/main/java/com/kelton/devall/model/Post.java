package com.kelton.devall.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "posts")
public class Post implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private String resumo;
    private String autor;
    private String url;
    private Instant data;

    public Post() { }

    public Post(Integer id, String titulo, String resumo, String autor, String url, Instant data) {
        this.id = id;
        this.titulo = titulo;
        this.resumo = resumo;
        this.url = url;
        this.autor = autor;
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Instant getData() {
        return data;
    }

    public void setData(Instant data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(id, post.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
