
package oopj1;
public class StaticExample {
    static int counter=0;
    public StaticExample(){
        counter++;
        
    }
    public static void main(String[] args){
        new StaticExample();
        new StaticExample();
        new StaticExample();
        System.out.println("counter:"+counter);
    }
    
}
