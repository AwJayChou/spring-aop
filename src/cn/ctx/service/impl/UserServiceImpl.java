package cn.ctx.service.impl;

import cn.ctx.service.UserService;

public class UserServiceImpl implements UserService{
	
	public UserServiceImpl() {}

	@Override
	public void add(int a) {
		System.out.println("增加方法");
	}

	@Override
	public void delete() {
		System.out.println("删除方法");
	}

	@Override
	public void update() {
		System.out.println("更新方法");
	}

	@Override
	public void search() {
		System.out.println("查询方法");
	}

}
