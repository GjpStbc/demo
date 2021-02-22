package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.TestEntity;
import com.example.demo.service.TestService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * @author gaojunpeng
 * @date 2021/2/3 11:12
 * @Description:
 */

@RestController
@RequestMapping("/demoproject")
public class TestController {

    @Autowired
    private TestService testService ;

    @PostMapping("/test")
    public TestEntity test(@RequestBody HashMap<String, Object> map){
        JSONObject jsonObject = new JSONObject(map);
        int id=jsonObject.getInteger("id");
        System.out.println("id:" + id);
        return testService.getById(id);
    }

}
