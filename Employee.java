
public class Employee {
	int emp_id;
	String name;
	char gender;
	
	Employee(int id, String name, char g){
		this.emp_id = id;
		this.name = name;
		this.gender = g;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	public String toString() {
		String str = "Name : "+ this.name + " Employee_id : " + this.emp_id +" Gender : " +this.gender +"\n ";
		return str;
	}
}
