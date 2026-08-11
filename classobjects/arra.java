class Stud{
    int roll;
    String subject;
    int marks;
}
public class arra{
    public static void main(String[] args) {
        //array declaration
        //jagged array
        // int arr[][]=new int[4][];
        // arr[0]=new int[2];
        // arr[1]=new int[1];
        // arr[2]=new int[4];
        // arr[3]=new int[3];

        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         arr[i][j]=(int)(Math.random()*10);
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // for(int m[]:arr){
        //     for(int g:m){
        //         System.out.print(g + " ");
        //     }
        //     System.out.println();
        // }

        Stud s1=new Stud();
        s1.roll=12;
        s1.subject="Hello";
        s1.marks=78;

        Stud s2=new Stud();
        s2.roll=15;
        s2.subject="world";
        s2.marks=98;

        Stud s3=new Stud();
        s3.roll=10;
        s3.subject="hoy";
        s3.marks=88;

        Stud st[]=new Stud[3];
        st[0]=s1;
        st[1]=s2;
        st[2]=s3;

        for(Stud n : st){
            System.out.println("subject-"+n.subject +":Marks: "+n.marks);
        }
    }
}