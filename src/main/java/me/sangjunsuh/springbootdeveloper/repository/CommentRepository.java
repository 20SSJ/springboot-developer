package me.sangjunsuh.springbootdeveloper.repository;

import me.sangjunsuh.springbootdeveloper.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
