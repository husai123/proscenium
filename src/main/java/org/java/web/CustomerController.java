package org.java.web;

import com.sun.deploy.net.URLEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;

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


    @RequestMapping("/offer/{insurance_offer}")
    public String offer(@RequestParam Map map,
                        Model model,
                        @PathVariable("insurance_offer")String insurance_offer){
//        System.out.println(car_transfer);

        if (map.get("car_transfer")==null){
            map.put("car_transfer",0);
        }

        System.out.println(map);
        model.addAttribute("userInsurance",map);
        return insurance_offer;
    }


    @RequestMapping("/personal")
    public String personal(){
        return "/personal";
    }
    @RequestMapping("/personalInfo")
    public String personalInfo(){
        return "/personalInfo";
    }
    @RequestMapping("/zhuti")
    public String zhuti(){
        return "/zhuti";
    }
    @RequestMapping("/updatePwd")
    public String updatePwd(){
        return "/updatePwd";
    }
    @RequestMapping("/updateInfo")
    public String updateInfo(){
        return "/updateInfo";
    }

}
