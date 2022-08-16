package cgmgl.springcrud.app.bl.service;

import java.util.List;

import cgmgl.springcrud.app.bl.dto.PostDto;
import cgmgl.springcrud.app.persistence.entity.Post;

public interface PostService {
	List<Post> getAllPost();
	
	PostDto findById(int id);

	void createPost(PostDto postDto);
	
	void updatePost(PostDto postDto);

	void deletePost(int id);
}
