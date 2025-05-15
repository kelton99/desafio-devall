package com.kelton.devall.controller;

import com.kelton.devall.model.Post;
import com.kelton.devall.repository.AcessoRepository;
import com.kelton.devall.repository.PostRepository;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    private final PostRepository postRepository;
    private final AcessoRepository acessoRepository;

    public PostController(PostRepository postRepository, AcessoRepository acessoRepository) {
        this.postRepository = postRepository;
        this.acessoRepository = acessoRepository;
    }

    //TODO
    @GetMapping()
    public ResponseEntity<Page<Post>> searchPosts(@PathVariable String termo) {
        return null;
    }

    @PostMapping()
    public ResponseEntity<?> acessarPost(@PathVariable Long id) {

        return null;
    }
}
