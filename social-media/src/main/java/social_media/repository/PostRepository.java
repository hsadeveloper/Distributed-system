package social_media.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import social_media.entity.Post;


@Repository
public interface PostRepository  extends MongoRepository<Post, String> {

}
