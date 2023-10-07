import java.io.*;
class A{
    void display(){
        System.out.println("Class A");
    }
}
class B{
    void display(){
        System.out.println("Class B");
    }
}
class C extends A,B {
    void display(){
        System.out.println("Class c");
    }
}
public class MultipleDemo{
    public static void main(String args[]){
        C c=new C();
        c.display();
    }
}
OUTPUT:
compiletime error line:11
