
import java.util.Scanner;

public class StaffMain {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      StaffModel ob[]=new StaffModel[10];

      System.out.println("Enter the number of employees : ");
      int n=sc.nextInt();
      for(int i=0;i<n;i++)
      {
    	  System.out.println("Enter the employee name: ");
    	  String empName=sc.next();
    	  System.out.println("Enter the employee Id: ");
    	  String empId=sc.next();
    	  System.out.println("Enter the employee phone number: ");
    	  String phno=sc.next();
    	  System.out.println("Enter the employee dept: ");
    	  String dept=sc.next();
    	  System.out.println("Enter the employee designation: ");
    	  String designtn=sc.next();
    	  System.out.println("Enter the employee salary: ");
    	  int salary=sc.nextInt();
    	  System.out.println("Enter the experience : ");
    	  int exp=sc.nextInt();
    	  ob[i]= new StaffModel(empName,empId,phno,dept,designtn,salary,exp);
      
	}
      for(int i=0;i<n;i++)
      {
    	  System.out.println(ob[i]);
      }
      int ch;
      do {
      System.out.println("1.Filter base on department");
      System.out.println("2.Filter based on salary");
      System.out.println("3.Filter based on Designation");
      System.out.println("4.Filter based on experience ");
      System.out.println("5.Exit");
      System.out.println("Enter the choice");
        ch=sc.nextInt();
     switch(ch)
      {
    case 1:System.out.println("Enter the department:");
          String s=sc.next();
          for(int i=0;i<n;i++)
          {

    	if(ob[i].getDept().equalsIgnoreCase(s))
          {
    	System.out.println(ob[i].getEmpname()+" "+ob[i].getDept()+" "+ob[i].getEmpId()+" "+ob[i].getDesigntn()+" "+ob[i].getSalary()+" "+ob[i].getexp()+" ");
          }
          }
    	break;
    case 2:
    	System.out.println("Enter the salary:");
        int  num=sc.nextInt();
        for(int i=0;i<n;i++)
        {

  	if(ob[i].getSalary()==num)
     {
  	System.out.println(ob[i].getEmpname()+" "+ob[i].getDept()+" "+ob[i].getEmpId()+" "+ob[i].getDesigntn()+" "+ob[i].getSalary());
     }
        }
  	break;
    case 3:System.out.println("Enter the Designation:");
    String str=sc.next();
    for(int i=0;i<n;i++)
    {

	if(ob[i].getDesigntn().equalsIgnoreCase(str))
    {
	System.out.println(ob[i].getEmpname()+" "+ob[i].getDept()+" "+ob[i].getEmpId()+" "+ob[i].getDesigntn()+" "+ob[i].getSalary());
    }
    }
	break;
    case 4:System.out.println("Enter the Experience:");
    int  e=sc.nextInt();
    for(int i=0;i<n;i++)
    {while(ch<5)
    {


	if(ob[i].getexp()==e)
    {
	System.out.println(ob[i].getEmpname()+" "+ob[i].getDept()+" "+ob[i].getEmpId()+" "+ob[i].getDesigntn()+" "+ob[i].getSalary());
    }
    }
	break;
      }
      }
      }
     while(ch<5);
       
	
}}