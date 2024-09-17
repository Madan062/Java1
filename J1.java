import java.util.List;
import java.util.ArrayList;
public class J1{
   public static void main(String[] args){
     List<Integer>list1=new ArrayList<>();
     int n1=8;
     int n2=4;
     int sum1=n1+n2;
     int sub1=n1-n2;
     int prod1=n1*n2;
     int div1=n1/n2;
     System.out.println(sum1 +" "+ sub1 +" "+ prod1 +" "+div1);
     list1.add(sum1);
     list1.add(sub1);
     System.out.println(list1.get(1));
   }
 } 