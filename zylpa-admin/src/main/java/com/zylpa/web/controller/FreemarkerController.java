package com.zylpa.web.controller;


import com.zylpa.system.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

/**
 * Created by youdecheng on 2020/6/22.
 */
@RequestMapping("/freemarker")
@Controller
public class FreemarkerController {


    /* @RequestMapping("/banner")
     public String index_banner(Map<String, Object> map){
         //使用restTemplate请求轮播图的模型数据
         ResponseEntity<Map> forEntity = restTemplate.getForEntity("http://localhost:31001/cms/config/getmodel/5a791725dd573c3574ee333f", Map.class);
         Map body = forEntity.getBody();
         //设置模型数据
         map.putAll(body);
         return "index_banner";
     }*/
    @RequestMapping("/test2")
    public String freemarker(Map<String, Object> map) {
        //向数据模型放数据
        map.put("name", "最有料");
        Student stu1 = new Student();
        stu1.setName("小明");

        stu1.setAge(18);
        stu1.setMondy(1000.86f);
        stu1.setBirthday(new Date());
        Student stu2 = new Student();
        stu2.setName("小红");
        stu2.setMondy(200.1f);
        stu2.setAge(19);
//        stu2.setBirthday(new Date());
        List<Student> friends = new ArrayList<Student>();
        friends.add(stu1);
        stu2.setFriends(friends);
        stu2.setBestFriend(stu1);
        List<Student> stus = new ArrayList<Student>();
        stus.add(stu1);
        stus.add(stu2);
        //向数据模型放数据
        map.put("stus", stus);
        //准备map数据
        HashMap<String, Student> stuMap = new HashMap<String, Student>();
        stuMap.put("stu1", stu1);
        stuMap.put("stu2", stu2);
        //向数据模型放数据
        map.put("stu1", stu1);
        //向数据模型放数据
        map.put("stuMap", stuMap);
        System.out.println("--->1");
        //返回模板文件名称*/
        return "test";
    }
}
