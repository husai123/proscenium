package org.java.dao;

import mybatis.MyMapper;
import org.java.pojo.Customer_Certificates;

public interface Customer_CertificatesMapper extends MyMapper<Customer_Certificates> {

    public Customer_Certificates findByOrderId(String order_id);

}
