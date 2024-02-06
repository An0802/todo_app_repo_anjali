package com.example.demo.service;

import java.util.List;

import com.example.demo.model.ToDo;

public interface ToDoService {
	List<ToDo> getToDoList ();
	ToDo findById (int id);
	void deleteById (int id);
	ToDo save(ToDo todo);
}
