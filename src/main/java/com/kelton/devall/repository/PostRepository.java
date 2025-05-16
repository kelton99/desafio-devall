package com.kelton.devall.repository;

import com.kelton.devall.model.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

    @Query("SELECT p.id, p.titulo, p.resumo, p.autor, p.data FROM Post p WHERE p.titulo LIKE %:termo% ORDER BY p.data DESC")
    Page<Post> searchPosts(@Param("termo") String termo, Pageable pageable);

}
