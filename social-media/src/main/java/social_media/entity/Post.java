package social_media.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "posts")
public class Post {
	
	@Id
	private String userId;
	private String content;
	private String comment;
	private int likes;
	
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Post(String userId, String content, String comment, int likes) {
		super();
		this.userId = userId;
		this.content = content;
		this.comment = comment;
		this.likes = likes;
	}

	public String getUserId() {
		return userId;
	}

	public String getContent() {
		return content;
	}

	public String getComment() {
		return comment;
	}

	public int getLikes() {
		return likes;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}
	
}
