import java.io.*;
public class ArrayDemo2{
    public static void main(String args[]){
        int a[]=new int[5];
        a[0]=11;
         a[1]=22;
          a[2]=33;
           a[3]=44;
            a[4]=55;
            System.out.println("The array elements are");
            for(int i : a)
            {
                System.out.println(i);
            }
    }
}

OUTPUT:
The array elements are
11
22
33
44
55
