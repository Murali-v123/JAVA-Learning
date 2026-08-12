package gettersandsetters;

class Human{
    int age;
    static String name;

    static
    {
        System.out.println("hello world");
    }

    // public Human() {
    // }

    // public Human(int age,String name) {
    //     this.name = name;
    //     this.age=age;
    // }

    // public void show(){
    //     System.out.println(name+":"+age);
    // }

    // public int getAge() {
    //     return age;
    // }
    // public void setAge(int age) {
    //     this.age = age;
    // }
    // public String getName() {
    //     return name;
    // }
    // public void setName(String name) {
    //     this.name = name;
    // }
}

public class gettersetter {
    public static void main(String args[]) {
        // ''without creating any object we can call static method using following syntax''
        // try {
        //     Class.forName("gettersandsetters.Human");
        // } catch (ClassNotFoundException e) {
        //     e.printStackTrace();
        // }
        // Human obj=new Human();
    
        // Human obj=new Human(12,"Murali");
        // obj.show();
        // obj.setAge(12);
        // obj.setName("Murali");
        // obj.setAge(16);
        // obj1.setName("gani");
        // System.out.println(obj.getName()+":-"+obj.getAge());
        // System.out.println(obj1.getName()+":-"+obj1.getAge());

        // obj.age=12;
        // Human.name="murali";

        // Human obj1=new Human();
        // obj1.age=13;
        // Human.name="gani";

        
        // obj.show();
        // obj1.show();

    }
}
