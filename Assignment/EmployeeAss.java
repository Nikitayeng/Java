package com.demo;

public class EmployeeAss {

int emp_id, salary;  
String name;  

//Getter and setters for getting and setting properties  
public int getEmp_id() {  
  return emp_id;  
}  
public void setEmp_id(int emp_id) {  
  this.emp_id = emp_id;  
}  
public int getSalary() {  
  return salary;  
}  
public void setSalary(int salary) {  
  this.salary = salary;  
}  
public String getName() {  
  return name;  
}  
public void setName(String name) {  
  this.name = name;  
}  
 //Overriding toString() method  
@Override  
public String toString() {  
  return "Employee [emp_id = " + emp_id + ", salary = " + salary + ", name = " + name + "]";  
  }  
     public static void main(String args[]) {  
        
      //Creating object of EmployeeDetails class  
      EmployeeAss emp1 = new EmployeeAss();  
      EmployeeAss emp2 = new EmployeeAss();  
      EmployeeAss emp3 = new EmployeeAss();  
      //Setting values to the properties  
      emp1.setEmp_id(101);  
      emp1.setName("Shri");    
      emp1.setSalary(15000);  
      emp2.setEmp_id(102);  
      emp2.setName("Nishant");    
      emp2.setSalary(20000); 
      emp3.setEmp_id(103);  
      emp3.setName("Nikki");    
      emp3.setSalary(25000);  
      System.out.println("id is:"+emp1.getEmp_id());
      System.out.println("id is:"+emp1.getName());  
      System.out.println("id is:"+emp1.getSalary());
      System.out.println("id is:"+emp2.getEmp_id());
      System.out.println("id is:"+emp2.getName());
      System.out.println("id is:"+emp2.getSalary());
      System.out.println("id is:"+emp3.getEmp_id());
      System.out.println("id is:"+emp3.getName());
      System.out.println("id is:"+emp3.getSalary());
       }  
}  