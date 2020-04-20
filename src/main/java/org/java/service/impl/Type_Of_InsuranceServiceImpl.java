package org.java.service.impl;

//import org.java.enums.InsuranceEnum;
//import org.java.exception.InsuranceException;
import org.java.util.PageResult;
import org.java.dao.Type_Of_InsuranceMapper;
import org.java.pojo.Type_Of_Insurance;
import org.java.service.Type_Of_InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class Type_Of_InsuranceServiceImpl implements Type_Of_InsuranceService {

    @Autowired
    private Type_Of_InsuranceMapper typeOfInsuranceDao;


    /**
     * 封装查询数据
     * @return
     */
    @Override
    public PageResult<Type_Of_Insurance> findAll() {

        List<Type_Of_Insurance> list = typeOfInsuranceDao.selectAll();

//        if(CollectionUtils.isEmpty(list)){
//            //没有数据，返回自定义异常
//            throw new InsuranceException(InsuranceEnum.TYPE_OF_INSURANCE_LIST_No_EXISTS);
//        }

        PageResult<Type_Of_Insurance> pageResult=new PageResult<>();
        pageResult.setData(list);
        pageResult.setCode(0);//正常

        return pageResult;
    }
}
