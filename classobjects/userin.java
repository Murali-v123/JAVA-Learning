import java.util.Scanner;
public class userin {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Your name:");

        String name=sc.next();
        System.out.println(name);

        System.out.print("Enter Your Age:");
        int age=sc.nextInt();
        System.out.println(age);

        System.out.print("Enter Your Mail id:");
        String email=sc.next();
        System.out.println(email);
        
        sc.close();
    }    
}