package org.java.dao;

import mybatis.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.java.pojo.Customer_Order;

@Mapper
public interface Customer_OrderMapper extends MyMapper<Customer_Order> {
}
