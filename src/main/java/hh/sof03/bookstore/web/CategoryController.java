package hh.sof03.bookstore.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hh.sof03.bookstore.domain.Category;
import hh.sof03.bookstore.domain.CategoryRepository;

@Controller
public class CategoryController {
	
	@Autowired
	private CategoryRepository repository;
	
	@RequestMapping("/categorylist")
	public String studentList(Model model) {
		model.addAttribute("categories", repository.findAll());
		return "categorylist";
	}
	
	@RequestMapping(value = "/addCategory")
    public String addBook(Model model){
    	model.addAttribute("category", new Category());
        return "addcategory";
    }     
	
	@RequestMapping(value = "/saveCategory", method = RequestMethod.POST)
    public String save(Category category){
        repository.save(category);
        return "redirect:categorylist";
    }    

}
