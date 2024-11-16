package hello.repository;

import hello.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepsotiry extends JpaRepository<Article, Long> {
}
