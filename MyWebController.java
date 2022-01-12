package study.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import study.entity.BookEntity;
import study.repostory.MyRepository;

@Controller
public class MyWebController {

	@Autowired
	MyRepository repo;
	
	
	
	@RequestMapping(method=RequestMethod.GET, path="/show")
	public String fun()
	{
		return "showbook";
	}
	
	@GetMapping("/select")
	public ModelAndView getBookByName(HttpServletRequest request)
	{
        ModelAndView mv  = new  ModelAndView();
		String bname = request.getParameter("book");
		List<BookEntity> list = repo.findByBookName(bname);
		mv.addObject("book",list);
		mv.setViewName("view");
		
		return mv;
	}
	
	
	
	

	  @PostMapping("/delete") 
	  public String deleteBook(Model model,HttpServletRequest request)
	  { 
		  String bname = request.getParameter("book"); 
	  List<BookEntity> list =  repo.findByBookName(bname);
	  
	  
	  for(BookEntity b : list) { 
		  model.addAttribute("bname",b.getBookName());
	  repo.deleteById(b.getBookId());
	  } 
	  
	  return "delete"; 
	  }
	 
	
}
