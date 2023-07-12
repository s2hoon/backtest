package likelion.hackerton.service;

import likelion.hackerton.domain.Post;
import likelion.hackerton.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class PostService {

    private final PostRepository postRepository;
    
    //글작성
    public Long post(String title, String content) {
        Post post = Post.createPost(content, title);
        postRepository.save(post);
        return post.getId();
    }

    //글전체조회
    public List<Post> getAllPost(){
        return postRepository.findAll();
    }

    //글삭제
    
    
    //글수정

    
}
