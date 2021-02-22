package com.example.demo.service;

import com.example.demo.dao.TestDao;
import com.example.demo.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author gaojunpeng
 * @date 2021/2/3 11:10
 * @Description:
 */

@Service
public class TestService {
    @Autowired
    private TestDao testDao ;

    public TestEntity getById(Integer id){
        return testDao.getById(id);
    }

}
