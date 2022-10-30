package com.greatlearning.collegefest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatlearning.collegefest.model.Student;
import com.greatlearning.collegefest.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {

	@Autowired
	StudentService studentServ;

	@GetMapping("/list")
	public String listStudents(Model model1) {

		List<Student> students = studentServ.findAll();
		
		//System.out.println(students.get(0).getFirstName());

		model1.addAttribute("students", students);

		return "list-students";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model2) {

		Student student1 = new Student();
		model2.addAttribute("student", student1);

		return "student-form";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("studentId") int id, Model model3) {

		Student student2 = studentServ.findById(id);
		model3.addAttribute("student", student2);

		return "student-form";
	}

	@PostMapping("/save")
	public String saveStudent(@RequestParam("id") int id, @RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName, @RequestParam("course") String course,
			@RequestParam("country") String country) {

		Student student3;

		if (id != 0) {
			student3 = studentServ.findById(id);

			student3.setFirstName(firstName);
			student3.setLastName(lastName);
			student3.setCourse(course);
			student3.setCountry(country);
		} else {
			student3 = new Student(firstName, lastName, course, country);
		}

		studentServ.saveStudent(student3);

		return "redirect:/students/list";
	}

	@RequestMapping("/delete")
	public String deleteStudent(@RequestParam("studentId") int id) {

		studentServ.deleteById(id);

		return "redirect:/students/list";
	}
}
