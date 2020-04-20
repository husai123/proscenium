package org.java.service;

import org.java.util.InquiryOrder;
import org.java.util.PageResult;

import java.util.List;
import java.util.Map;

public interface OrderService {

    public String createOrder(Map map);

    public PageResult<InquiryOrder> queryInquiry(String cust_id, Integer page, Integer limit, List list);

    public void submit_inquiry(String order_id);

    public InquiryOrder seedetailed(String orderId);

    public void close_transaction(String order_id);
}
