package indi.daniel.tempchat.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
   public static final int DEFAULT_TOPICS_PER_PAGE = 25;
   
   @RequestMapping({"/", "/home"})
   public String showHomePage(Map<String, Object> model){
      return "home";
   }

}
