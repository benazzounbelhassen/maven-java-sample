package com.infotech.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PointcutDefinition {

	@Pointcut("within(com.infotech.web..*)")
	public void webLayer() {

	}

	@Pointcut("within(com.infotech.service..*)")
	public void serviceLayer() {

	}

	@Pointcut("within(com.infotech.dao..*)")
	public void dataAccessLayer() {

	}
	
	
	@Before(value = "serviceLayer()")
	public void beforeAdvice(JoinPoint joinPoint){
		System.out.println("Before2 method:"+joinPoint.getSignature());
	}
	
	@After(value = "serviceLayer()")
	public void afterAdvice(JoinPoint joinPoint){
		System.out.println("After1 method:"+joinPoint.getSignature());
	}
	
	@AfterReturning(value = "serviceLayer()")
	public void afterReturningAdvice(JoinPoint joinPoint){
		System.out.println("AfterReturning method:"+joinPoint.getSignature());
	}
}
