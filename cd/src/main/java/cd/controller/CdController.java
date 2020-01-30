package cd.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cd.model.Cd;

@Controller
@RequestMapping("/cd")
public class CdController {
	@RequestMapping(method = RequestMethod.GET,path = "/showForm")
	public String showFormForAdd() {
		
		return "show-form";
	
	}
	@RequestMapping("/processForm")
	public String processForm(@RequestParam("title") String title,@RequestParam("cdType") String cdType,@RequestParam("date") String date,Model model) {
		
		Cd cd=new Cd(title, cdType,date);
		model.addAttribute("cd", cd);
		return "process-form";
		
	}
	
}

