import java.util.Random;
public class RandomDemo{
    public static void main(String args[]){
        Random r=new Random();
        int x=r.nextInt(50);
        int y=r.nextInt(100);
        double a=r.nextDouble();
        System.out.println("The random integers are "+x+", "+y);
        System.out.println("The random double value genrate is "+a);
        
    }
}
OUTPUT:
The random integers are 0, 45
The random double value genrate is 0.6276494148047176

OUTPUT:
The random integers are 7, 28
The random double value genrate is 0.3224480736692563
