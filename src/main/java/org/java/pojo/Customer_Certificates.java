package org.java.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CUSTOMER_CERTIFICATES")
public class Customer_Certificates {

    @Id
    @KeySql(useGeneratedKeys = true)
    private String certificates_id;//'证件编号'

    private String identity_positive;//身份证正面

    private String identity_back;//身份证反面

    private String driver_license;//驾驶证正面

    private String driver_back;//驾驶证反面

    private String front_of_driving_license;//行驶证正面

    private String front_of_driving_back;//行驶证反面

    private String order_id;//所属投保订单编号

    private String policy_id;//所属保单编号

}
