package com.kelton.devall.repository;

import com.kelton.devall.model.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends PagingAndSortingRepository<Post, Long> {

    @Query(value = "SELECT * FROM post p WHERE p.titulo LIKE %:termo% or p.resumo LIKE %:termo% ORDER BY p.data DESC")
    Page<Post> searchPosts(String termo, Pageable pageable);

    //@Query("SELECT m FROM Movie m WHERE m.title LIKE %:title%")
}
