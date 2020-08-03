package com.centime.annot;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LogParamAspect {
    @Before("@annotation(LogMethodParam)")
    public void logMethodParam(JoinPoint joinPoint) throws Throwable {
        Object[] signatureArgs = joinPoint.getArgs();
        for (Object signatureArg : signatureArgs) {
            log.info("{} , Arg: {} ", joinPoint.getSignature(), signatureArg);
        }
    }
}
