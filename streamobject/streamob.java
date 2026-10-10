package streamobject;

import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

public class streamob {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,2,3,4,5,7,8,10);
        Stream<Integer> s1=nums.stream();
        Stream<Integer> s2=s1.filter( n-> n%2==0);
        Stream<Integer>s3=s2.map(n-> n*2);
        // s3.forEach(n->System.out.println(n));
        int res=(int) s3.reduce(0,(c,e)->c+e);
        System.out.println(res);
    }
}
