package com.leslie.task_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 修饰任务的注解
 *
 * 同时存在优先级和延时时间的任务，优先级自动失效
 *
 * 作者：xjzhao
 * 时间：2021-06-29 16:44
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface Task {

    /**
     * 优先级
     * @return
     */
    int priority() default Constant.DEFAULT_PRIORITY;

    /**
     * 所在线程
     * @return
     */
    TaskType thread() default TaskType.CHILD_THREAD;


    /**
     * 延时任务。注意，延时的任务是没有优先级的。
     * @return
     */
    long delayMillis() default Constant.NO_DELAY;

}
