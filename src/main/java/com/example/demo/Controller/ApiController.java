package com.example.demo.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.Models.Student;
import com.example.demo.Repositories.StudentRepo;
import com.example.demo.Service.ApiService;
public class ApiController {
@Autowired
StudentRepo serviceRepository;
@Autowired
ApiService service;
@PutMapping("/Student")
public String update(@RequestBody Student stu)
{
	return service.updateDetails(stu);
}

@DeleteMapping("/Student")
public String delete(@RequestParam int id)
{
	return service.deleteDetails(id);
}
}
