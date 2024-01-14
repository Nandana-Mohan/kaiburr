package com.example.kai;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Task {
    @Id
    private String id;
    private String name;
    private String assignee;
    private String project;
    private Date startTime;
    private String rajeshSinghProperty;

    // Constructors

    public Task() {
        // Default constructor
    }

    public Task(String name, String assignee, String project, Date startTime, String rajeshSinghProperty) {
        this.name = name;
        this.assignee = assignee;
        this.project = project;
        this.startTime = startTime;
        this.rajeshSinghProperty = rajeshSinghProperty;
    }

    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getRajeshSinghProperty() {
        return rajeshSinghProperty;
    }

    public void setRajeshSinghProperty(String rajeshSinghProperty) {
        this.rajeshSinghProperty = rajeshSinghProperty;
    }

    // You can override toString() method for better logging/debugging representation
    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", assignee='" + assignee + '\'' +
                ", project='" + project + '\'' +
                ", startTime=" + startTime +
                ", rajeshSinghProperty='" + rajeshSinghProperty + '\'' +
                '}';
    }
}
