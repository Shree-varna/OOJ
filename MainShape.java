import java.util.Scanner;
 class inputscanner {
    Scanner s = new Scanner(System.in); 
}
abstract class Shape extends inputscanner{
    double a;
    double b;
    abstract void getinput();
    abstract void displayarea();
}
class rectangle extends Shape{
    public void getinput(){
        System.out.println("enter the value of a,b of rectangle: ");
        a=s.nextInt();
        b=s.nextInt();
    }
    public void displayarea(){
        System.out.println("the area of rectangle:"+a*b);
    }
}
class triangle extends Shape {
    public void getinput(){
        System.out.println("enter the value of a,b of triangle: ");
        a=s.nextInt();
        b=s.nextInt();
    }
    public void displayarea(){
        System.out.println("the area of triangle:"+ 0.5*(a*b));
    }

}
class circle extends Shape {
public void getinput(){
        System.out.println("enter the value of a of circle(radius): ");
        a=s.nextInt();
    }
    public void displayarea(){
        System.out.println("the area of rectangle:"+3.14*a*a);
    }
    
}


public class MainShape{
    public static void main(String[] args) {
        rectangle i=new rectangle();
        triangle t=new triangle();
        circle c=new circle();
        i.getinput();
        i.displayarea();
        t.getinput();
        t.displayarea();
        c.getinput();
        c.displayarea();
    }
    
}
