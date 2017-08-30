package com.cao.bean;

/**
 * Created by Administrator on 2017/8/25.
 */
public class Task {
    private Integer id;

    private String taskName;

    private String taskDec;

    private String taskLimit;

    public String getTaskLimit() {
        return taskLimit;
    }

    public void setTaskLimit(String taskLimit) {
        this.taskLimit = taskLimit;
    }

    public String getTaskDec() {

        return taskDec;
    }

    public void setTaskDec(String taskDec) {
        this.taskDec = taskDec;
    }

    public String getTaskName() {

        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", taskName='" + taskName + '\'' +
                ", taskDec='" + taskDec + '\'' +
                ", taskLimit='" + taskLimit + '\'' +
                '}';
    }
}
