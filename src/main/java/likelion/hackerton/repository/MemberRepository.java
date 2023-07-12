package likelion.hackerton.repository;

import jakarta.persistence.Id;
import likelion.hackerton.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}



