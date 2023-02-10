package controllerDemo;

import dtoDemo.Student;
import serviceDemo.IstudentService;
import serviceFactoryDemo.StudentServiceFactory;

public class testApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 IstudentService studentService =StudentServiceFactory.getStudentService();
		 int sid=1;
		 Student std=studentService.searchStudent(sid);
		 
		 if(std!=null) {
			System.out.println(std);
			System.out.println(std.getSid()+"\t"+std.getsName()+"\t"+std.getsAge()+std.getsAddress());
		 }
		 else {
			 System.out.println("Record not found");
		 }
       
        }
	
	public static void insertOperation(){
	 IstudentService studentService =StudentServiceFactory.getStudentService();
     String msg=studentService.addStudent("sachin",49,"MI");
     
     if(msg.equals("success"))
     	System.out.println("Insertion Successful");
     else {
     System.out.println("Registration Failed");
        
	}

}
}