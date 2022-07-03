package com.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 登录用户信息
 */
@Target(ElementType.PARAMETER)    /*被描述的注解可以用在参数中*/
@Retention(RetentionPolicy.RUNTIME)    /*运行级别的保留，编译后的class文件中存在，在jvm运行时保留，可以反射调用*/
public @interface LoginUser {

}
