package serviceFactoryDemo;

import serviceDemo.IstudentService;
import serviceDemo.StudentServiceImpl;


public class StudentServiceFactory {

	
	private StudentServiceFactory() {
		
	};
	
	private static IstudentService studentService=null;
	
	public static IstudentService getStudentService() {
		
		if(studentService == null)
			studentService = new StudentServiceImpl();
	
	
	return studentService;
	}
}
