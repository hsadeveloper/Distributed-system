package consume_data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import consume_data.entity.Post;
import consume_data.repository.PostRepository;



@RestController
@RequestMapping("/v1/post")
public class PostController {

  
    private PostRepository postRepository;
    
    

    public PostController(PostRepository postRepository) {
		super();
		this.postRepository = postRepository;
	}

	@GetMapping("/")
    public List<Post> getAllPost() {
		return postRepository.findAll() ;
       
    }
}
