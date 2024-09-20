import java.time.LocalDate;
import java.time.Period;
public class StaffModel {
	private String empname,empId,phno,dept,designtn;
	 private int salary,exp;
	 
	
		public StaffModel(String empname, String empId, String phno, String dept, String designtn,
				int salary, int exp) {
			super();
			this.empname = empname;
			this.empId = empId;
			this.phno = phno;
			this.dept = dept;
			this.designtn = designtn;
			this.salary = salary;
			this.exp = exp;
		}

		public String getEmpname() {
			return empname;
		}

		public void setEmpname(String empname) {
			this.empname = empname;
		}

		public String getEmpId() {
			return empId;
		}

		public void setEmpId(String empId) {
			this.empId = empId;
		}

		public String getPhno() {
			return phno;
		}

		public void setPhno(String phno) {
			this.phno = phno;
		}

		public String getDept() {
			return dept;
		}

		public void setDept(String dept) {
			this.dept = dept;
		}

		public String getDesigntn() {
			return designtn;
		}

		public void setDesigntn(String designtn) {
			this.designtn = designtn;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

		public int getexp() {
			return exp;
		}
		public void setexp(int exp)
		{
			this.exp=exp;
		}

		@Override
		public String toString() {
			return "StaffModel [empname=" + empname + ", empId=" + empId + ", phno=" + phno + ", dept=" + dept
					+ ", designtn=" + designtn + ", salary=" + salary + ", exp=" + exp + "]";
		}

							 
	 
	

}
