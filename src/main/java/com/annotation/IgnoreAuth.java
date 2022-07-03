package com.annotation;

import java.lang.annotation.*;

/**
 * 忽略Token验证
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented     /*修饰的注解，只负责标记*/
public @interface IgnoreAuth {

}
