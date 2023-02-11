package persistanceDemo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dtoDemo.Student;

public class StudentDaoImpl implements IStudentDao {

	Connection connection=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
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
		
String sqlSearchQuery="select sid,sname,sage,saddress from student where sid=?";
Student student=null;
		try {
			connection=JDBCUtil.JdbcUtil.getJdbcConnection();
			
			if(connection!=null) {
				pstmt =connection.prepareStatement(sqlSearchQuery);
				
			}
			if(pstmt !=null) {
				pstmt.setInt(1, sid);
				rs=pstmt.executeQuery();
			}
		   
			
			
			if(rs!=null) {
				
				if(rs.next()) {
				student=new Student();
				student.setSid(rs.getInt(1));
				student.setsName(rs.getString(2));
				student.setsAge(rs.getInt(3));
				student.setsAddress(rs.getString(4));
				
			}
			}
			return student;
			
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return student;
	}

	@Override
	public String updateStudent(Integer sid, String sName, Integer sAge, String sAddress) {
String sqlUpdateQuery="update student set sname=? ,sage=?,saddress=? where sid=?";
		
		try {
			connection=JDBCUtil.JdbcUtil.getJdbcConnection();
			
			if(connection!=null) {
				pstmt =connection.prepareStatement(sqlUpdateQuery);
				
			}
			if(pstmt !=null) {
				pstmt.setString(1,sName);
				pstmt.setInt(2, sAge);
				pstmt.setString(3, sAddress);
				pstmt.setInt(4, sid);
				
			}
			int rowAffected=pstmt.executeUpdate();
			if(rowAffected==1) {
				return "success";
			}
			else {
				return "not found";
			}
			
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "failed";
	}

	@Override
	public String deleteStudent(Integer sid) {
String sqlDeleteQuery="delete from student where sid=?";
		
		try {
			connection=JDBCUtil.JdbcUtil.getJdbcConnection();
			
			if(connection!=null) {
				pstmt =connection.prepareStatement(sqlDeleteQuery);
				
			}
			if(pstmt !=null) {
				pstmt.setInt(1,sid);
				
				
			}
			int rowAffected=pstmt.executeUpdate();
			if(rowAffected==1) {
				return "success";
			}else return "not found";
			
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "failed";
	}

}
