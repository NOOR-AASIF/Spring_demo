package SecondMVCProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import SecondMVCProject.Service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/getMami",method=RequestMethod.GET)
	@ResponseBody  // convert java object to json object
	public String getStudent()
	{
		return studentService.getStudent();
	}

}
