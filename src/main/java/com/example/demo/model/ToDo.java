package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table (name = "ToDo")
@AllArgsConstructor
@NoArgsConstructor
public class ToDo {
	public ToDo(ToDoType toDoName, Boolean isCompleted, String completionDate) {
		super();
		this.toDoName = toDoName;
		this.isCompleted = isCompleted;
		this.completionDate = completionDate;
	}
	@Id
	@Column(name = "toDoId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int toDoId;
	@Column (name = "toDoName")
	private ToDoType toDoName;
	@Column (name = "isCompleted")
	Boolean isCompleted;
	@Column (name = "completionDate")
	String completionDate;
}
