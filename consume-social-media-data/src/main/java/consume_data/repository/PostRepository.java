package consume_data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import consume_data.entity.Post;




@Repository
public interface PostRepository  extends MongoRepository<Post, String> {

}
