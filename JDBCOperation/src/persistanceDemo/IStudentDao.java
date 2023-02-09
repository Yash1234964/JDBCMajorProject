package persistanceDemo;


import dtoDemo.Student;
public interface IStudentDao {
	
	
public String addStudent(String sName,Integer sAge,String sAddress);
public Student searchStudent(Integer sid);
}
