package controllerDemo;

import java.util.Scanner;

import dtoDemo.Student;
import serviceDemo.IstudentService;
import serviceFactoryDemo.StudentServiceFactory;

public class testApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			}
        
	public static void deleteOperation() {
		IstudentService studentService =StudentServiceFactory.getStudentService();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id ");
		int sid=sc.nextInt();
		String msg=studentService.deleteStudent(sid);
		 if(msg.equals("success"))
		     	System.out.println("Deletion Successful");
		 else if(msg.equalsIgnoreCase("not found"))
			 System.out.println("Record not available");
		     else {
		     System.out.println("Deletion Failed");
		     }
	}
	
	public static void selectOperation() {
		IstudentService studentService =StudentServiceFactory.getStudentService();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		 int sid=sc.nextInt();
		 Student std=studentService.searchStudent(sid);
		 
		 if(std!=null) {
			System.out.println(std);
			System.out.println(std.getSid()+"\t"+std.getsName()+"\t"+std.getsAge()+"\t"+std.getsAddress());
		 }
		 else {
			 System.out.println("Record not found");
		 }
      
	}
	
	public static void insertOperation(){
	 IstudentService studentService =StudentServiceFactory.getStudentService();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter name");
	 String name=sc.next();
	 System.out.println("Enter name");
	 int age=sc.nextInt();
	 System.out.println("Enter name");
	 String address=sc.next();
	 
     String msg=studentService.addStudent(name,age,address);
     
     if(msg.equals("success"))
     	System.out.println("Insertion Successful");
     else {
     System.out.println("Registration Failed");
        
	}

}
}