package Interface;
/**
 * enum
 */
// funtional interface or single abstract method
// @FunctionalInterface
// interface B{
//     int show(int i,int j);
// }
// class C{
//     public void show(){

//     }
// }

// class D extends C{
//     // using annotations
//     @Override
//     public void show(){

//     }
// }

// class Myexce extends Exception{
//     public Myexce(String str){
//         super(str);
//     }
// }

// example of throws
class A {
    public void show() throws Exception {
        System.out.println("Hello world");
        Class.forName("calc");
    }
}

public class implementinginterface {
    public static void main(String a[]){
        A obj=new A();
        try {
            obj.show();
        } catch (Exception e) {
            System.out.println(e);
        }
        // int i=2;
        // int j=0;
        // // int arr[]=new int[4];
        // try {
        //     // j=18/i;
        //     // System.out.println(arr[10]);
        //     if(j==0){
        //         throw new Myexce("this is the error for making j as 0");
        //     }
        // } 
        // catch (Myexce e) {
        //     System.out.println("this is my own exception"+e);
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        // System.out.println(j);
        // with lambda expression if we only one expression to execute
        // B obj=(i,j) -> i+j;
        // // B obj=(i,j) -> {
        // //     return i+j;
        // // };
        // int d=obj.show(3,100);
        // System.out.println(d);

        // without lambda expression 
        // B obj1=new B() {
        //     public int show(int i,int j){
        //         return i+j;
        //     }
        // };
    }
}
