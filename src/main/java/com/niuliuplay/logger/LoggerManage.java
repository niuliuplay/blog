package com.niuliuplay.logger;

import java.lang.annotation.*;


@Target(ElementType.METHOD)  
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LoggerManage {

	String description();
}
