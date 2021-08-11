package com.pure.rose.aop;

import com.pure.rose.entity.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class StudentAspect {

    @Pointcut("execution(* com.pure.rose.service.UtilService.perform(..))")
    public void onPerformance() {

    }

    @Around("onPerformance()")
    public void intercept(ProceedingJoinPoint jp) {
        System.out.println("====================================== AOP interceptor Start ============================");
        if (jp.getArgs()[0] instanceof Student) {
            Student s = (Student) jp.getArgs()[0];
            try {
                jp.proceed();
            } catch (Throwable throwable) {
                s.setStatus("AOP");
                System.err.println(throwable.getMessage());
            }
        }
        System.out.println("====================================== AOP interceptor End ============================");
    }
}
