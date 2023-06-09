package com.spring.usrdatabase.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.spring.usrdatabase.model.Students;
import com.spring.usrdatabase.repository.StudentsRepo;

@Service
public class StudentService {

	@Autowired
	private StudentsRepo studentsRepo;

	public List<Students> getAllStudent() {
		// TODO Auto-generated method stub
		return (List<Students>) studentsRepo.findAll();
	}

	public Students addStudent(Students students) {
		// TODO Auto-generated method stub
		return studentsRepo.save(students);
	}

	public Students updateStudent(String rollno, Students students) {
		// TODO Auto-generated method stub
		students.setRoll_no(rollno);
		return studentsRepo.save(students);
	}

	public String deleteStudent(String rollno) {
		// TODO Auto-generated method stub
		Optional<Students> stu = studentsRepo.findById(rollno);
		if(!stu.isEmpty()) {
			studentsRepo.deleteById(rollno);
			return "Student Record Deleted Successfull";
		}
		return "Student Record Not Found";
	}

	public List<Students> pagination(int offset, int pageSize) {
		// TODO Auto-generated method stub
		Pageable records = PageRequest.of(offset, pageSize);
		Page<Students> students = studentsRepo.findAll(records);
		return students.getContent();
	}

	public List<Students> sortBy(String feild) {
		// TODO Auto-generated method stub
		return studentsRepo.findAll(Sort.by(feild));
	}

	public List<Students> fetchStudentByNamePrefix(String prefix) {
		// TODO Auto-generated method stub
		return studentsRepo.findByNameStartingWith(prefix);
	}

	public List<Students> fetchStudentByNameSuffix(String suffix) {
		// TODO Auto-generated method stub
		return studentsRepo.findByNameEndingWith(suffix);
	}
	
	
	
	
}