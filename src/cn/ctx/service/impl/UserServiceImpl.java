package cn.ctx.service.impl;

import cn.ctx.service.UserService;

public class UserServiceImpl implements UserService{
	
	public UserServiceImpl() {}

	@Override
	public void add(int a) {
		System.out.println("���ӷ���");
	}

	@Override
	public void delete() {
		System.out.println("ɾ������");
	}

	@Override
	public void update() {
		System.out.println("���·���");
	}

	@Override
	public void search() {
		System.out.println("��ѯ����");
	}

}
