package likelion.hackerton.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;
    @Column
    @Lob
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;


    //연관관계
    public void setMember(Member member) {
        this.member = member;
        member.getPost().add(this);
    }

    //생성
    public static Post createPost(String title, String content){
        Post post = new Post();
        post.setTitle(title);
        post.setContent(content);
        return post;
    }




}
