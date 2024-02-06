package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.ToDo;
import com.example.demo.repo.ToDoRepo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ToDoServiceImpl implements ToDoService {
	private final ToDoRepo todorepo;

	@Override
	public ToDo save(ToDo todo) {
		// TODO Auto-generated method stub
		return todorepo.save(todo);
		
	}

	@Override
	public List<ToDo> getToDoList() {
		// TODO Auto-generated method stub
		return todorepo.findAll();
	}

	@Override
	public ToDo findById(int id) {
		// TODO Auto-generated method stub
		return todorepo.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		todorepo.deleteById(id);
	}

	
	
}
