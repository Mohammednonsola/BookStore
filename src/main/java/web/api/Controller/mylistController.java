package web.api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.api.Entity.addEntity;
import web.api.Service.mylistService;

@Controller
public class mylistController {
@Autowired
private mylistService service;

 @RequestMapping("mybook")
 public String mybook(Model m)
 {
  List<addEntity> findall = service.findall();
  m.addAttribute("list", findall);
  return "mylist";
 }
 @RequestMapping("remove")
 public String remove(@RequestParam long id,Model m) {
	 service.deletebyid(id);
	  List<addEntity> findall = service.findall();
	  m.addAttribute("list", findall);
	  return "mylist";
 }
}
