package org.java.web;

import org.java.pojo.Customer_Certificates;
import org.java.service.OrderService;
import org.java.util.InquiryOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

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

        Customer_Certificates customer_certificates=orderService.perfect_information(order_id);

        //将数据放入model
        model.addAttribute("order_id",order_id);

        model.addAttribute("customer_certificates",customer_certificates);

        return "/perfect_information";
    }

    /**
     * 跳转到确认支付页面
     */
    @RequestMapping("/payment/{order_id}")
    public String payment(@PathVariable("order_id")String order_id,Model model){
        InquiryOrder inquiryOrder = orderService.seedetailed(order_id);

        model.addAttribute("inquiryOrder",inquiryOrder);
        return "/payment";
    }

    /**
     * 用户付款成功，修改订单状态
     */
    @RequestMapping("/success")
    public String success(HttpServletRequest request){
        String order_id="";
        try {
            //获取订单号
            order_id = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //修改订单状态
        orderService.updateOrderStatus(order_id);
        return "/payment_success";
    }

}
