package cn.ctx.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author Administrator
 * ʹ��ע����к���
 */
@Aspect
public class AnnotationLog {
//	@Before("execution(* cn.ctx.service.impl.*.*(..))")
//	public void before() {
//		System.out.println("-------  ����ִ��ǰ ------------");
//	}
//	@After("execution(* cn.ctx.service.impl.*.*(..))")
//	public void after() {
//		System.out.println("------- ����ִ�к�----------------");
//	}
	@Around("execution(* cn.ctx.service.impl.*.*(..))")
	public void around(ProceedingJoinPoint pj) throws Throwable {
		System.out.println("before");
		System.out.println(pj.getSignature());
		pj.proceed(); // ����ִ��
		
		
		System.out.println("after");
	}
}
