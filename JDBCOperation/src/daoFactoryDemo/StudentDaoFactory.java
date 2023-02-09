package daoFactoryDemo;

import persistanceDemo.IStudentDao;
import persistanceDemo.StudentDaoImpl;



public class StudentDaoFactory {

	
	
	private StudentDaoFactory() {
		
	}
	
	private static IStudentDao studentDao=null;
	
	public static IStudentDao getStudentdao() {
		studentDao = new StudentDaoImpl();
		
		return studentDao;
	}
	
}
