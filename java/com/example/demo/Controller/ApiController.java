package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.Service.ApiService;

@RestController
public class ApiController {
	
	@Autowired
	ApiService aser;
	
	@PostMapping("add")
	public List<Student> add(@RequestBody List<Student> s) {
		return aser.saveinfo(s);
	}
	
	@GetMapping("so")
	public List<Student> show(){
		return aser.showinfo();
	}
	
	@PutMapping("update")
	public Student modify(@RequestBody Student s) {
		return aser.changeinfo(s);
	}
	
	@DeleteMapping("delete")
	public String del(@RequestBody Student s) {
		aser.deleteinfo(s);
		return "Deleted";
	}
	
}