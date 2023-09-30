import java.io.*;
interface InterphaseLanguage{
    void getName(String Name);
}
class ProgrammingLanguage {
     void getName(String Name){
        System.out.println("My favouriate programming Language is " +Name);
    }
}
public class InterphaseDemo{
    public static void main(String args[]){
        ProgrammingLanguage pl=new ProgrammingLanguage();
        pl.getName("JAVA");
    }
}
OUTPUT:
My favouriate programming Language is JAVA
