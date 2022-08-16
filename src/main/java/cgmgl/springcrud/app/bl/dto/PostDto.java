package cgmgl.springcrud.app.bl.dto;

import java.sql.Timestamp;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import cgmgl.springcrud.app.persistence.entity.Post;

public class PostDto {

	private int id;
	
	@NotEmpty
	private String title;
	
	@NotEmpty
	@Size(max = 1, message = "required")
	private String body;
	
	private Timestamp created_at;
	
	private Timestamp updated_at;

	public PostDto() {
		super();
	}

	public PostDto(Post post){
		if (post == null) {
			post = new Post();
		}
		id = post.getId();
		title = post.getTitle();
		body = post.getBody();
		created_at = post.getCreatedAt();
		updated_at = post.getCreatedAt();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Timestamp getCreatedAt() {
		return created_at;
	}

	public void setCreatedAt(Timestamp created_at) {
		this.created_at = created_at;
	}

	public Timestamp getUpdatedAt() {
		return updated_at;
	}

	public void setUpdatedAt(Timestamp updated_at) {
		this.updated_at = updated_at;
	}

}
