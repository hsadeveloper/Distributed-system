package consume_data.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import consume_data.entity.Post;
import consume_data.repository.PostRepository;



@Configuration
public class StartupDataLoader {

    @Bean
    public CommandLineRunner loadPosts(PostRepository postRepository) {
        return args -> {
            postRepository.save(new Post("user123", "First post!", "Excited to join", 10));
            postRepository.save(new Post("user456", "Hello world", "No comments yet", 5));
            postRepository.save(new Post("user789", "Spring Boot rocks", "Agreed!", 20));
            System.out.println("Posts saved on startup.");
        };
    }
}
