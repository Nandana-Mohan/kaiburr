package com.example.kai.repository;
import com.example.kai.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface TaskRepository extends MongoRepository<com.example.kai.Task, String> {
    List<com.example.kai.Task> findByNameContaining(String name);
    List<com.example.kai.Task> findByAssigneeOrderByStartTime(String assignee);
    List<Task> findTop10ByAssigneeOrderByStartTime(String assignee);
}
