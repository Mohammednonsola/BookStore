package web.api.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.api.Entity.BookEntity;
import web.api.Repository.BookRepository;

@Service
public class BookService {
@Autowired
private BookRepository repository;
	public void save(BookEntity e) {
    repository.save(e);		
	}
	public List<BookEntity> findall() {
		 List<BookEntity> findAll = repository.findAll();
		return findAll;
	}
	public void deletebyid(long id) {
		repository.deleteById(id);
		
	}
	public  BookEntity  findbyid(long id) {
	 BookEntity find = repository.findById(id).get();
		return find;
	}
	
	
	

}
