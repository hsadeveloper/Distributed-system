package social_media.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import social_media.entity.Post;
import social_media.repository.PostRepository;

@RestController
@RequestMapping("/v1/post")
public class PostController {

  
    private PostRepository postRepository;
    
    

    public PostController(PostRepository postRepository) {
		super();
		this.postRepository = postRepository;
	}



	@PostMapping("/signup")
    public String addPost(@RequestBody Post post) {
        System.out.println("Inside post controller");
        postRepository.save(post);
        return "success";
    }
}
