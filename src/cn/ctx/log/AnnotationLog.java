package cn.ctx.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author Administrator
 * 使用注解进行横切
 */
@Aspect
public class AnnotationLog {
//	@Before("execution(* cn.ctx.service.impl.*.*(..))")
//	public void before() {
//		System.out.println("-------  方法执行前 ------------");
//	}
//	@After("execution(* cn.ctx.service.impl.*.*(..))")
//	public void after() {
//		System.out.println("------- 方法执行后----------------");
//	}
	@Around("execution(* cn.ctx.service.impl.*.*(..))")
	public void around(ProceedingJoinPoint pj) throws Throwable {
		System.out.println("before");
		System.out.println(pj.getSignature());
		pj.proceed(); // 方法执行
		
		
		System.out.println("after");
	}
}
