package persistanceDemo;


import dtoDemo.Student;
public interface IStudentDao {
	
	//Operations implemented
public String addStudent(String sName,Integer sAge,String sAddress);


public Student searchStudent(Integer sid);

public String updateStudent(Integer sid,String sName, Integer sAge,String aAddress);

public String deleteStudent(Integer sid);
}
