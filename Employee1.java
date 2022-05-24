class  Employee{
int empid;
String name;
double salary;
String address;
Employee(int id,String nm,double sal,String add){
empid=id;
name=nm;
salary=sal;
address=add;
}
}

class Teacher extends Employee{
String department;
String subject1;
String subject2;
Teacher(int id,String nm,double sal,String add,String dept,String sub1,String sub2){
super(id,nm,sal,add);
department=dept;
subject1=sub1;
subject2=sub2;
}

void display(){
	System.out.println("Employee Deatails Are");
	System.out.println("---------------------");
System.out.println("Employee id       : "+ empid);
System.out.println("Employee name     : "+ name);
System.out.println("Employee salary   : "+ salary);
System.out.println("Employee address  : "+ address);
System.out.println("Teacher department: "+ department);
System.out.println("Subject taught    : "+ subject1);
System.out.println("Subject taught    : "+ subject2);

}
}

public class Employee1{
public static void main(String args[]){
Teacher obj[]=new Teacher[2];
obj[0]=new Teacher(101,"Amal Gopalan",15000.0,"Nedumkandam","Computer Science","Java","DBMS");
obj[0].display();
obj[1]=new Teacher(102,"Arun Ramendran",18000.0,"Kattappana","Physics","BSC Physics","Quantam Physics");
obj[1].display();

}
}
