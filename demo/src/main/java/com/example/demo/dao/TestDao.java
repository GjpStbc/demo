package com.example.demo.dao;

import com.example.demo.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;
/**
 * @author gaojunpeng
 * @date 2021/2/3 11:05
 * @Description:
 */

@Mapper
public interface TestDao {
    TestEntity getById(Integer id);
}
