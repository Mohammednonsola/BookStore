package web.api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import web.api.Dto.BookDto;
import web.api.Entity.BookEntity;
import web.api.Entity.addEntity;
import web.api.Repository.BookRepository;
import web.api.Repository.mylistrepo;
import web.api.Service.BookService;
import web.api.Service.mylistService;

@Controller

public class BookController {
	@Autowired
	BookService service;
	@Autowired
	private mylistService mylistService;
   @RequestMapping("bookstore")
	public String view() {
		return "view";
	}

	@RequestMapping("newbook")
	public String save(BookEntity e) {
		service.save(e);
		return "view";
	}

	@RequestMapping("show")
	public String show(Model m) {
		List<BookEntity> findall = service.findall();
		m.addAttribute("show", findall);
		return "show";
	}

	@RequestMapping("delete")
   	public String Delete(@RequestParam long id,Model m) {
		service.deletebyid(id);
	        List<BookEntity> fin = service.findall();
		       m.addAttribute("show", fin);
		return "show";
	}

@RequestMapping("getbyid")
public String getbyid(Model m,@RequestParam("id") long id) {
	  BookEntity fid = service.findbyid(id);
	  m.addAttribute("f", fid);
       return "update";
}

@RequestMapping("up")
public String update(BookDto dto,Model m) {
	BookEntity find= new BookEntity();
	find.setId(dto.getId());
    find.setBook(dto.getBook());
	find.setAuthor(dto.getAuthor());
	find.setPage(dto.getPage());
	find.setPrice(dto.getPrice());
	 service.save(find);
	List<BookEntity> sh= service.findall();
	m.addAttribute("show", sh);
	return "show";
}




@RequestMapping("mylist")
public String mylist(@RequestParam long id,Model m) {
	BookEntity entity=service.findbyid(id);
	addEntity add=new addEntity();
	add.setId(entity.getId());
	add.setBook(entity.getBook());
	add.setAuthor(entity.getAuthor());
	add.setPage(entity.getPage());
	add.setPrice(entity.getPrice());
	mylistService.save(add);
	List<addEntity> sh= mylistService.findall();
	m.addAttribute("list", sh);
	return "mylist";
	
}

@RequestMapping("mb") 
public String search(Model m) {
	List<addEntity> sh= mylistService.findall();
	m.addAttribute("list", sh);
	return "mylist";
}



}
