package cgmgl.springcrud.app.web.controller;

import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cgmgl.springcrud.app.bl.dto.PostDto;
import cgmgl.springcrud.app.bl.service.PostService;
import cgmgl.springcrud.app.persistence.entity.Post;

@Controller
public class HomeController {

	@Autowired
	private PostService postService;

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String home(ModelMap model) {

		List<Post> posts = postService.getAllPost();
		if (posts != null) {
			model.addAttribute("posts", posts);
		}

		return "home";
	}
	
	@RequestMapping(value= {"/create-post"}, method = RequestMethod.GET)
	public String createPost (ModelMap model) {
		PostDto postDto = new PostDto();
		model.addAttribute("postDto", postDto);
		return "create";
	}
	
	@RequestMapping(value= {"/store-post"}, method = RequestMethod.POST)
	public String storePost (@Valid @ModelAttribute("postDto")  PostDto postDto, BindingResult errors) {
		postService.createPost(postDto); 
		if(errors.hasErrors()) {
			System.out.println("valideated");
			return "create";
		} else {
			System.out.println("validation skip");
			return "redirect:/";
		}
	}
	
	@RequestMapping(value= {"/view-post/{post}"}, method = RequestMethod.GET)
	public String viewPost (@PathVariable("post") int id, ModelMap model) {
		PostDto postDto = postService.findById(id);
		if(postDto.getBody() == null) {
			System.out.println("error page");
			return null;
		} else {
			model.addAttribute("postDto", postDto);
			System.out.println(postDto.getBody());
			return "view";			
		}
	}
	
	@RequestMapping(value= {"/edit-post/{post}"}, method = RequestMethod.GET)
	public String editPost (@PathVariable("post") int id, ModelMap model) {
		PostDto postDto = postService.findById(id);
		if(postDto.getBody() == null) {
			System.out.println("error page");
			return null;
		} else {
			model.addAttribute("postDto", postDto);
			System.out.println(postDto.getBody());
			return "edit";			
		}
	}
	
	@RequestMapping(value= {"/update-post"}, method = RequestMethod.POST)
	public String updatePost (@Valid @ModelAttribute("postDto")  PostDto postDto, BindingResult errors) {		
		postService.updatePost(postDto); 
		if(errors.hasErrors()) {
			System.out.println("valideated");
			return "create";
		} else {
			System.out.println("validation skip");
			return "redirect:/";
		}
	}
	
	@RequestMapping(value= {"/delete-post/{post}"}, method = RequestMethod.GET)
	public String updatePost (@PathVariable("post") int id, ModelMap model) {		
		postService.deletePost(id); 
			return "redirect:/";
	}
}
