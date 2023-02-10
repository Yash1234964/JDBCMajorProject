package controllerDemo;

import serviceDemo.IstudentService;
import serviceFactoryDemo.StudentServiceFactory;

public class testApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        IstudentService studentService =StudentServiceFactory.getStudentService();
        String msg=studentService.addStudent("sachin",49,"MI");
        
        if(msg.equals("success"))
        	System.out.println("Insertion Successful");
        else {
        System.out.println("Registration Failed");
        }
        
	}

}
