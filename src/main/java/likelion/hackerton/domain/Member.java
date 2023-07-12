package likelion.hackerton.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;
    @Column
    private Long age;
    @Column
    private String username;

    @OneToMany(mappedBy = "member")
    private List<Post> post = new ArrayList<>();


}
