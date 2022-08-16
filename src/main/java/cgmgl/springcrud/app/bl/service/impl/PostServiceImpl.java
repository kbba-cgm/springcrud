
package cgmgl.springcrud.app.bl.service.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cgmgl.springcrud.app.bl.dto.PostDto;
import cgmgl.springcrud.app.bl.service.PostService;
import cgmgl.springcrud.app.persistence.dao.PostDao;
import cgmgl.springcrud.app.persistence.entity.Post;

@Transactional
@Service("postService")
public class PostServiceImpl implements PostService {

	@Autowired
	private PostDao postDao;

	private Timestamp now = new Timestamp(new Date().getTime());

	public List<Post> getAllPost() {
		return postDao.getAllPost();
	}

	public PostDto findById(int id) {
		return new PostDto(postDao.findById(id));
	}

	public void createPost(PostDto postDto) {
		postDto.setCreatedAt(now);
		postDto.setUpdatedAt(now);
		postDao.createPost(getPostData(postDto));
	}

	public void updatePost(PostDto postDto) {
		postDto.setUpdatedAt(now);
		postDao.updatePost(getPostData(postDto));
	}

	public void deletePost(int id) {
		postDao.deletePost(id);
	}

	private Post getPostData(PostDto postDto) {
		Post post = new Post();
		post.setId(postDto.getId());
		post.setBody(postDto.getBody());
		post.setTitle(postDto.getTitle());
		post.setCreatedAt(postDto.getCreatedAt());
		post.setUpdatedAt(postDto.getUpdatedAt());

		return post;
	}

}
