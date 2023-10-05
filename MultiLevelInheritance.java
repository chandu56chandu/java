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
class BabyDog extends Dog{
    void weep(){
        System.out.println("Baby Dog can weeping");
    }
}
public class MultiLevelInheritance{  
public static void main(String args[]){  
BabyDog bd=new BabyDog();  
bd.bark();  
bd.eat();  
}
}
OUTPUT:
Dog can bark
Animal can eat
