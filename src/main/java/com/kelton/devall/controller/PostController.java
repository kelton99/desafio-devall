package com.kelton.devall.controller;

import com.kelton.devall.model.Acesso;
import com.kelton.devall.model.Post;
import com.kelton.devall.repository.AcessoRepository;
import com.kelton.devall.repository.PostRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;

@RestController
public class PostController {

    private final PostRepository postRepository;
    private final AcessoRepository acessoRepository;

    public PostController(PostRepository postRepository, AcessoRepository acessoRepository) {
        this.postRepository = postRepository;
        this.acessoRepository = acessoRepository;
    }

    //TODO
    @GetMapping("/api/v2/post")
    public ResponseEntity<Page<Post>> searchPosts(
            @RequestParam(defaultValue = "") String termo,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "3") int size) {
        final Pageable pageable = PageRequest.of(page, size);
        pageable.
        final Page<Post> posts = this.postRepository.searchPosts(termo, pageable);
        return ResponseEntity.ok(posts);
    }

    @PostMapping("post/clique/{id}")
    public ResponseEntity<String> acessarPost(@PathVariable(name = "id") Integer postId) {
        return this.postRepository.findById(postId).map(post -> {
            this.acessoRepository.save(new Acesso(post, Instant.now()));
            return ResponseEntity.ok(post.getUrl());
        }).orElse(
                ResponseEntity.badRequest().build()
        );
    }
}
