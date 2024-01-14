package com.example.kai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private com.example.kai.service.TaskService taskService;

    @GetMapping
    public List<com.example.kai.Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public com.example.kai.Task getTaskById(@PathVariable String id) {
        return taskService.getTaskById(id);
    }

    @PostMapping
    public com.example.kai.Task createTask(@RequestBody com.example.kai.Task task) {
        return taskService.createTask(task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable String id) {
        taskService.deleteTask(id);
    }

    @GetMapping("/findByName")
    public List<com.example.kai.Task> findTasksByName(@RequestParam String name) {
        return taskService.findTasksByName(name);
    }

    @GetMapping("/findByAssignee")
    public List<com.example.kai.Task> findTasksByAssignee(@RequestParam String assignee) {
        return taskService.findTasksByAssignee(assignee);
    }

}

