package SpringBootMvcAnnotation.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService
{
	public String getStudent()
	{
		return "Student 1";
	}
	
	public List<String> getAllStudent()
	{
		List<String>students=new ArrayList<String>();
		students.add("Student 1");
		students.add("Student 2");
		students.add("Student 3");
		students.add("Student 4");
		
		return students;
	}

}
