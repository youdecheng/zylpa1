package com.zylpa.web.controller;


import com.zylpa.system.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by youdecheng on 2020/6/24.
 */
@RequestMapping("/information")
@Controller
public class informationContorller {
    @Autowired
    RestTemplate restTemplate;


    @RequestMapping("/getInfoByType")
    public String freemarker(Map<String, Object> map) {
        ResponseEntity<Map> forEntity = restTemplate.getForEntity("https://preadmin.zuiyouliao.com/api/article/getInfoByType?fCategoryId=daf4efb8fc1246349f379af785bbaf23&num=1&page=10", Map.class);


        Map body = forEntity.getBody();

        Object Object1=  body.get("other");
        System.out.println(Object1);
        //设置模型数据
       // map.putAll(map1);
       // Map body = forEntity.getBody();
        //设置模型数据
        //map.putAll(Object1);
        ArrayList<Object> informationList = new ArrayList<Object>();
        //informationList.add(Object1);
        map.put("informationList", informationList);
        return "information";
    }
}
