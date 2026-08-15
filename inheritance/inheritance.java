package inheritance;

class calc{
    public int add(int n,int m){
        return n+m;
    }
    public int sub(int n,int m){
        return n-m;
    }
}
class avdcal extends calc{
    public int mul(int n,int m){
        return n*m;
    }
    public float div(int n,int m){
        return n/m;
    }
}

class advvcal extends avdcal{
    public float modl(int n,int m){
        return n%m;
    }
}

public class inheritance {
    public static void main(String args[]) {
        advvcal obj=new advvcal();
        int n1=obj.add(3,5);
        int n2=obj.sub(3,5);
        int n3=obj.mul(3,5);
        float n4=obj.div(31,5);
        float n5=obj.modl(31,5);
        System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5);
    }
}
