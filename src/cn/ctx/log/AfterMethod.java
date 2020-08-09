package cn.ctx.log;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterMethod implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] obj, Object target) throws Throwable {
		System.out.println(target.getClass().getName()+"��"+method.getName()+" ����ֵΪ"+returnValue);
	}
	
}
