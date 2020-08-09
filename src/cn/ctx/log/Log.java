package cn.ctx.log;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class Log implements MethodBeforeAdvice{
 public Log() {}
	@Override
	public void before(Method method, Object[] arg1, Object target) throws Throwable {
		System.out.println(target.getClass().getName()+"的"+method.getName()+"的方法");
		
	}
	
}
