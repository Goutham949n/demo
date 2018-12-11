package com.web.awstest.awstest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/")
    public String getIndexPage(ModelMap m) {
        return "index.html";
    }

}
