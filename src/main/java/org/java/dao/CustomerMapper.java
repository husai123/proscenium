package org.java.dao;

import mybatis.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.java.pojo.Customer;

@Mapper
public interface CustomerMapper extends MyMapper<Customer> {

    /**
     * 根据编号获取数据
     * @param cust_id
     * @return
     */
    public Customer findById(String cust_id);

}
