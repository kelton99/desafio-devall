package com.kelton.devall.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "clicks")
public class Acesso {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="post_id", referencedColumnName = "id", nullable=false)
    private Post post;

    private Date data;

    public Acesso() { }

    public Acesso(Post post, Date data) {
        this.post = post;
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Acesso acesso = (Acesso) o;
        return Objects.equals(id, acesso.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
