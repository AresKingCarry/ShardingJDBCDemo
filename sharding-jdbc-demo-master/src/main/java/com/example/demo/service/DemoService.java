package com.example.demo.service;


import com.example.demo.entity.UserInfo;
import com.example.demo.mapper.UserInfoMapper;
import groovy.util.logging.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class DemoService {

    @Resource
    UserInfoMapper userInfoMapper;

    public static Long userId = 190L;

    public void demo() {
        System.out.println("Insert--------------");

        for (int i = 1; i <= 100; i++) {
            UserInfo userInfo = new UserInfo();
            userInfo.setUserId(userId);
            userInfo.setAccount("Account" + i);
            userInfo.setPassword("pass" + i);
            userInfo.setUserName("name" + i);
            userId++;
//            if(i==3){
//                HintManagerHolder.clear();
//                HintManager hintManager = HintManager.getInstance();
////                hintManager.addDatabaseShardingValue("user_info", "user_id", 3L);
//                hintManager.addTableShardingValue("user_info", "user_id", 3L);
//                System.out.println(userId);
//            }
            userInfoMapper.insert(userInfo);
        }
        System.out.println("over..........");
    }

    public UserInfo getUserInfoByUserId(Long id){
       return userInfoMapper.selectByPrimaryKey(id);
    }
}
