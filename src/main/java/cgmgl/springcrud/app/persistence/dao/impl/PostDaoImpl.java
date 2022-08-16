
package cgmgl.springcrud.app.persistence.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cgmgl.springcrud.app.persistence.dao.AbstractDao;
import cgmgl.springcrud.app.persistence.dao.PostDao;
import cgmgl.springcrud.app.persistence.entity.Post;

@Repository
public class PostDaoImpl extends AbstractDao<Long, Post> implements PostDao {

	public List<Post> getAllPost() {

		return createQuery("From Post").getResultList();
		
	}

	public Post findById(int id) {
		return getById(id);
	}

	public void createPost(Post post) {
		create(post);
	}

	public void updatePost(Post post) {
		update(post);
	}

	public void deletePost(int id) {
		deleteById(id);
	}

}
