package com.cyy.MySpringBoot.spring4.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy  //必须添加  开启AOP代理
@ComponentScan("com.cyy.MySpringBootLearnDemo.ch1.aop")
public class AopConfig {

}
