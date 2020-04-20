package org.java.web;


import org.java.util.PageResult;
import org.java.util.JsonUtils;
import org.java.pojo.Type_Of_Insurance_Item;
import org.java.service.OrderService;
import org.java.util.InquiryOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 订单控制器类
 */
@RestController
@RequestMapping("/insuanceOrder")
public class OrderRestController {

    @Autowired
    private OrderService orderService;



    /**
     * 获取创建订单需要的信息
     */
    @PostMapping("/createOrder")
    public ResponseEntity<String> createOrder(@RequestParam Map map){
        String orderId = orderService.createOrder(map);

        return ResponseEntity.ok(orderId);
    }


    /**
     * 根据  客户编号  查询所有该客户的询价订单
     * 订单的状态为：0：待提交，1：待报价 ，2：待完善，3：待支付
     */
    @GetMapping("/inquiryList/{cust_id}")
    public ResponseEntity<PageResult<InquiryOrder>> queryInquiry(
                                                @PathVariable("cust_id")String cust_id,
                                                @RequestParam("page")Integer page,
                                                @RequestParam("limit")Integer limit
                                                ){
        System.out.println("查询询价订单集合************");
        List list=new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("0");
        PageResult<InquiryOrder> pageResult = orderService.queryInquiry(cust_id,page,limit,list);
        return ResponseEntity.status(HttpStatus.OK).body(pageResult);
    }


    /**
     * 提交订单询价
     * 工作流向前推进一步 进入报价员报价
     */
    @PostMapping("/submit_inquiry/{order_id}")
    public ResponseEntity<Void> submit_inquiry(@PathVariable("order_id")String order_id){
        orderService.submit_inquiry(order_id);
        return ResponseEntity.ok(null);
    }

    /**
     * 根据  客户编号  查询所有该客户的询价订单
     * 订单的状态为：
     * 保险订单
     * 	2.待完善
     * 		查看详细
     * 		完善资料
     * 		关闭交易
     * 	3.待支付
     * 		查看详细
     * 		立即支付
     * 	4.待审核
     * 		查看详细
     * 	5.审核不通过
     * 		查看详细
     * 		完善资料
     * 		关闭交易
     * 	6.交易成功
     * 		查看详细
     * 	7.已取消
     * 		查看详细
     * 	8.退款中
     * 		查看详细
     * 	9.已退款
     * 		查看详细
     */
    @GetMapping("/insuranceList/{cust_id}")
    public ResponseEntity<PageResult<InquiryOrder>> insuranceList(
            @PathVariable("cust_id")String cust_id,
            @RequestParam("page")Integer page,
            @RequestParam("limit")Integer limit
    ){
        System.out.println("查询保险订单集合************");

        List list=new ArrayList();
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        PageResult<InquiryOrder> pageResult = orderService.queryInquiry(cust_id,page,limit,list);
        return ResponseEntity.status(HttpStatus.OK).body(pageResult);
    }


    /**
     * 提交订单询价
     * 工作流向前推进一步 进入报价员报价
     */
    @PostMapping("/close_transaction/{order_id}")
    public ResponseEntity<Void> close_transaction(@PathVariable("order_id")String order_id){
        orderService.close_transaction(order_id);
        return ResponseEntity.ok(null);
    }


}
