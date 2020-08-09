package cn.ctx.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ctx.service.UserService;

public class Test {
	public static void main(String args[]) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		UserService us = (UserService) ac.getBean("userService");
		us.add(1);
	}
}
