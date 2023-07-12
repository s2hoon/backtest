package likelion.hackerton.controller;


import likelion.hackerton.domain.Post;
import likelion.hackerton.domain.dto.PostDto;
import likelion.hackerton.repository.PostRepository;
import likelion.hackerton.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostApiController {
    private final PostRepository postRepository;
    private final PostService postService;


    //글 작성
    @PostMapping("/api/createPost")
    public Long createPost(@RequestBody PostDto postDto) {

        Long postId = postService.post(postDto.getTitle(), postDto.getContent());
        return postId;
    }

    //글 전체 조회
    @GetMapping("/api/getAllPost")
    public List<Post> getAllPost() {

        List<Post> allpost = postRepository.findAll();
        return allpost;
    }

    //글 삭제

    //글 수정

    

}
