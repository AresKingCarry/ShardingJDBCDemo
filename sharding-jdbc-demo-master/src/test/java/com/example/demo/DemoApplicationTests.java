package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.example.demo.entity.UserInfo;
import com.example.demo.mapper.UserInfoMapper;
import com.example.demo.service.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Resource
	UserInfoMapper userInfoMaper;

	@Resource
	DemoService demoService;

	@Test
	public void contextLoads() {
//		DateFormat dateFormat;
//		dateFormat = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");//设定格式
//		Date date = null;
//		try {
//			date = dateFormat.parse("2018-04-17 12:00:00");
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		Timestamp timestamp  = new Timestamp(date.getTime());
//		Long time = timestamp.getTime();
//		System.out.println(time);
		demoService.demo();
	}

	@Test
	public void getUserInfoByUserId(){
		UserInfo userInfoByUserId = demoService.getUserInfoByUserId(181l);
		System.out.println("得到的结果为："+JSON.toJSON( userInfoByUserId));
	}




}
