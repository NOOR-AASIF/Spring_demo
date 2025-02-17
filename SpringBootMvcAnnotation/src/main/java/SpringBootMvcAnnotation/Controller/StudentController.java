package SpringBootMvcAnnotation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/getStudent",method=RequestMethod.GET)
	@ResponseBody
	public String getStudent()
	{
		return studentService.getStudent();
	}
	
	@RequestMapping(value="/getAllStudent",method=RequestMethod.GET)
	@ResponseBody
	public List<String> getAllStudent()
	{
		List<String>students= studentService.getAllStudent();
		return students;
	}

}
