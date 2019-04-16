package com.groot.hospital.common.log.aspect;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author chimh
 * @version V1.0
 * @Description: 请求日志记录
 * @date 下午
 */
@Aspect
@Component
@Slf4j
public class HttpAspect {

    private final ObjectMapper mapper;

    @Autowired
    public HttpAspect(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    //定义切点
    @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void log() {
    }
    //记录入参参数
    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest httpServletRequest = attributes.getRequest();
        log.info("url={},method={},class_method={},args={}", httpServletRequest.getRequestURL(),httpServletRequest.getMethod(),joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName(), joinPoint.getArgs());
    }
    //记录返回值
    @AfterReturning(returning = "object", pointcut = "log()")
    public void doAfterReturning(Object object) {
        log.info("response={}", object.toString());
    }
}

