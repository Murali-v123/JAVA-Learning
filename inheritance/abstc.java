package inheritance;

// abstract class A 
// {
// abstract public void show();
// }

// inner class example
class A{
    public void config(){
        System.out.println("this is config method");
    }
    class B{
        public void show(){
            System.out.println("This is implemented using abstract class and abstract method");
        }
    }
}
public class abstc {
    public static void main(String[] args) {
        A obj= new A()
        {
            public void config(){
                System.out.println("Hello world");
            }
        };
        obj.config();
        // inner class object implementation
        A.B obj1=obj.new B();
        obj1.show();
    }
}
