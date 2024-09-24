class shape{
    public void draw(){
        System.out.println("Drawing a shape");}
    public void erase(){
        System.out.println("Erasing a shape");}}
class Circle extends shape{
    public void draw(){
        System.out.println("Drawing a circle");}
    public void erase(){
        System.out.println("EWrasing a circle");}}
class Triangle extends shape{
    public void draw(){
        System.out.println("Drawing a triangle");}
    public void erase(){
        System.out.println("Erasing a triangle");}}
class Square extends shape{
    public void draw(){
        System.out.println("Drawing a square");}
    public void erase(){
        System.out.println("Erasing a square");}}
public class M4{
    public static void main(String[] args){
        shape[] shapes=new shape[3];
        shapes[0]=new Circle();
        shapes[1]=new Triangle();
        shapes[2]=new Square();
        for(int i=0;i<shapes.length;i++){
            shapes[i].draw();
            shapes[i].erase();
            System.out.println("_ _ _ _ _ _ _ _ _ _ ");}
        }
}