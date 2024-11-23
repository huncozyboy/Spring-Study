package hello.service;

import hello.repository.BlogRepository;
import hello.domain.Article;
import hello.dto.AddArticleRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {
    private final BlogRepository blogRepository;
    //블로그 서비스
    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
