package inheritance;

class A{
    final int age=18;
    public void show(){
        System.out.println("hello");
    }
}

class B extends A{
    public void show(){
        System.out.println("world");
    }
    public void show1(){
        System.out.println("hello world");
    }
}

class C{
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public float add(float n1,int n2){
        return n1+n2;
    }
}
public class polymorphism {
    public static void main(String[] args) {

        // run time polymorphism
        // A obj=new A();
        // obj.show();
        A obj=new B();
        obj.show();

        //the final keyword value
        System.out.println(obj.age);

        // compile time polymorphism
        // C obj1=new C();
        // System.out.println(obj1.add(5,3));
        // System.out.println(obj1.add(5,3,5));
        // System.out.println(obj1.add(2.2f, 2));
    }
}
