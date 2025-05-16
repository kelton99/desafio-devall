package com.kelton.devall.model;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;


@Entity
@Table(name = "clicks")
public class Acesso {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="post_id", referencedColumnName = "id", nullable=false)
    private Post post;

    private Instant data;

    public Acesso() { }

    public Acesso(Post post, Instant data) {
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

    public Instant getData() {
        return data;
    }

    public void setData(Instant data) {
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
