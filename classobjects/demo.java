class calculator { 

    public int add(int m1, int m2) { 
        int r = m1 + m2; 
        return r; 
    }
    // method overloading
    public float add(int a,float b){
        return a+b;
    }
    public float add(float a,float b,int c){
        return a+b+c;
    }
    public int sub(int num1,int num2){
        int s=num1-num2;
        return s;
    }
    public int mul(int num1,int num2){
        int s=num1*num2;
        return s;
    }
    public float del(int num1,int num2){
        float s=(float)num1/num2;
        return s;
    }

    public void hello(){
        System.out.println("You just called a method without return type");
    }
} 

public class demo { 
    public static void main(String args[]) { 
        int m1 =26; 
        int m2 = 5; 
        
        calculator cal = new calculator(); 
        
        int result = cal.add(m1, m2); 
        float add1=cal.add(1,2,3);
        cal.hello();
        // int result1 = cal.sub(m1, m2);
        // int result2 = cal.mul(m1, m2);
        // float result3 = cal.del(m1, m2);
        System.out.println("The calculated sum is: " + result); 
        System.out.println("The calculated sum is: " + add1); 

        // System.out.println("The calculated sub is: " + result1);
        // System.out.println("The calculated mul is: " + result2);
        // System.out.println("The calculated div is: " + result3);
    } 
}
