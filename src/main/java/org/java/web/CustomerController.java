package org.java.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {


    @RequestMapping("/init/{html}")
    public String login(@PathVariable("html")String html){
        return html;
    }

    @RequestMapping("/load")
    public String load(){
        return "/index";
    }
}
