import java.lang.*;
public class Calculate{
    static int cube(int x)
    {
        return x*x*x;
    }
    public static void main(String args[]){
        int result=Calculate.cube(5);
        System.out.println("Cube of 5 is " +result);
    }
}

OUTPUT:
Cube of 5 is 125
