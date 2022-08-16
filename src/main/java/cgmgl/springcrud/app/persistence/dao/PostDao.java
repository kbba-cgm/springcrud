package cgmgl.springcrud.app.persistence.dao;
  
import java.util.List;
  
import cgmgl.springcrud.app.persistence.entity.Post;
 
public interface PostDao { 
	List<Post> getAllPost();
  
	Post findById(int id);
  
	void createPost(Post post);
  
	void updatePost(Post post);
  
	void deletePost(int id); 
}
  
  
 