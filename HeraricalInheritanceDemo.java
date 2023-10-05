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
class Cat extends Animal{
    void mewo(){
        System.out.println("cat sounds mewo");
    }
}
public class HeraricalInheritance{  
public static void main(String args[]){  
Dog d=new Dog(); 
Cat c=new Cat();
d.bark();  
d.eat();
c.mewo();
}
}
OUTPUT:
Dog can bark
Animal can eat
cat sounds mewo
