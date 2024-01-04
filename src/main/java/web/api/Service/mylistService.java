package web.api.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.api.Entity.addEntity;
import web.api.Repository.mylistrepo;
@Service
public class mylistService {
	@Autowired
	private mylistrepo myrepo;
	
	

	public void save(addEntity add) {
		myrepo.save(add);
	}

	public List<addEntity>  findall() {
		List<addEntity>   find = myrepo.findAll();
	    return find;
	}

	public void deletebyid(long id) {
		myrepo.deleteById(id);
		
	}
	
}
