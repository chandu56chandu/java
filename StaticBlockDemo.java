import java.lang.*;
public class StaticBlockDemo{
    static{
        System.out.println("Inside static block");
    }
    public static void main(String args[]){
        System.out.println("Static block demo");
    }
}
OUTPUT:
Inside static block
Static block demo
