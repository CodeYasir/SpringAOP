package com.luv2code.aopdemo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	@Around("execution(* com.luv2code.aopdemo.service.*.getFortune(..))")	
	public Object aroundGetFortune(
			      ProceedingJoinPoint theProceedingJoinPoint) throws Throwable {
		
		// print out method we are advising on
		   String method = theProceedingJoinPoint.getSignature().toShortString();
		   System.out.println("Executing @Around on method: " + method);
		
		// get begin time
		   long begin = System.currentTimeMillis();
		
		// Now, let's execute the method
		   Object result = theProceedingJoinPoint.proceed();
		
		// get end time
		   long end = System.currentTimeMillis();
		
		// compute duration and display it
		   long duration = end - begin;
		   System.out.println("Duration: " + duration / 1000.0 + " seconds");
		
		return result;
	}

}










