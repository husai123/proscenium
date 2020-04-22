package org.java.util;


import org.java.pojo.Type_Of_Insurance;
import org.java.pojo.Type_Of_Insurance_Item;

/**
 * 险种信息表
 */
public class InsuranceItem {

    private String item_id;//'险种项编号'

    private String insurance_id;//'险种编号，对应险种表的编号'

    private Double premium;//'保费'

    private Double insured_amount;//'保额'

    private String order_id;//所属投保订单，对应投保订单表的编号

    private String policy_id;//所属保单，对应保单表的编号

    private String is_no_deductible;//是否不计免赔：是: 1,否: 0

    private String insurance_name;//'险种名称'


    public InsuranceItem(Type_Of_Insurance type_of_insurance, Type_Of_Insurance_Item type_of_insurance_item) {
        this.item_id = type_of_insurance_item.getItem_id();
        this.insurance_id = type_of_insurance_item.getInsurance_id();
        this.premium = type_of_insurance_item.getPremium();
        this.insured_amount = type_of_insurance_item.getInsured_amount();
        this.order_id = type_of_insurance_item.getOrder_id();
        this.policy_id = type_of_insurance_item.getPolicy_id();
        this.is_no_deductible = type_of_insurance_item.getIs_no_deductible();
        this.insurance_name = type_of_insurance.getInsurance_name();
    }

    @Override
    public String toString() {
        return "InsuranceItem{" +
                "item_id='" + item_id + '\'' +
                ", insurance_id='" + insurance_id + '\'' +
                ", premium=" + premium +
                ", insured_amount=" + insured_amount +
                ", order_id='" + order_id + '\'' +
                ", policy_id='" + policy_id + '\'' +
                ", is_no_deductible='" + is_no_deductible + '\'' +
                ", insurance_name='" + insurance_name + '\'' +
                '}';
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }


    public String getInsurance_id() {
        return insurance_id;
    }

    public void setInsurance_id(String insurance_id) {
        this.insurance_id = insurance_id;
    }

    public Double getPremium() {
        return premium;
    }

    public void setPremium(Double premium) {
        this.premium = premium;
    }

    public Double getInsured_amount() {
        return insured_amount;
    }

    public void setInsured_amount(Double insured_amount) {
        this.insured_amount = insured_amount;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getPolicy_id() {
        return policy_id;
    }

    public void setPolicy_id(String policy_id) {
        this.policy_id = policy_id;
    }

    public String getIs_no_deductible() {
        return is_no_deductible;
    }

    public void setIs_no_deductible(String is_no_deductible) {
        this.is_no_deductible = is_no_deductible;
    }

    public String getInsurance_name() {
        return insurance_name;
    }

    public void setInsurance_name(String insurance_name) {
        this.insurance_name = insurance_name;
    }
}
