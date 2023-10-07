class Animal{  
public void display(){
    System.out.println("I AM AN ANIMAL");
    }  
}  
class Dog extends Animal{  
public void display(){
    System.out.println("I AM A DOG");
    }  
    public void printMessage(){
        display();
        super.display();
    }
}  
public class SuperMethodDemo{
 public static void main(String args[]){
       Dog d=new Dog();  
       d.printMessage();  
}
}
OUTPUT:
I AM A DOG
I AM AN ANIMAL
