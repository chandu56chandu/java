class Animal{  
void eat(){
    System.out.println("Animal can eat");
    }  
}  
class Dog extends Animal{  
void bark(){
    System.out.println("Dog can bark");
    }  
}  
public class SingleInheritance{  
public static void main(String args[]){  
Dog d=new Dog();  
d.bark();  
d.eat();  
}
}
OUTPUT:
Dog can bark
Animal can eat
