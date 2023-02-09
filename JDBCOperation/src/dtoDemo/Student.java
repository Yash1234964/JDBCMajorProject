package dtoDemo;

public class Student {

	
	Integer sid;
	String sName;
	Integer sAge;
	String sAddress;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Integer getsAge() {
		return sAge;
	}
	public void setsAge(Integer sAge) {
		this.sAge = sAge;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student[sid ="+sid+",sName ="+sName+",sAge ="+sAge+",sAddress ="+sAddress+"]";
	}
	
	
	
	
}
