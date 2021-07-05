package com.leslie.task_annotation;

/**
 * 任务属性
 *
 * 作者：xjzhao
 * 时间：2021-06-30 15:06
 */
public class TaskMeta {

    private TaskType type;
    private int priority;
    private long delayMills;
    private Class<?> cls;

    private TaskMeta(TaskType type, int priority, long delayMills, Class<?> cls) {
        this.type = type;
        this.priority = priority;
        this.delayMills = delayMills;
        this.cls = cls;
    }

    public static TaskMeta build(TaskType type, int priority, long delayMills, Class<?> cls){
        return new TaskMeta(type, priority, delayMills, cls);
    }

    public TaskType getType() {
        return type;
    }

    public int getPriority() {
        return priority;
    }

    public long getDelayMills() {
        return delayMills;
    }

    public Class<?> getCls() {
        return cls;
    }

}
