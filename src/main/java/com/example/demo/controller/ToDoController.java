package com.example.demo.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ToDo;
import com.example.demo.service.ToDoService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/todo")
public class ToDoController {
	
	private final ToDoService todoService;
	@GetMapping
	public ResponseEntity<?> getToDoList (){
		return ResponseEntity.status(HttpStatus.OK).body(todoService.getToDoList());
	}
	
	@GetMapping("/{toDoId}")
	public ResponseEntity<?> findById (@PathVariable int id){
		return ResponseEntity.status(HttpStatus.OK).body(todoService.findById(id));
	}
	
	@DeleteMapping("/{toDoId}")
	public void deleteById (@PathVariable int id) {
		todoService.deleteById(id);
	}
	
	@PostMapping
	public ResponseEntity<?> save (@RequestBody ToDo todo){
		return ResponseEntity.status(HttpStatus.CREATED).body(todoService.save(todo));
	}
	
	
}
