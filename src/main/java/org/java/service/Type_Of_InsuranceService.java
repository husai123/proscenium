package org.java.service;

import org.java.util.PageResult;
import org.java.pojo.Type_Of_Insurance;



/**
 * 险种dao
 */
public interface Type_Of_InsuranceService {


    public PageResult<Type_Of_Insurance> findAll();

}
