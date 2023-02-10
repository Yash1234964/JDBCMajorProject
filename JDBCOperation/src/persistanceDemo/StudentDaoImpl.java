package persistanceDemo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dtoDemo.Student;

public class StudentDaoImpl implements IStudentDao {

	Connection connection=null;
	PreparedStatement pstmt=null;
	
	
	@Override
	public String addStudent(String sName, Integer sAge, String sAddress) {
		// TODO Auto-generated method stub
		
		String sqlInsertQuery="insert into student (sname,sage,saddress) values (?,?,?)";
		
		try {
			connection=JDBCUtil.JdbcUtil.getJdbcConnection();
			
			if(connection!=null) {
				pstmt =connection.prepareStatement(sqlInsertQuery);
				
			}
			if(pstmt !=null) {
				pstmt.setString(1,sName);
				pstmt.setInt(2, sAge);
				pstmt.setString(3, sAddress);
				
			}
			int rowAffected=pstmt.executeUpdate();
			if(rowAffected==1) {
				return "success";
			}
			
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "failed";
	}

	@Override
	public Student searchStudent(Integer sid) {
		// TODO Auto-generated method stub
		return null;
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
