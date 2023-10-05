import java.io.*;
class Employee{
    float salary=40000;
}
public class Programmer extends Employee{
    int bonus=10000;
   public static void main(String args[]){
        Programmer p=new Programmer();
         System.out.println("Salary of the Programmer is " +p.salary);
         System.out.println("Bonus of the Programmer is " +p.bonus);
         float grosssalary=p.salary+p.bonus;
          System.out.println("Total salary of the Programmer is " +grosssalary);
    }
}
OUTPUT:
Salary of the Programmer is 40000.0
Bonus of the Programmer is 10000
Total salary of the Programmer is 50000.0
