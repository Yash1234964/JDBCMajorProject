package serviceDemo;

import daoFactoryDemo.StudentDaoFactory;
import dtoDemo.Student;
import persistanceDemo.IStudentDao;
import serviceFactoryDemo.StudentServiceFactory;

public class StudentServiceImpl implements IstudentService {

	 private IStudentDao stdDao;
	
	@Override
	public String addStudent(String sName, Integer sAge, String sAddress) {
		// TODO Auto-generated method stub
		
		stdDao = StudentDaoFactory.getStudentdao();
		if(stdDao !=null)
		return stdDao.addStudent(sName, sAge, sAddress);
		
		return "failure";
	}

	@Override
	public Student searchStudent(Integer sid) {
		// TODO Auto-generated method stub
		stdDao=StudentDaoFactory.getStudentdao();
		return stdDao.searchStudent(sid);
	}

	@Override
	public String updateStudent(Integer sid, String sName, Integer sAge, String aAddress) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStudent(Integer sid) {
		// TODO Auto-generated method stub
		return null;
	}

}
