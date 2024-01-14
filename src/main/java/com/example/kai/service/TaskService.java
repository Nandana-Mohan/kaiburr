package com.example.kai.service;

import com.example.kai.Task;
import com.example.kai.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Random;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTaskById(String id) {
        return taskRepository.findById(id).orElse(null);
    }

    public Task createTask(Task task) {
        // Generate rajeshSinghProperty here
        task.setRajeshSinghProperty(generateRajeshSinghProperty());
        return taskRepository.save(task);
    }

    public void deleteTask(String id) {
        taskRepository.deleteById(id);
    }

    public List<Task> findTasksByName(String name) {
        return taskRepository.findByNameContaining(name);
    }

    public List<Task> findTasksByAssignee(String assignee) {
        return taskRepository.findByAssigneeOrderByStartTime(assignee);
    }
    public List<Task> findFirst10TasksByAssignee(String assignee) {
        return taskRepository.findTop10ByAssigneeOrderByStartTime(assignee);
    }

    private String generateRajeshSinghProperty() {
        String candidateName = "RajeshSingh";
        int nameLength = candidateName.length();
        int propertyLength = 5;

        StringBuilder generatedProperty = new StringBuilder();

        // Use a Random object to select 5 random characters from the candidateName
        Random random = new Random();
        for (int i = 0; i < propertyLength; i++) {
            int randomIndex = random.nextInt(nameLength);
            generatedProperty.append(candidateName.charAt(randomIndex));
        }

        return generatedProperty.toString();
    }
}
