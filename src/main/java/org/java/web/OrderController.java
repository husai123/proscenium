package org.java.web;

import org.java.service.OrderService;
import org.java.util.InquiryOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/orderJump")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 根据订单编号查看订单详细
     */
    @GetMapping("/init/detailed/{orderId}")
    public String detailed(@PathVariable("orderId") String orderId, Model model){
        InquiryOrder inquiryOrder = orderService.seedetailed(orderId);

        model.addAttribute("inquiryOrder",inquiryOrder);

        return "/detailed";
    }

    /**
     * 跳转到完善资料页面
     * @param order_id
     * @param model
     * @return
     */
    @GetMapping("/init/perfect_information/{order_id}")
    public String perfect_information(@PathVariable("order_id")String order_id,Model model){
        model.addAttribute("order_id",order_id);
        return "/perfect_information";
    }

}
