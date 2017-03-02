package indi.daniel.demomvc;

import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  
  
@Controller  
public class GeneralController {  
  
    @RequestMapping(value = "/index")  
    public String home(Model model){  
        model.addAttribute("hello", "Hello world!");  
        System.out.println("index");  
        return "index.jsp";
    }  
    
    @RequestMapping(value = "/")  
    public String console(){ 
       System.out.println("lalala");  
       return "index.jsp";
   }  
}  