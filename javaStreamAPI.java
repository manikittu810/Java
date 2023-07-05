import java.util.stream.Stream;
import java.util.Collections;
import java.util.*;
public class javaStreamAPI {
    public static void main(String args[]) {
     List<Integer > nums=Arrays.asList(4,5,6,7,8,12,34);
    //  Stream<Integer> s1= nums.stream();
    //  Stream<Integer> s2= s1.filter(n->n%2==0);
    //  Stream<Integer> s3=s2.map(n->n*2);
    //  s3.forEach(n->System.out.println(n));
    
    int result =nums.stream().filter(n->n%2==0).map(n->n*2).reduce(0,(c,e)->c+e);
    System.out.println(result);
    }
}
