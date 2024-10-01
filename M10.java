class Student{
    private String name;
    private String post;
    public Student(String name,String post) {
        this.name=name;
        this.post=post;
    }
    public String getName(){
        return name;
    }
    public String getPost(){
        return post;
    }
}
class Election{
}
public class M10 {
    public static void main(String[] args){
        System.out.println("Elections");
        
        Student anurag=new Student("Anurag Rao","president");
        Student udupa=new Student("Ramachandra Udupa","Tech Secretary");
        System.out.println(anurag.getName()+" has applied for " +anurag.getPost()+":");
        System.out.println(udupa.getName()+" has applied for " +udupa.getPost()+":");
    }
}

        


        
    
