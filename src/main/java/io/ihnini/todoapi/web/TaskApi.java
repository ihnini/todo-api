package io.ihnini.todoapi.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.ihnini.todoapi.core.Task;
import io.ihnini.todoapi.core.TaskRepository;

@RestController
@RequestMapping("/tasks")
public class TaskApi {
    @Autowired
    private TaskRepository taskRepository;

    @GetMapping
    public ResponseEntity<List<Task>> all() {
        final List<Task> result = new ArrayList<>();
        taskRepository.findAll()
            .forEach(result::add);
        return ResponseEntity.ok(result);
    }
}
