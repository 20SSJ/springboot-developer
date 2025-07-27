package me.sangjunsuh.springbootdeveloper.repository;

import me.sangjunsuh.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}